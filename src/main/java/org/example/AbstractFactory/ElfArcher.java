package org.example.AbstractFactory;

public class ElfArcher implements Archer {
    public HumanArcher shoot() {
        System.out.println("Elven Arrow shoot");
        return null;
    }
}
