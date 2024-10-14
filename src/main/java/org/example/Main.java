package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Editor3D editor3D = new Editor3D();
        boolean f = true;

        while (f) {
            System.out.println("*** My 3D Editor ***");
            System.out.println("====================");
            System.out.println("1. Open project");
            System.out.println("2. Save project");
            System.out.println("3. Show project settings");
            System.out.println("4. Show all project models");
            System.out.println("5. Show all project textures");
            System.out.println("6. Render all models");
            System.out.println("7. Render model");
            System.out.println("8. Create Model");
            System.out.println("9. Delete model");
            System.out.println("0. Close 3D Editor");
            System.out.println("Please choose menu item:");
            if (scanner.hasNextInt()){
                 int number = scanner.nextInt();
                 scanner.nextLine();
                 try {
                     switch (number) {
                         case 0:
                             System.out.println("Завершение работы приложения");
                             f = false;
                             break;
                         case 1:
                             System.out.println("Укажите имя файла проекта");
                             String filename = scanner.nextLine();
                             editor3D.openProject(filename);
                             System.out.println("Проект успешно открыт.");
                             break;
                         case 2:
                             editor3D.saveProject();
                             break;
                         case 3:
                             editor3D.showProjectSettings();
                             break;
                         case 4:
                             editor3D.printAllModels();
                             break;
                         case 5:
                             editor3D.printAllTextures();
                             break;
                         case 6:
                             editor3D.renderAll();
                             break;
                         case 7:
                             System.out.println("Укажите номер модели: ");
                             if (scanner.hasNextInt()){
                                 int modelNumber = scanner.nextInt();
                                 scanner.nextLine();
                                 editor3D.renderModel(modelNumber);
                             }
                             else{
                                 System.out.println("Номер модели указан неверно");
                             }
                             break;
                         case 8:
                             editor3D.createModel();
                             break;
                         case 9:
                             System.out.println("Укажите номер модели, которую желаете удалить: ");
                             if (scanner.hasNextInt()){
                                 int modelNumber = scanner.nextInt();
                                 scanner.nextLine();
                                 editor3D.deleteModel(modelNumber);
                             }
                             else{
                                 System.out.println("Номер модели указан неверно");
                             }
                             break;

                         default:
                             System.out.println("Укажите корректный пункт меню");
                     }
                 }
                 catch (Exception e){
                     System.out.println(e.getMessage());
                 }
            }
            else{
                System.out.println("Укажите корректный пункт меню");
                scanner.nextLine();
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
}