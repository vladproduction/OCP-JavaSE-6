package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test6;

public class Emu {
    static String s = "-";

    public static void main(String[] args) {

        try {
            throw new Exception();
        } catch (Exception e) {
            try {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    s += "ic ";
                }
                throw new Exception();
            } catch (Exception x) {
                s += "mc ";
            } finally {
                s += "mf ";
            }
        } finally {
            s += "of ";
        }
        System.out.println(s); //-ic mc mf of
    }
}

