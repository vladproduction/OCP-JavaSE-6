package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions;

public class TestExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finish");
        }
    }
}
