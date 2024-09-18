package com.vladproduction.c09_threads.define_instantiate_starting.starting;

public class ThreadScheduler {
//    it's the thread scheduler that decides which thread—of all that are eligible—will actually run.
//    eligible, we really mean in the runnable state.

//    Some of the methods that can help us influence thread scheduling are as follows:
    public static void sleep(long millis) throws InterruptedException{}
    public static void yield(){}
    public final void join() throws InterruptedException{}
    public final void setPriority(int newPriority){}

//    Every class in Java inherits the following three thread-related methods:
//    public final void wait() throws InterruptedException{}
//    public final void notify(){}
//    public final void notifyAll(){}
}
