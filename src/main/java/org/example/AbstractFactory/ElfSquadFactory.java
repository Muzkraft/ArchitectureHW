package org.example.AbstractFactory;

public class ElfSquadFactory implements SquadFactory {
    public ElfSquadFactory() {
        System.out.println("Creating Elves squad factory");
    }
    @Override
    public Mage createMage() {
        System.out.println("Creating Elf Mage");
        return new ElfMage();
    }
    @Override
    public Archer createArcher() {
        System.out.println("Creating Elf Archer");
        return new ElfArcher();
    }
    @Override
    public Warrior createWarrior() {
        System.out.println("Creating Elf Warrior");
        return new ElfWarrior();
    }
    @Override
    public Thief createThief() {
        System.out.println("Creating Elf Thief");
        return new ElfThief();
    }
}
