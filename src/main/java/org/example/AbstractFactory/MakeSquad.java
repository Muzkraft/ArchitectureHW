package org.example.AbstractFactory;

public class MakeSquad {
    private final Mage partyMemberMage;
    private final Warrior partyMemberWarrior;
    private final Archer partyMemberArcher;
    private final Thief partyMemberThief;

    public MakeSquad(SquadFactory factory) {
        System.out.println("Creating desired race squad");
        partyMemberMage = factory.createMage();
        partyMemberArcher = factory.createArcher();
        partyMemberThief = factory.createThief();
        partyMemberWarrior = factory.createWarrior();
    }
}
