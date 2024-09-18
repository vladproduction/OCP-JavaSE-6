package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test3;

public class Engage {
    public static void main(String[] args) {

        /*  Answer:
            ClassCastException -
            IllegalStateException -
            C. NumberFormatException +
            D. IllegalArgumentException +
            ExceptionInInitializerError -
            ArrayIndexOutOfBoundsException -
         */

        try {
            int x = Integer.parseInt("two");
        }
//        catch (ClassCastException e){
//            System.out.println("ClassCastException: " + e.getMessage());
//        }
//        catch (IllegalStateException e){
//            System.out.println("IllegalStateException: " + e.getMessage());
//        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
//        catch (ExceptionInInitializerError e){
//            System.out.println("ExceptionInInitializerError: " + e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
//        }


    }
}
