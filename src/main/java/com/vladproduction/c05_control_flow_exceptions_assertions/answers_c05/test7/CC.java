package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test7;

public class CC { void doStuff() throws SubException { } }
class CC2 extends CC { void doStuff() throws SubSubException { } }

//class CC3 extends CC { void doStuff() throws Exception { } }
class CC4 extends CC { void doStuff(int x) throws Exception { } }
class CC5 extends CC { void doStuff() { } }

//C. Compilation fails due to an error at line: class CC3 extends CC { void doStuff() throws Exception { } }
