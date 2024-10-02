package org.example;

import org.example.AbstractFactory.*;

import java.util.Scanner;

public class Application {
    private MakeSquad makeSquad;
    public void createParty(){
        Scanner in = new Scanner(System.in);
        SquadFactory squadFactory;
        System.out.println("choose race");
        String race = in.nextLine().toLowerCase();
        if (race.equals("human")) {
            squadFactory = new HumanSquadFactory();
            HumanArcher archer = new HumanArcher();
            archer.shoot();
        } else if (race.equals("elf")) {
            squadFactory = new ElfSquadFactory();
            ElfMage mage = new ElfMage();
            mage.cast();
        } else {
            System.out.println("Unknown race");
            return;
        }
        makeSquad = new MakeSquad(squadFactory);
    }
}
