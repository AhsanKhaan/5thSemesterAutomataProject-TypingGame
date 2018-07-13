/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.util.ArrayList;

/**
 *
 * @author Ahsan khan
 */
public class playerdata {

    private ArrayList<object> datalist;
    private Dfalist fa;
    private int score;
    
    

    public playerdata() {
        this.datalist = new ArrayList<>();

    }

    public void setlist(ArrayList al) {
        this.datalist = al;
    }

    public ArrayList<object> getlist() {
        return this.datalist;
    }
    public void setfa(Dfalist finiteautomata){
    this.fa=finiteautomata;
    }
    public Dfalist getfalist(){
    return this.fa;
    }
    public void setscore(int sc){
    this.score=sc;
    }
    public int getscore(){
    return this.score;
    }
   
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < datalist.size(); i++) {
            result += "(" + this.datalist.get(i).getname() + "," + this.datalist.get(i).getscore() + ")\n";
        }
        return result;
    }
};
