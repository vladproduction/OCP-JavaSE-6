package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.situations.illegal_state;

public class TestIllegalState {

    private boolean isStarted = false; // State variable to track the object state

    public static void main(String[] args) {
        /*An IllegalStateException in Java is typically thrown to indicate that a method has been invoked at an
        inappropriate time or that the environment or application is not in an appropriate state for the requested operation.
        This exception is usually thrown programmatically by the developer, rather than by the Java Virtual Machine (JVM).*/

        TestIllegalState process = new TestIllegalState();
        try {
            // Attempt to stop the process before starting it
            process.stop();
        } catch (IllegalStateException e) {
            System.out.println("Caught an IllegalStateException: " + e.getMessage());
        }

        try {
            // Start the process
            process.start();
            // Attempt to start the process again
            process.start(); // This should throw an exception
        } catch (IllegalStateException e) {
            System.out.println("Caught an IllegalStateException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exceptions.");

    }


    // Method to start the process
    public void start() {
        if (isStarted) {
            throw new IllegalStateException("Process is already started.");
        }
        System.out.println("Process has started.");
        isStarted = true; // Change state to indicate the process has started
    }

    // Method to stop the process
    public void stop() {
        if (!isStarted) {
            throw new IllegalStateException("Process has not been started yet.");
        }
        System.out.println("Process has stopped.");
        isStarted = false; // Change state to indicate the process has stopped
    }
}
