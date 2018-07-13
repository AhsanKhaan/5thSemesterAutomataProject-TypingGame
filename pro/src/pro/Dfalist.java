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
public class Dfalist {

    private ArrayList<dfaobj> dfalist;

    public Dfalist() {
        this.dfalist = new ArrayList<>();
        this.setDfalist();
    }

    public void setdfalist(ArrayList<dfaobj> fa) {
        this.dfalist = fa;
    }

    public ArrayList<dfaobj> getdfalist() {
        return this.dfalist;
    }

    public void setDfalist() {
        ArrayList<Integer> final_st0 = new ArrayList<>();
        ArrayList<String> valid_str0 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt0 = new ArrayList<>();
        final_st0.add(3);
        valid_str0.add("S");
        valid_str0.add("Q");
        valid_str0.add("L");

        for (int i = 0; i <= 4; i++) {
            tt0.add(new ArrayList<>());
        }
        //SQL
        tt0.get(0).add(new node(1, "S"));
        tt0.get(0).add(new node(4, "(.)*"));
        tt0.get(1).add(new node(2, "Q"));
        tt0.get(1).add(new node(4, "(.)*"));
        tt0.get(2).add(new node(3, "L"));
        tt0.get(2).add(new node(4, "(.)*"));
        tt0.get(3).add(new node(4, "(.)*"));
        tt0.get(4).add(new node(4, "(.)*"));
        DFA f0 = new DFA(5, 0, final_st0, tt0, valid_str0);
        this.dfalist.add(new dfaobj("SQL", f0));
        //Mac
        ArrayList<Integer> final_st1 = new ArrayList<>();
        ArrayList<String> valid_str1 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt1 = new ArrayList<>();

        valid_str1.add("M");
        valid_str1.add("a");
        valid_str1.add("c");
        final_st1.add(3);
        for (int i = 0; i <= 4; i++) {
            tt1.add(new ArrayList<>());
        }
        tt1.get(0).add(new node(1, "M"));
        tt1.get(0).add(new node(4, "(.)*"));
        tt1.get(1).add(new node(2, "a"));
        tt1.get(1).add(new node(4, "(.)*"));
        tt1.get(2).add(new node(3, "c"));
        tt1.get(2).add(new node(4, "(.)*"));
        tt1.get(3).add(new node(4, "(.)*"));
        tt1.get(4).add(new node(4, "(.)*"));
        DFA f1 = new DFA(5, 0, final_st1, tt1, valid_str1);
        this.dfalist.add(new dfaobj("Mac", f1));

        ArrayList<Integer> final_st2 = new ArrayList<>();
        ArrayList<String> valid_str2 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt2 = new ArrayList<>();

        valid_str2.add("J");
        valid_str2.add("a");
        valid_str2.add("v");
        valid_str2.add("a");
        final_st2.add(4);
        for (int i = 0; i <= 5; i++) {
            tt2.add(new ArrayList<>());
        }
        tt2.get(0).add(new node(1, "J"));
        tt2.get(0).add(new node(5, "(.)*"));
        tt2.get(1).add(new node(2, "a"));
        tt2.get(1).add(new node(5, "(.)*"));
        tt2.get(2).add(new node(3, "v"));
        tt2.get(2).add(new node(5, "(.)*"));
        tt2.get(3).add(new node(4, "a"));
        tt2.get(3).add(new node(5, "(.)*"));
        tt2.get(4).add(new node(5, "(.)*"));
        tt2.get(5).add(new node(5, "(.)*"));

        DFA f2 = new DFA(6, 0, final_st2, tt2, valid_str2);
        this.dfalist.add(new dfaobj("Java", f2));

        ArrayList<Integer> final_st3 = new ArrayList<>();
        ArrayList<String> valid_str3 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt3 = new ArrayList<>();

        valid_str3.add("R");
        valid_str3.add("u");
        valid_str3.add("b");
        valid_str3.add("y");
        final_st3.add(4);
        for (int i = 0; i <= 5; i++) {
            tt3.add(new ArrayList<>());
        }
        tt3.get(0).add(new node(1, "R"));
        tt3.get(0).add(new node(5, "(.)*"));
        tt3.get(1).add(new node(2, "u"));
        tt3.get(1).add(new node(5, "(.)*"));
        tt3.get(2).add(new node(3, "b"));
        tt3.get(2).add(new node(5, "(.)*"));
        tt3.get(3).add(new node(4, "y"));
        tt3.get(3).add(new node(5, "(.)*"));
        tt3.get(4).add(new node(5, "(.)*"));
        tt3.get(5).add(new node(5, "(.)*"));

        DFA f3 = new DFA(6, 0, final_st3, tt3, valid_str3);
        this.dfalist.add(new dfaobj("Ruby", f3));

        ArrayList<Integer> final_st4 = new ArrayList<>();
        ArrayList<String> valid_str4 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt4 = new ArrayList<>();

        valid_str4.add("P");
        valid_str4.add("e");
        valid_str4.add("r");
        valid_str4.add("l");
        final_st4.add(4);
        for (int i = 0; i <= 5; i++) {
            tt4.add(new ArrayList<>());
        }
        tt4.get(0).add(new node(1, "P"));
        tt4.get(0).add(new node(5, "(.)*"));
        tt4.get(1).add(new node(2, "e"));
        tt4.get(1).add(new node(5, "(.)*"));
        tt4.get(2).add(new node(3, "r"));
        tt4.get(2).add(new node(5, "(.)*"));
        tt4.get(3).add(new node(4, "l"));
        tt4.get(3).add(new node(5, "(.)*"));
        tt4.get(4).add(new node(5, "(.)*"));
        tt4.get(5).add(new node(5, "(.)*"));

        DFA f4 = new DFA(6, 0, final_st4, tt4, valid_str4);
        this.dfalist.add(new dfaobj("Perl", f4));

        ArrayList<Integer> final_st5 = new ArrayList<>();
        ArrayList<String> valid_str5 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt5 = new ArrayList<>();

        valid_str5.add("e");
        valid_str5.add("n");
        valid_str5.add("u");
        valid_str5.add("m");
        final_st5.add(4);
        for (int i = 0; i <= 5; i++) {
            tt5.add(new ArrayList<>());
        }
        tt5.get(0).add(new node(1, "e"));
        tt5.get(0).add(new node(5, "(.)*"));
        tt5.get(1).add(new node(2, "n"));
        tt5.get(1).add(new node(5, "(.)*"));
        tt5.get(2).add(new node(3, "u"));
        tt5.get(2).add(new node(5, "(.)*"));
        tt5.get(3).add(new node(4, "m"));
        tt5.get(3).add(new node(5, "(.)*"));
        tt5.get(4).add(new node(5, "(.)*"));
        tt5.get(5).add(new node(5, "(.)*"));

        DFA f5 = new DFA(6, 0, final_st5, tt5, valid_str5);
        this.dfalist.add(new dfaobj("enum", f5));
        ArrayList<Integer> final_st6 = new ArrayList<>();
        ArrayList<String> valid_str6 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt6 = new ArrayList<>();

        valid_str6.add("D");
        valid_str6.add("a");
        valid_str6.add("t");
        valid_str6.add("a");
        final_st6.add(4);
        for (int i = 0; i <= 5; i++) {
            tt6.add(new ArrayList<>());
        }
        tt6.get(0).add(new node(1, "D"));
        tt6.get(0).add(new node(5, "(.)*"));
        tt6.get(1).add(new node(2, "a"));
        tt6.get(1).add(new node(5, "(.)*"));
        tt6.get(2).add(new node(3, "t"));
        tt6.get(2).add(new node(5, "(.)*"));
        tt6.get(3).add(new node(4, "a"));
        tt6.get(3).add(new node(5, "(.)*"));
        tt6.get(4).add(new node(5, "(.)*"));
        tt6.get(5).add(new node(5, "(.)*"));

        DFA f6 = new DFA(6, 0, final_st6, tt6, valid_str6);
        this.dfalist.add(new dfaobj("Data", f6));

        ArrayList<Integer> final_st7 = new ArrayList<>();
        ArrayList<String> valid_str7 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt7 = new ArrayList<>();

        valid_str7.add("L");
        valid_str7.add("i");
        valid_str7.add("s");
        valid_str7.add("t");
        final_st7.add(4);
        for (int i = 0; i <= 5; i++) {
            tt7.add(new ArrayList<>());
        }
        tt7.get(0).add(new node(1, "L"));
        tt7.get(0).add(new node(5, "(.)*"));
        tt7.get(1).add(new node(2, "i"));
        tt7.get(1).add(new node(5, "(.)*"));
        tt7.get(2).add(new node(3, "s"));
        tt7.get(2).add(new node(5, "(.)*"));
        tt7.get(3).add(new node(4, "t"));
        tt7.get(3).add(new node(5, "(.)*"));
        tt7.get(4).add(new node(5, "(.)*"));
        tt7.get(5).add(new node(5, "(.)*"));

        DFA f7 = new DFA(6, 0, final_st7, tt7, valid_str7);
        this.dfalist.add(new dfaobj("List", f7));

        ArrayList<Integer> final_st8 = new ArrayList<>();
        ArrayList<String> valid_str8 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt8 = new ArrayList<>();

        valid_str8.add("L");
        valid_str8.add("i");
        valid_str8.add("n");
        valid_str8.add("u");
        valid_str8.add("x");
        final_st8.add(5);
        for (int i = 0; i <= 6; i++) {
            tt8.add(new ArrayList<>());
        }
        tt8.get(0).add(new node(1, "L"));
        tt8.get(0).add(new node(6, "(.)*"));
        tt8.get(1).add(new node(2, "i"));
        tt8.get(1).add(new node(6, "(.)*"));
        tt8.get(2).add(new node(3, "n"));
        tt8.get(2).add(new node(6, "(.)*"));
        tt8.get(3).add(new node(4, "u"));
        tt8.get(3).add(new node(6, "(.)*"));
        tt8.get(4).add(new node(5, "x"));
        tt8.get(4).add(new node(6, "(.)*"));
        tt8.get(5).add(new node(6, "(.)*"));
        tt8.get(6).add(new node(6, "(.)*"));

        DFA f8 = new DFA(7, 0, final_st8, tt8, valid_str8);
        this.dfalist.add(new dfaobj("Linux", f8));

        ArrayList<Integer> final_st9 = new ArrayList<>();
        ArrayList<String> valid_str9 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt9 = new ArrayList<>();

        valid_str9.add("f");
        valid_str9.add("l");
        valid_str9.add("o");
        valid_str9.add("a");
        valid_str9.add("t");
        final_st9.add(5);
        for (int i = 0; i <= 6; i++) {
            tt9.add(new ArrayList<>());
        }
        tt9.get(0).add(new node(1, "f"));
        tt9.get(0).add(new node(6, "(.)*"));
        tt9.get(1).add(new node(2, "l"));
        tt9.get(1).add(new node(6, "(.)*"));
        tt9.get(2).add(new node(3, "o"));
        tt9.get(2).add(new node(6, "(.)*"));
        tt9.get(3).add(new node(4, "a"));
        tt9.get(3).add(new node(6, "(.)*"));
        tt9.get(4).add(new node(5, "t"));
        tt9.get(4).add(new node(6, "(.)*"));
        tt9.get(5).add(new node(6, "(.)*"));
        tt9.get(6).add(new node(6, "(.)*"));

        DFA f9 = new DFA(7, 0, final_st9, tt9, valid_str9);
        this.dfalist.add(new dfaobj("float", f9));

        ArrayList<Integer> final_st10 = new ArrayList<>();
        ArrayList<String> valid_str10 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt10 = new ArrayList<>();

        valid_str10.add("s");
        valid_str10.add("h");
        valid_str10.add("o");
        valid_str10.add("r");
        valid_str10.add("t");
        final_st10.add(5);
        for (int i = 0; i <= 6; i++) {
            tt10.add(new ArrayList<>());
        }
        tt10.get(0).add(new node(1, "s"));
        tt10.get(0).add(new node(6, "(.)*"));
        tt10.get(1).add(new node(2, "h"));
        tt10.get(1).add(new node(6, "(.)*"));
        tt10.get(2).add(new node(3, "o"));
        tt10.get(2).add(new node(6, "(.)*"));
        tt10.get(3).add(new node(4, "r"));
        tt10.get(3).add(new node(6, "(.)*"));
        tt10.get(4).add(new node(5, "t"));
        tt10.get(4).add(new node(6, "(.)*"));
        tt10.get(5).add(new node(6, "(.)*"));
        tt10.get(6).add(new node(6, "(.)*"));

        DFA f10 = new DFA(7, 0, final_st10, tt10, valid_str10);
        this.dfalist.add(new dfaobj("short", f10));

        ArrayList<Integer> final_st11 = new ArrayList<>();
        ArrayList<String> valid_str11 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt11 = new ArrayList<>();

        valid_str11.add("P");
        valid_str11.add("y");
        valid_str11.add("t");
        valid_str11.add("h");
        valid_str11.add("o");
        valid_str11.add("n");
        final_st11.add(6);
        for (int i = 0; i <= 7; i++) {
            tt11.add(new ArrayList<>());
        }
        tt11.get(0).add(new node(1, "P"));
        tt11.get(0).add(new node(7, "(.)*"));
        tt11.get(1).add(new node(2, "y"));
        tt11.get(1).add(new node(7, "(.)*"));
        tt11.get(2).add(new node(3, "t"));
        tt11.get(2).add(new node(7, "(.)*"));
        tt11.get(3).add(new node(4, "h"));
        tt11.get(3).add(new node(7, "(.)*"));
        tt11.get(4).add(new node(5, "o"));
        tt11.get(4).add(new node(7, "(.)*"));
        tt11.get(5).add(new node(6, "n"));
        tt11.get(5).add(new node(7, "(.)*"));
        tt11.get(6).add(new node(7, "(.)*"));
        tt11.get(7).add(new node(7, "(.)*"));

        DFA f11 = new DFA(8, 0, final_st11, tt11, valid_str11);
        this.dfalist.add(new dfaobj("Python", f11));

        ArrayList<Integer> final_st12 = new ArrayList<>();
        ArrayList<String> valid_str12 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt12 = new ArrayList<>();

        valid_str12.add("d");
        valid_str12.add("o");
        valid_str12.add("u");
        valid_str12.add("b");
        valid_str12.add("l");
        valid_str12.add("e");
        final_st12.add(6);
        for (int i = 0; i <= 7; i++) {
            tt12.add(new ArrayList<>());
        }
        tt12.get(0).add(new node(1, "d"));
        tt12.get(0).add(new node(7, "(.)*"));
        tt12.get(1).add(new node(2, "o"));
        tt12.get(1).add(new node(7, "(.)*"));
        tt12.get(2).add(new node(3, "u"));
        tt12.get(2).add(new node(7, "(.)*"));
        tt12.get(3).add(new node(4, "b"));
        tt12.get(3).add(new node(7, "(.)*"));
        tt12.get(4).add(new node(5, "l"));
        tt12.get(4).add(new node(7, "(.)*"));
        tt12.get(5).add(new node(6, "e"));
        tt12.get(5).add(new node(7, "(.)*"));
        tt12.get(6).add(new node(7, "(.)*"));
        tt12.get(7).add(new node(7, "(.)*"));

        DFA f12 = new DFA(8, 0, final_st12, tt12, valid_str12);
        this.dfalist.add(new dfaobj("double", f12));

        ArrayList<Integer> final_st13 = new ArrayList<>();
        ArrayList<String> valid_str13 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt13 = new ArrayList<>();

        valid_str13.add("O");
        valid_str13.add("b");
        valid_str13.add("j");
        valid_str13.add("e");
        valid_str13.add("c");
        valid_str13.add("t");
        final_st13.add(6);
        for (int i = 0; i <= 7; i++) {
            tt13.add(new ArrayList<>());
        }
        tt13.get(0).add(new node(1, "O"));
        tt13.get(0).add(new node(7, "(.)*"));
        tt13.get(1).add(new node(2, "b"));
        tt13.get(1).add(new node(7, "(.)*"));
        tt13.get(2).add(new node(3, "j"));
        tt13.get(2).add(new node(7, "(.)*"));
        tt13.get(3).add(new node(4, "e"));
        tt13.get(3).add(new node(7, "(.)*"));
        tt13.get(4).add(new node(5, "c"));
        tt13.get(4).add(new node(7, "(.)*"));
        tt13.get(5).add(new node(6, "t"));
        tt13.get(5).add(new node(7, "(.)*"));
        tt13.get(6).add(new node(7, "(.)*"));
        tt13.get(7).add(new node(7, "(.)*"));

        DFA f13 = new DFA(8, 0, final_st13, tt13, valid_str13);
        this.dfalist.add(new dfaobj("Object", f13));

        ArrayList<Integer> final_st14 = new ArrayList<>();
        ArrayList<String> valid_str14 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt14 = new ArrayList<>();

        valid_str14.add("i");
        valid_str14.add("m");
        valid_str14.add("p");
        valid_str14.add("o");
        valid_str14.add("r");
        valid_str14.add("t");
        final_st14.add(6);
        for (int i = 0; i <= 7; i++) {
            tt14.add(new ArrayList<>());
        }
        tt14.get(0).add(new node(1, "i"));
        tt14.get(0).add(new node(7, "(.)*"));
        tt14.get(1).add(new node(2, "m"));
        tt14.get(1).add(new node(7, "(.)*"));
        tt14.get(2).add(new node(3, "p"));
        tt14.get(2).add(new node(7, "(.)*"));
        tt14.get(3).add(new node(4, "o"));
        tt14.get(3).add(new node(7, "(.)*"));
        tt14.get(4).add(new node(5, "r"));
        tt14.get(4).add(new node(7, "(.)*"));
        tt14.get(5).add(new node(6, "t"));
        tt14.get(5).add(new node(7, "(.)*"));
        tt14.get(6).add(new node(7, "(.)*"));
        tt14.get(7).add(new node(7, "(.)*"));

        DFA f14 = new DFA(8, 0, final_st14, tt14, valid_str14);
        this.dfalist.add(new dfaobj("import", f14));

        ArrayList<Integer> final_st15 = new ArrayList<>();
        ArrayList<String> valid_str15 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt15 = new ArrayList<>();

        valid_str15.add("C");
        valid_str15.add("o");
        valid_str15.add("d");
        valid_str15.add("i");
        valid_str15.add("n");
        valid_str15.add("g");
        final_st15.add(6);
        for (int i = 0; i <= 7; i++) {
            tt15.add(new ArrayList<>());
        }
        tt15.get(0).add(new node(1, "C"));
        tt15.get(0).add(new node(7, "(.)*"));
        tt15.get(1).add(new node(2, "o"));
        tt15.get(1).add(new node(7, "(.)*"));
        tt15.get(2).add(new node(3, "d"));
        tt15.get(2).add(new node(7, "(.)*"));
        tt15.get(3).add(new node(4, "i"));
        tt15.get(3).add(new node(7, "(.)*"));
        tt15.get(4).add(new node(5, "n"));
        tt15.get(4).add(new node(7, "(.)*"));
        tt15.get(5).add(new node(6, "g"));
        tt15.get(5).add(new node(7, "(.)*"));
        tt15.get(6).add(new node(7, "(.)*"));
        tt15.get(7).add(new node(7, "(.)*"));

        DFA f15 = new DFA(8, 0, final_st15, tt15, valid_str15);
        this.dfalist.add(new dfaobj("Coding", f15));

        ArrayList<Integer> final_st16 = new ArrayList<>();
        ArrayList<String> valid_str16 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt16 = new ArrayList<>();

        valid_str16.add("M");
        valid_str16.add("o");
        valid_str16.add("n");
        valid_str16.add("g");
        valid_str16.add("o");
        valid_str16.add("D");
        valid_str16.add("B");
        final_st16.add(7);
        for (int i = 0; i <=8; i++) {
            tt16.add(new ArrayList<>());
        }
        tt16.get(0).add(new node(1, "M"));
        tt16.get(0).add(new node(8, "(.)*"));
        tt16.get(1).add(new node(2, "o"));
        tt16.get(1).add(new node(8, "(.)*"));
        tt16.get(2).add(new node(3, "n"));
        tt16.get(2).add(new node(8, "(.)*"));
        tt16.get(3).add(new node(4, "g"));
        tt16.get(3).add(new node(8, "(.)*"));
        tt16.get(4).add(new node(5, "o"));
        tt16.get(4).add(new node(8, "(.)*"));
        tt16.get(5).add(new node(6, "D"));
        tt16.get(5).add(new node(8, "(.)*"));
        tt16.get(6).add(new node(7, "B"));
        tt16.get(6).add(new node(8, "(.)*"));
        tt16.get(7).add(new node(8, "(.)*"));
        tt16.get(8).add(new node(8, "(.)*"));

        DFA f16 = new DFA(9, 0, final_st16, tt16, valid_str16);
        this.dfalist.add(new dfaobj("MongoDB", f16));
        
        ArrayList<Integer> final_st17 = new ArrayList<>();
        ArrayList<String> valid_str17 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt17 = new ArrayList<>();

        valid_str17.add("W");
        valid_str17.add("i");
        valid_str17.add("n");
        valid_str17.add("d");
        valid_str17.add("o");
        valid_str17.add("w");
        valid_str17.add("s");
        final_st17.add(7);
        for (int i = 0; i <= 8; i++) {
            tt17.add(new ArrayList<>());
        }
        tt17.get(0).add(new node(1, "W"));
        tt17.get(0).add(new node(8, "(.)*"));
        tt17.get(1).add(new node(2, "i"));
        tt17.get(1).add(new node(8, "(.)*"));
        tt17.get(2).add(new node(3, "n"));
        tt17.get(2).add(new node(8, "(.)*"));
        tt17.get(3).add(new node(4, "d"));
        tt17.get(3).add(new node(8, "(.)*"));
        tt17.get(4).add(new node(5, "o"));
        tt17.get(4).add(new node(8, "(.)*"));
        tt17.get(5).add(new node(6, "w"));
        tt17.get(5).add(new node(8, "(.)*"));
        tt17.get(6).add(new node(7, "s"));
        tt17.get(6).add(new node(8, "(.)*"));
        tt17.get(7).add(new node(8, "(.)*"));
        tt17.get(8).add(new node(8, "(.)*"));

        DFA f17 = new DFA(9, 0, final_st17, tt17, valid_str17);
        this.dfalist.add(new dfaobj("Windows", f17));
        
        ArrayList<Integer> final_st18 = new ArrayList<>();
        ArrayList<String> valid_str18 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt18 = new ArrayList<>();

        valid_str18.add("i");
        valid_str18.add("n");
        valid_str18.add("t");
        valid_str18.add("e");
        valid_str18.add("g");
        valid_str18.add("e");
        valid_str18.add("r");
        final_st18.add(7);
        for (int i = 0; i <= 8; i++) {
            tt18.add(new ArrayList<>());
        }
        tt18.get(0).add(new node(1, "i"));
        tt18.get(0).add(new node(8, "(.)*"));
        tt18.get(1).add(new node(2, "n"));
        tt18.get(1).add(new node(8, "(.)*"));
        tt18.get(2).add(new node(3, "t"));
        tt18.get(2).add(new node(8, "(.)*"));
        tt18.get(3).add(new node(4, "e"));
        tt18.get(3).add(new node(8, "(.)*"));
        tt18.get(4).add(new node(5, "g"));
        tt18.get(4).add(new node(8, "(.)*"));
        tt18.get(5).add(new node(6, "e"));
        tt18.get(5).add(new node(8, "(.)*"));
        tt18.get(6).add(new node(7, "r"));
        tt18.get(6).add(new node(8, "(.)*"));
        tt18.get(7).add(new node(8, "(.)*"));
        tt18.get(8).add(new node(8, "(.)*"));

        DFA f18 = new DFA(9, 0, final_st18, tt18, valid_str18);
        this.dfalist.add(new dfaobj("integer", f18));
        
        ArrayList<Integer> final_st19 = new ArrayList<>();
        ArrayList<String> valid_str19 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt19 = new ArrayList<>();

        valid_str19.add("e");
        valid_str19.add("x");
        valid_str19.add("t");
        valid_str19.add("e");
        valid_str19.add("n");
        valid_str19.add("d");
        valid_str19.add("s");
        final_st19.add(7);
        for (int i = 0; i <= 8; i++) {
            tt19.add(new ArrayList<>());
        }
        tt19.get(0).add(new node(1, "e"));
        tt19.get(0).add(new node(8, "(.)*"));
        tt19.get(1).add(new node(2, "x"));
        tt19.get(1).add(new node(8, "(.)*"));
        tt19.get(2).add(new node(3, "t"));
        tt19.get(2).add(new node(8, "(.)*"));
        tt19.get(3).add(new node(4, "e"));
        tt19.get(3).add(new node(8, "(.)*"));
        tt19.get(4).add(new node(5, "n"));
        tt19.get(4).add(new node(8, "(.)*"));
        tt19.get(5).add(new node(6, "d"));
        tt19.get(5).add(new node(8, "(.)*"));
        tt19.get(6).add(new node(7, "s"));
        tt19.get(6).add(new node(8, "(.)*"));
        tt19.get(7).add(new node(8, "(.)*"));
        tt19.get(8).add(new node(8, "(.)*"));

        DFA f19 = new DFA(9, 0, final_st19, tt19, valid_str19);
        
        this.dfalist.add(new dfaobj("extends", f19));
        
        ArrayList<Integer> final_st20 = new ArrayList<>();
        ArrayList<String> valid_str20 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt20 = new ArrayList<>();

        valid_str20.add("C");
        valid_str20.add("o");
        valid_str20.add("m");
        valid_str20.add("p");
        valid_str20.add("i");
        valid_str20.add("l");
        valid_str20.add("e");
        final_st20.add(7);
        for (int i = 0; i <= 8; i++) {
            tt20.add(new ArrayList<>());
        }
        tt20.get(0).add(new node(1, "C"));
        tt20.get(0).add(new node(8, "(.)*"));
        tt20.get(1).add(new node(2, "o"));
        tt20.get(1).add(new node(8, "(.)*"));
        tt20.get(2).add(new node(3, "m"));
        tt20.get(2).add(new node(8, "(.)*"));
        tt20.get(3).add(new node(4, "p"));
        tt20.get(3).add(new node(8, "(.)*"));
        tt20.get(4).add(new node(5, "i"));
        tt20.get(4).add(new node(8, "(.)*"));
        tt20.get(5).add(new node(6, "l"));
        tt20.get(5).add(new node(8, "(.)*"));
        tt20.get(6).add(new node(7, "e"));
        tt20.get(6).add(new node(8, "(.)*"));
        tt20.get(7).add(new node(8, "(.)*"));
        tt20.get(8).add(new node(8, "(.)*"));

        DFA f20 = new DFA(9, 0, final_st20, tt20, valid_str20);
        this.dfalist.add(new dfaobj("Compile", f20));
        
        ArrayList<Integer> final_st21 = new ArrayList<>();
        ArrayList<String> valid_str21 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt21 = new ArrayList<>();

        valid_str21.add("P");
        valid_str21.add("a");
        valid_str21.add("c");
        valid_str21.add("k");
        valid_str21.add("a");
        valid_str21.add("g");
        valid_str21.add("e");
        final_st21.add(7);
        for (int i = 0; i <= 8; i++) {
            tt21.add(new ArrayList<>());
        }
        tt21.get(0).add(new node(1, "P"));
        tt21.get(0).add(new node(8, "(.)*"));
        tt21.get(1).add(new node(2, "a"));
        tt21.get(1).add(new node(8, "(.)*"));
        tt21.get(2).add(new node(3, "c"));
        tt21.get(2).add(new node(8, "(.)*"));
        tt21.get(3).add(new node(4, "k"));
        tt21.get(3).add(new node(8, "(.)*"));
        tt21.get(4).add(new node(5, "a"));
        tt21.get(4).add(new node(8, "(.)*"));
        tt21.get(5).add(new node(6, "g"));
        tt21.get(5).add(new node(8, "(.)*"));
        tt21.get(6).add(new node(7, "e"));
        tt21.get(6).add(new node(8, "(.)*"));
        tt21.get(7).add(new node(8, "(.)*"));
        tt21.get(8).add(new node(8, "(.)*"));

        DFA f21 = new DFA(9, 0, final_st21, tt21, valid_str21);
        this.dfalist.add(new dfaobj("Package", f21));
        
        ArrayList<Integer> final_st22 = new ArrayList<>();
        ArrayList<String> valid_str22 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt22 = new ArrayList<>();

        valid_str22.add("D");
        valid_str22.add("a");
        valid_str22.add("t");
        valid_str22.add("a");
        valid_str22.add("B");
        valid_str22.add("a");
        valid_str22.add("s");
        valid_str22.add("e");
        final_st22.add(8);
        for (int i = 0; i <= 9; i++) {
            tt22.add(new ArrayList<>());
        }
        tt22.get(0).add(new node(1, "D"));
        tt22.get(0).add(new node(9, "(.)*"));
        tt22.get(1).add(new node(2, "a"));
        tt22.get(1).add(new node(9, "(.)*"));
        tt22.get(2).add(new node(3, "t"));
        tt22.get(2).add(new node(9, "(.)*"));
        tt22.get(3).add(new node(4, "a"));
        tt22.get(3).add(new node(9, "(.)*"));
        tt22.get(4).add(new node(5, "B"));
        tt22.get(4).add(new node(9, "(.)*"));
        tt22.get(5).add(new node(6, "a"));
        tt22.get(5).add(new node(9, "(.)*"));
        tt22.get(6).add(new node(7, "s"));
        tt22.get(6).add(new node(9, "(.)*"));
        tt22.get(7).add(new node(8, "e"));
        tt22.get(7).add(new node(9, "(.)*"));
        tt22.get(8).add(new node(9, "(.)*"));
        tt22.get(9).add(new node(9, "(.)*"));

        DFA f22 = new DFA(10, 0, final_st22, tt22, valid_str22);
        this.dfalist.add(new dfaobj("DataBase", f22));
        
                ArrayList<Integer> final_st23 = new ArrayList<>();
        ArrayList<String> valid_str23 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt23 = new ArrayList<>();

        valid_str23.add("S");
        valid_str23.add("o");
        valid_str23.add("f");
        valid_str23.add("t");
        valid_str23.add("w");
        valid_str23.add("a");
        valid_str23.add("r");
        valid_str23.add("e");
        final_st23.add(8);
        for (int i = 0; i <= 9; i++) {
            tt23.add(new ArrayList<>());
        }
        tt23.get(0).add(new node(1, "S"));
        tt23.get(0).add(new node(9, "(.)*"));
        tt23.get(1).add(new node(2, "o"));
        tt23.get(1).add(new node(9, "(.)*"));
        tt23.get(2).add(new node(3, "f"));
        tt23.get(2).add(new node(9, "(.)*"));
        tt23.get(3).add(new node(4, "t"));
        tt23.get(3).add(new node(9, "(.)*"));
        tt23.get(4).add(new node(5, "w"));
        tt23.get(4).add(new node(9, "(.)*"));
        tt23.get(5).add(new node(6, "a"));
        tt23.get(5).add(new node(9, "(.)*"));
        tt23.get(6).add(new node(7, "r"));
        tt23.get(6).add(new node(9, "(.)*"));
        tt23.get(7).add(new node(8, "e"));
        tt23.get(7).add(new node(9, "(.)*"));
        tt23.get(8).add(new node(9, "(.)*"));
        tt23.get(9).add(new node(9, "(.)*"));

        DFA f23 = new DFA(10, 0, final_st23, tt23, valid_str23);
        this.dfalist.add(new dfaobj("Software", f23));
        
        ArrayList<Integer> final_st24 = new ArrayList<>();
        ArrayList<String> valid_str24 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt24 = new ArrayList<>();
        valid_str24.add("f");
        valid_str24.add("u");
        valid_str24.add("n");
        valid_str24.add("c");
        valid_str24.add("t");
        valid_str24.add("i");
        valid_str24.add("o");
        valid_str24.add("n");
        final_st24.add(8);
        for (int i = 0; i <= 9; i++) {
            tt24.add(new ArrayList<>());
        }
        tt24.get(0).add(new node(1, "f"));
        tt24.get(0).add(new node(9, "(.)*"));
        tt24.get(1).add(new node(2, "u"));
        tt24.get(1).add(new node(9, "(.)*"));
        tt24.get(2).add(new node(3, "n"));
        tt24.get(2).add(new node(9, "(.)*"));
        tt24.get(3).add(new node(4, "c"));
        tt24.get(3).add(new node(9, "(.)*"));
        tt24.get(4).add(new node(5, "t"));
        tt24.get(4).add(new node(9, "(.)*"));
        tt24.get(5).add(new node(6, "i"));
        tt24.get(5).add(new node(9, "(.)*"));
        tt24.get(6).add(new node(7, "o"));
        tt24.get(6).add(new node(9, "(.)*"));
        tt24.get(7).add(new node(8, "n"));
        tt24.get(7).add(new node(9, "(.)*"));
        tt24.get(8).add(new node(9, "(.)*"));
        tt24.get(9).add(new node(9, "(.)*"));

        DFA f24 = new DFA(10, 0, final_st24, tt24, valid_str24);
        this.dfalist.add(new dfaobj("function", f24));
        
        ArrayList<Integer> final_st25 = new ArrayList<>();
        ArrayList<String> valid_str25 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt25 = new ArrayList<>();
        valid_str25.add("W");
        valid_str25.add("o");
        valid_str25.add("r");
        valid_str25.add("d");
        valid_str25.add("p");
        valid_str25.add("r");
        valid_str25.add("e");
        valid_str25.add("s");
        valid_str25.add("s");
        final_st25.add(9);
        for (int i = 0; i <= 10; i++) {
            tt25.add(new ArrayList<>());
        }
        tt25.get(0).add(new node(1, "W"));
        tt25.get(0).add(new node(10, "(.)*"));
        tt25.get(1).add(new node(2, "o"));
        tt25.get(1).add(new node(10, "(.)*"));
        tt25.get(2).add(new node(3, "r"));
        tt25.get(2).add(new node(10, "(.)*"));
        tt25.get(3).add(new node(4, "d"));
        tt25.get(3).add(new node(10, "(.)*"));
        tt25.get(4).add(new node(5, "p"));
        tt25.get(4).add(new node(10, "(.)*"));
        tt25.get(5).add(new node(6, "r"));
        tt25.get(5).add(new node(10, "(.)*"));
        tt25.get(6).add(new node(7, "e"));
        tt25.get(6).add(new node(10, "(.)*"));
        tt25.get(7).add(new node(8, "s"));
        tt25.get(7).add(new node(10, "(.)*"));
        tt25.get(8).add(new node(9, "s"));
        tt25.get(8).add(new node(10, "(.)*"));
        tt25.get(9).add(new node(10, "(.)*"));
        tt25.get(10).add(new node(10, "(.)*"));

        DFA f25 = new DFA(11, 0, final_st25, tt25, valid_str25);
        this.dfalist.add(new dfaobj("Wordpress", f25));
        
        ArrayList<Integer> final_st26 = new ArrayList<>();
        ArrayList<String> valid_str26 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt26 = new ArrayList<>();
        valid_str26.add("i");
        valid_str26.add("n");
        valid_str26.add("t");
        valid_str26.add("e");
        valid_str26.add("r");
        valid_str26.add("f");
        valid_str26.add("a");
        valid_str26.add("c");
        valid_str26.add("e");
        final_st26.add(9);
        for (int i = 0; i <= 10; i++) {
            tt26.add(new ArrayList<>());
        }
        tt26.get(0).add(new node(1, "i"));
        tt26.get(0).add(new node(10, "(.)*"));
        tt26.get(1).add(new node(2, "n"));
        tt26.get(1).add(new node(10, "(.)*"));
        tt26.get(2).add(new node(3, "t"));
        tt26.get(2).add(new node(10, "(.)*"));
        tt26.get(3).add(new node(4, "e"));
        tt26.get(3).add(new node(10, "(.)*"));
        tt26.get(4).add(new node(5, "r"));
        tt26.get(4).add(new node(10, "(.)*"));
        tt26.get(5).add(new node(6, "f"));
        tt26.get(5).add(new node(10, "(.)*"));
        tt26.get(6).add(new node(7, "a"));
        tt26.get(6).add(new node(10, "(.)*"));
        tt26.get(7).add(new node(8, "c"));
        tt26.get(7).add(new node(10, "(.)*"));
        tt26.get(8).add(new node(9, "e"));
        tt26.get(8).add(new node(10, "(.)*"));
        tt26.get(9).add(new node(10, "(.)*"));
        tt26.get(10).add(new node(10, "(.)*"));

        DFA f26 = new DFA(11, 0, final_st26, tt26, valid_str26);
        this.dfalist.add(new dfaobj("interface", f26));
        
                ArrayList<Integer> final_st27 = new ArrayList<>();
        ArrayList<String> valid_str27 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt27 = new ArrayList<>();
        valid_str27.add("e");
        valid_str27.add("x");
        valid_str27.add("c");
        valid_str27.add("e");
        valid_str27.add("p");
        valid_str27.add("t");
        valid_str27.add("i");
        valid_str27.add("o");
        valid_str27.add("n");
        final_st27.add(9);
        for (int i = 0; i <= 10; i++) {
            tt27.add(new ArrayList<>());
        }
        tt27.get(0).add(new node(1, "e"));
        tt27.get(0).add(new node(10, "(.)*"));
        tt27.get(1).add(new node(2, "x"));
        tt27.get(1).add(new node(10, "(.)*"));
        tt27.get(2).add(new node(3, "c"));
        tt27.get(2).add(new node(10, "(.)*"));
        tt27.get(3).add(new node(4, "e"));
        tt27.get(3).add(new node(10, "(.)*"));
        tt27.get(4).add(new node(5, "p"));
        tt27.get(4).add(new node(10, "(.)*"));
        tt27.get(5).add(new node(6, "t"));
        tt27.get(5).add(new node(10, "(.)*"));
        tt27.get(6).add(new node(7, "i"));
        tt27.get(6).add(new node(10, "(.)*"));
        tt27.get(7).add(new node(8, "o"));
        tt27.get(7).add(new node(10, "(.)*"));
        tt27.get(8).add(new node(9, "n"));
        tt27.get(8).add(new node(10, "(.)*"));
        tt27.get(9).add(new node(10, "(.)*"));
        tt27.get(10).add(new node(10, "(.)*"));

        DFA f27 = new DFA(11, 0, final_st27, tt27, valid_str27);
        this.dfalist.add(new dfaobj("exception", f27));
        
                        ArrayList<Integer> final_st28 = new ArrayList<>();
        ArrayList<String> valid_str28 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt28 = new ArrayList<>();
        valid_str28.add("S");
        valid_str28.add("Q");
        valid_str28.add("L");
        valid_str28.add("S");
        valid_str28.add("e");
        valid_str28.add("r");
        valid_str28.add("v");
        valid_str28.add("e");
        valid_str28.add("r");
        final_st28.add(9);
        for (int i = 0; i <= 10; i++) {
            tt28.add(new ArrayList<>());
        }
        tt28.get(0).add(new node(1, "S"));
        tt28.get(0).add(new node(10, "(.)*"));
        tt28.get(1).add(new node(2, "Q"));
        tt28.get(1).add(new node(10, "(.)*"));
        tt28.get(2).add(new node(3, "L"));
        tt28.get(2).add(new node(10, "(.)*"));
        tt28.get(3).add(new node(4, "s"));
        tt28.get(3).add(new node(10, "(.)*"));
        tt28.get(4).add(new node(5, "e"));
        tt28.get(4).add(new node(10, "(.)*"));
        tt28.get(5).add(new node(6, "r"));
        tt28.get(5).add(new node(10, "(.)*"));
        tt28.get(6).add(new node(7, "v"));
        tt28.get(6).add(new node(10, "(.)*"));
        tt28.get(7).add(new node(8, "e"));
        tt28.get(7).add(new node(10, "(.)*"));
        tt28.get(8).add(new node(9, "r"));
        tt28.get(8).add(new node(10, "(.)*"));
        tt28.get(9).add(new node(10, "(.)*"));
        tt28.get(10).add(new node(10, "(.)*"));

        DFA f28 = new DFA(11, 0, final_st28, tt28, valid_str28);
        this.dfalist.add(new dfaobj("SQLserver", f28));
        
                                ArrayList<Integer> final_st29 = new ArrayList<>();
        ArrayList<String> valid_str29 = new ArrayList<>();
        ArrayList<ArrayList<node>> tt29 = new ArrayList<>();
        valid_str29.add("i");
        valid_str29.add("n");
        valid_str29.add("s");
        valid_str29.add("t");
        valid_str29.add("a");
        valid_str29.add("n");
        valid_str29.add("c");
        valid_str29.add("e");
        valid_str29.add("s");
        final_st29.add(9);
        for (int i = 0; i <= 10; i++) {
            tt29.add(new ArrayList<>());
        }
        tt29.get(0).add(new node(1, "i"));
        tt29.get(0).add(new node(10, "(.)*"));
        tt29.get(1).add(new node(2, "n"));
        tt29.get(1).add(new node(10, "(.)*"));
        tt29.get(2).add(new node(3, "s"));
        tt29.get(2).add(new node(10, "(.)*"));
        tt29.get(3).add(new node(4, "t"));
        tt29.get(3).add(new node(10, "(.)*"));
        tt29.get(4).add(new node(5, "a"));
        tt29.get(4).add(new node(10, "(.)*"));
        tt29.get(5).add(new node(6, "n"));
        tt29.get(5).add(new node(10, "(.)*"));
        tt29.get(6).add(new node(7, "c"));
        tt29.get(6).add(new node(10, "(.)*"));
        tt29.get(7).add(new node(8, "e"));
        tt29.get(7).add(new node(10, "(.)*"));
        tt29.get(8).add(new node(9, "s"));
        tt29.get(8).add(new node(10, "(.)*"));
        tt29.get(9).add(new node(10, "(.)*"));
        tt29.get(10).add(new node(10, "(.)*"));

        DFA f29 = new DFA(11, 0, final_st29, tt29, valid_str29);
        this.dfalist.add(new dfaobj("instances", f29));
    }

    public class dfaobj {

        private String label;
        private DFA dfa;

        public dfaobj() {
            this.label = "";
            this.dfa = new DFA();
        }

        public dfaobj(String lab, DFA fa) {
            this.label = lab;
            this.dfa = fa;
        }

        public void setlabel(String lab) {
            this.label = lab;
        }

        public void setdfa(DFA fa) {
            this.dfa = fa;
        }

        public DFA getdfa() {
            return this.dfa;
        }

        public String getlabel() {
            return this.label;
        }
    }
}
