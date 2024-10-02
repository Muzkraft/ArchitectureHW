package org.example.AbstractFactory;

public class HumanSquadFactory implements SquadFactory {
    public HumanSquadFactory(){
        System.out.println("Creating Humans squad factory");
    }
    public Mage createMage() {
        System.out.println("Creating Human Mage");
        return new HumanMage();
    }

    public Archer createArcher() {
        System.out.println("Creating Human Archer");
        return new HumanArcher();
    }

    public Warrior createWarrior() {
        System.out.println("Creating Human Warrior");
        return new HumanWarrior();
    }

    public Thief createThief() {
        System.out.println("Creating Human Thief");
        return new HumanThief();
    }
}
