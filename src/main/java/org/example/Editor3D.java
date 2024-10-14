package org.example;

import java.util.ArrayList;

/**
 * User Interface
 */
public class Editor3D implements UILayer{
    private ProjectFile projectFile;
    private BusinessLogicalLayer businessLogicalLayer;

    private DatabaseAccess databaseAccess;
    private Database database;

    public void initialize(){
        database = new EditorDatabase(projectFile);
        databaseAccess = new EditorDatabaseAccess(database);
        businessLogicalLayer = new EditorBusinessLogicalLayer(databaseAccess);
    }

    @Override
    public void openProject(String filename) {
        projectFile = new ProjectFile(filename);
        initialize();
    }


    @Override
    public void showProjectSettings() {
//        предусловие
        checkProjectFile();

        System.out.println("*** Project V1 ***");
        System.out.println("******************");
        System.out.printf("Filename: %s\n", projectFile.getFilename());
        System.out.printf("Setting1: %d\n", projectFile.getSetting1());
        System.out.printf("Setting2: %s\n", projectFile.getSetting2());
        System.out.printf("Setting3: %s\n", projectFile.getSetting3());
        System.out.println("******************");
    }

    public void checkProjectFile(){
        if (projectFile == null){
            throw new RuntimeException("project file not found");
        }
    }

    @Override
    public void saveProject() {
        //        предусловие
        checkProjectFile();

        database.save();
        System.out.println("Project saved successfully");
    }

    @Override
    public void printAllModels() {
        //        предусловие
        checkProjectFile();

        ArrayList<Model3D> models = (ArrayList<Model3D>)businessLogicalLayer.getAllModels();
        for (int i = 0; i < models.size(); i++) {
            System.out.printf("===%d===\n", i);
            System.out.println(models.get(i));
            for (Texture texture: models.get(i).getTextures()){
                System.out.printf("\t%s\n", texture);
            }
        }

    }

    @Override
    public void printAllTextures() {
        //        предусловие
        checkProjectFile();

        ArrayList<Texture> textures = (ArrayList<Texture>)businessLogicalLayer.getAllTextures();
        for (int i = 0; i < textures.size(); i++) {
            System.out.printf("===%d===\n", i);
            System.out.println(textures.get(i));
        }
    }

    @Override
    public void renderAll() {
        //        предусловие
        checkProjectFile();

        System.out.println("Wait...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderAllModels();
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Operation complete in %d ms.\n", endTime);

    }

    @Override
    public void renderModel(int i) {
        //        предусловие
        checkProjectFile();

        ArrayList<Model3D> models = (ArrayList<Model3D>) businessLogicalLayer.getAllModels();
        if (i < 0 || i > models.size() -1) {
            throw new RuntimeException("Incorrect model number");
        }
        System.out.println("Wait...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderModel(models.get(i));
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Operation complete in %d ms.\n", endTime);

    }

    @Override
    public void createModel() {
        //        предусловие
        checkProjectFile();

        Model3D model = new Model3D();
        databaseAccess.addModel(model);
        System.out.printf("Model  %s created and added to DB\n", model);
    }

    @Override
    public void deleteModel(int i) {
        //        предусловие
        checkProjectFile();
        ArrayList<Model3D> models = (ArrayList<Model3D>) businessLogicalLayer.getAllModels();
        businessLogicalLayer.deleteModel(models.get(i-1));
        System.out.printf("Model %d deleted\n", i);
    }
}
