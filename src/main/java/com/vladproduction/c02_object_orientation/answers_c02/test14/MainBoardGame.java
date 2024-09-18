package com.vladproduction.c02_object_orientation.answers_c02.test14;


/**
 * Floozels are a type of Jammers,
 * Jammers can have Quizels,
 * Quizels are a type of Klakker,
 * and Floozels can have several Floozets.
 * */
public class MainBoardGame {
    public static void main(String[] args) {

    }
}

/**
 * C. import java.util.*;
 *  class Floozets { }++
 *  class Quizels implements Klakker { }++
 *  class Jammers { List<Quizels> q; }++
 *  interface Klakker { }++
 *  class Floozels extends Jammers { List<Floozets> f; }++
 * */

/**
 * A. import java.util.*;
 *  interface Klakker { }++
 *  class Jammers { Set<Quizels> q; }++
 *  class Quizels implements Klakker { }++
 *  public class Floozels extends Jammers { List<Floozets> f; }++
 *  interface Floozets { }++
 * */

/**
 * Answer:
 *  A and C are correct. The phrase "type of" indicates an "is-a" relationship (extends or
 * implements), and the phrase “have” is of course a "has-a" relationship (usually instance
 * variables).
 * */
