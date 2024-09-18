package com.vladproduction.c09_threads.define_instantiate_starting.instantiating;

public class ThreadClass extends Thread{
    public static void main(String[] args) {
        System.out.println("MAIN START");
        new ThreadClass().start();
        System.out.println("MAIN FINISH");
    }

    @Override
    public void run() {
        System.out.println("run start");
        for (int i = 0; i < 5; i++) {
            System.out.println("Tread class: " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("run finish");
    }
}
