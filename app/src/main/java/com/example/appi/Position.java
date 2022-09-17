package com.example.appi;
import java.util.ArrayList;



public class Position {
    public ArrayList<Integer> madeMoves;
    public ArrayList<Character> letters;
    public ArrayList<Integer> possibleMoves;
    private int x;

    public Position(ArrayList<Integer> mm, int x_, ArrayList<Character> letters_) {
        this.letters = letters_;
        this.x = x_;
        this.madeMoves = new ArrayList<Integer>(mm);
        this.possibleMoves = createPossibleDirections();

        if(this.madeMoves.size() < 15) {
            this.madeMoves.add(this.x);
        }

    }


    ArrayList<Integer> createPossibleDirections() {


        ArrayList<Integer>possibles = new ArrayList<Integer>();
        if (this.x == 0) {
            possibles.add(1);
            possibles.add(4);
            possibles.add(5);
        }else if (this.x == 1) {
            possibles.add(0);
            possibles.add(2);
            possibles.add(4);
            possibles.add(5);
            possibles.add(6);
        }else if (this.x == 2) {
            possibles.add(1);
            possibles.add(3);
            possibles.add(5);
            possibles.add(6);
            possibles.add(7);
        }else if(this.x == 3) {
            possibles.add(2);
            possibles.add(6);
            possibles.add(7);
        }else if (this.x == 4) {
            possibles.add(0);
            possibles.add(1);
            possibles.add(5);
            possibles.add(8);
            possibles.add(9);
        }else if(this.x == 5){
            possibles.add(0);
            possibles.add(1);
            possibles.add(2);
            possibles.add(4);
            possibles.add(6);
            possibles.add(8);
            possibles.add(9);
            possibles.add(10);
        }else if (this.x == 6) {
            possibles.add(1);
            possibles.add(2);
            possibles.add(3);
            possibles.add(5);
            possibles.add(7);
            possibles.add(9);
            possibles.add(10);
            possibles.add(11);
        }else if (this.x == 7){
            possibles.add(2);
            possibles.add(3);
            possibles.add(6);
            possibles.add(10);
            possibles.add(11);
        }else if(this.x == 8) {
            possibles.add(4);
            possibles.add(5);
            possibles.add(9);
            possibles.add(12);
            possibles.add(13);
        }else if( this.x == 9) {
            possibles.add(4);
            possibles.add(5);
            possibles.add(6);
            possibles.add(8);
            possibles.add(10);
            possibles.add(12);
            possibles.add(13);
            possibles.add(14);
        }else if(this.x == 10) {
            possibles.add(5);
            possibles.add(6);
            possibles.add(7);
            possibles.add(9);
            possibles.add(11);
            possibles.add(13);
            possibles.add(14);
            possibles.add(15);
        }else if( this.x == 11) {
            possibles.add(6);
            possibles.add(7);
            possibles.add(10);
            possibles.add(14);
            possibles.add(15);
        }else if(this.x == 12) {
            possibles.add(8);
            possibles.add(9);
            possibles.add(13);
        }else if (this.x == 13){
            possibles.add(8);
            possibles.add(9);
            possibles.add(10);
            possibles.add(12);
            possibles.add(14);
        }else if (this.x == 14) {
            possibles.add(9);
            possibles.add(10);
            possibles.add(11);
            possibles.add(13);
            possibles.add(15);
        }else if(this.x == 15) {
            possibles.add(10);
            possibles.add(11);
            possibles.add(14);
        }

        ArrayList<Integer> p = new ArrayList<Integer>();

        for (Integer i : possibles) {
            if (this.madeMoves.contains(i)) {
                ;
            }else {
                p.add(i);
            }
        }

        return p;
    }

    public String word() {
        String w = "";

        for(Integer i : this.madeMoves) {
            w += this.letters.get(i);
        }


        return w;
    }



}
