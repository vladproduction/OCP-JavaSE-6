package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test5;

public class Loopy {
    public static void main(String[] args) {
        int[] x = {7,6,5,4,3,2,1};
        //code here
        int y = 0; for(int z=0; z<x.length; z++) { y = x[z];
            System.out.println(y + " ");
        }
    }
}
//answer: A D F
/*Which, inserted independently at line (after code here), compiles? (Choose all that apply.)
 + A. for(int y : x) {
B. for(x : int y) {
C. int y = 0; for(y : x) {
 + D. for(int y=0, z=0; z<x.length; z++) { y = x[z];
E. for(int y=0, int z=0; z<x.length; z++) { y = x[z];
 + F. int y = 0; for(int z=0; z<x.length; z++) { y = x[z];*/
