/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.util.ArrayList;
import java.util.regex.*;

/**
 *
 * @author M.Ahsan
 */
public class DFA {
 public int numberofstates;

    public ArrayList<ArrayList<node>> transitiontable;
    public int initialstate;
    public ArrayList<Integer> finalstate;
    public ArrayList<String> validstr;

    public DFA(int nofstates, int is, ArrayList<Integer> fs, ArrayList<ArrayList<node>> tt, ArrayList<String> valid_String) {
        //number of states
        this.numberofstates = nofstates;

        //setting initial states
        this.initialstate = is;
        //setting final states
        this.finalstate = new ArrayList<>();

        this.transitiontable = new ArrayList<>();
        for (int i = 0; i < this.numberofstates; i++) {
            this.transitiontable.add(new ArrayList<>());
        }
        this.finalstate = fs;
        this.transitiontable = tt;
        this.validstr = new ArrayList<>();
        this.validstr = valid_String;
    }

    DFA() {
       this.numberofstates = 1;

        //setting initial states
        this.initialstate = 0;
        //setting final states
        this.finalstate = new ArrayList<>();

        this.transitiontable = new ArrayList<>();
        for (int i = 0; i < this.numberofstates; i++) {
            this.transitiontable.add(new ArrayList<>());
        }
        this.finalstate.add(1);
      
        this.validstr = new ArrayList<>();
        this.validstr.add("a");
    }

//    public void settt(int[][] transition) {
//        this.transitiontable = transition;
//    }
//
//    public int[][] gettt() {
//        return this.transitiontable;
//    }
    public boolean validate(String input) {
        int current = this.initialstate;

        Pattern anychar = Pattern.compile("(.)*");

        for (int i = 0; i < input.length(); i++) {
            Matcher anychar_m;
            anychar_m = anychar.matcher(String.valueOf(input.charAt(i)));
            if (this.compare_with_validstr(String.valueOf(input.charAt(i)))) {
                current = this.transition(current, String.valueOf(input.charAt(i)));
            } else if (anychar_m.matches()) {
                current = this.transition(current, String.valueOf(input.charAt(i)));
            }else{
                System.out.println("In-valid Input");
                return false;
            }
            if (current==-1) {
                return false;
            }
        }
        if (this.compare_with_finalstates(current)) {
            return true;
        } else {
            return false;
        }

    }

    public int transition(int st, String str) {

        for (int j = 0; j < this.transitiontable.get(st).size(); j++) {
            if (this.transitiontable.get(st).get(j).getstr().equals(str)) {
                return this.transitiontable.get(st).get(j).getstate();
            }

        }
        return -1;
    }

    public boolean compare_with_finalstates(int st) {
        for (int i = 0; i < finalstate.size(); i++) {
            if (finalstate.get(i) == st) {
                return true;
            }
        }
        return false;
    }

    public boolean compare_with_validstr(String str) {
        for (int i = 0; i < this.validstr.size(); i++) {
            if (this.validstr.get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

};
