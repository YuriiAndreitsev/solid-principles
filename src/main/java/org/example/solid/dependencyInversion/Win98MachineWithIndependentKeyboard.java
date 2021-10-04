package org.example.solid.dependencyInversion;

public class Win98MachineWithIndependentKeyboard {
    IndependentStandardKeyboard keyboard;
    Monitor monitor;

    public Win98MachineWithIndependentKeyboard(IndependentStandardKeyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
