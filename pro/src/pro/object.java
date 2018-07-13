/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

/**
 *
 * @author Ahsan khan
 */
class object {

    private String name;

    private int score;

    public object() {
        this.name = "a";
        
        this.score = 0;
    }

    public object( String str_name) {
        this.name = str_name;
        
        this.score = 0;
    }

    public object( String str_name, int int_score) {
        this.name = str_name;
        
        this.score = int_score;
    }

    public void setname(String str_name) {
        this.name = str_name;
    }



    public void setscore(int int_score) {
        this.score = int_score;
    }

    public String getname() {
        return this.name;
    }

    public String showscore(){
        String str="";
        str+=this.score;
        return str;
    }
    public String showname(){
    String str="";
    str+=this.name;
    return str;
    }

    public int getscore() {
        return this.score;
    }
public void show(){
    System.out.println("Player details:("+this.name+","+this.score+")");
}
@Override
public String toString(){
String detail="";
detail+="player_detail("+this.name+","+this.score+")";
return detail;}
};
