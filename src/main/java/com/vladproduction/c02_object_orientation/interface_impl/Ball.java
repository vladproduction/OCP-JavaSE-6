package com.vladproduction.c02_object_orientation.interface_impl;

import java.io.Serializable;

public abstract class Ball implements Bounceable, Serializable {

    public abstract String ballColor(String color);

}
