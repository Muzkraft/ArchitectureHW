package org.example.AbstractFactory;

import org.example.AbstractFactory.Thief;

public class HumanThief implements Thief {
    public void backstab() {
        System.out.println("Dagger hit");
    }
}
