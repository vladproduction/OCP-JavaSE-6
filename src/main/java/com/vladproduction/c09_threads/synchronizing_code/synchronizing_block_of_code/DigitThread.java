package com.vladproduction.c09_threads.synchronizing_code.synchronizing_block_of_code;

public class DigitThread extends Thread{
    private final StringBuffer stringBuffer;
    private final int startNumber;

    public DigitThread(StringBuffer stringBuffer, int startNumber) {
        this.stringBuffer = stringBuffer;
        this.startNumber = startNumber;
    }

    @Override
    public void run() {
        synchronized (stringBuffer){
            for (int i = startNumber; i <= startNumber + 9; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
class DigitSynchronization{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        DigitThread thread1 = new DigitThread(sb, 10);
        DigitThread thread2 = new DigitThread(sb, 20);
        DigitThread thread3 = new DigitThread(sb, 30);

        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        //the output is not stable
    }
}
