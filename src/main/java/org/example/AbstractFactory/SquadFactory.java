package org.example.AbstractFactory;

public interface SquadFactory {
    Mage createMage();
    Archer createArcher();
    Warrior createWarrior();
    Thief createThief();
}
