package org.example.solid.dependencyInversion;

public class Win98Machine {
//tightly coupled fields
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Win98Machine(StandardKeyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
