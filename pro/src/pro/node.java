/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;
import java.util.ArrayList;
/**
 *
 * @author M.Ahsan
 */
public class node {

    private String validchar;
    private int state;



    public node(int transition, String value) {
     
        this.validchar= value;
        this.state = transition;
    }

    public void setstate(int state) {
        this.state = state;
    }

    public int getstate() {
        return this.state;
    }

    public void setString(String str) {
        this.validchar = str;
    }

    public String getstr() {
        return this.validchar;
    }
    @Override
    public String toString(){
        String result = "";
        result+="("+this.getstate()+","+this.getstr()+")";
    return result;
    }
};
