package com.vladproduction.c09_threads.synchronizing_code.thread_safe_class;


/**
 * To keep things simple: in order to make a class thread-safe, methods that access
 * changeable fields need to be synchronized.
 * Access to static fields should be done from static synchronized methods.
 * Access to non-static fields should be done from non-static synchronized methods.
 */
public class Thing {
    private static int staticField;
    private int nonstaticField;

    public static synchronized int getStaticField() {
        return staticField;
    }

    public static synchronized void setStaticField(
            int staticField) {
        Thing.staticField = staticField;
    }

    public synchronized int getNonstaticField() {
        return nonstaticField;
    }

    public synchronized void setNonstaticField(
            int nonstaticField) {
        this.nonstaticField = nonstaticField;
    }
}

