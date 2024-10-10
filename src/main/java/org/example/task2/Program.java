package org.example.task2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        DealerProvider dealerProvider = new DealerProvider(factoryProvider);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter part number: ");
            int partNumber = Integer.parseInt(scanner.nextLine());
            if (partNumber < 0){
                System.out.println("Enter correct part number, number must be positive");
                continue;
            }
            try {
                ComponentInfo componentInfo = dealerProvider.getComponent(partNumber);
                System.out.println(componentInfo);
            }catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
