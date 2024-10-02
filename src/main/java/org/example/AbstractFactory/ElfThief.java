package org.example.AbstractFactory;

import org.example.AbstractFactory.Thief;

public class ElfThief implements Thief {
    public void backstab() {
        System.out.println("Elven Dagger hit");
    }
}