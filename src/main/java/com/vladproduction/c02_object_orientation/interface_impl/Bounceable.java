package com.vladproduction.c02_object_orientation.interface_impl;

/**
 * -able to extends from another interface
 * -able to multiple extension
 * */
public interface Bounceable extends Movable, Spherical{

    void bounce();
    void setBounceFactor(int bf);


}
