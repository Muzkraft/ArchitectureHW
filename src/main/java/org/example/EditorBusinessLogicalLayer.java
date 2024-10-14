package org.example;

import java.util.Collection;
import java.util.Random;

/**
 * реализация Business Logical Layer
 */
public class EditorBusinessLogicalLayer implements BusinessLogicalLayer{

    private DatabaseAccess databaseAccess;
    private Random random = new Random();

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }



    @Override
    public void renderModel(Model3D model) {
        renderProcess(model);
    }

    @Override
    public void renderAllModels() {
        for(Model3D model: getAllModels()){
            renderProcess(model);
        }
    }


    private void renderProcess(Model3D model) {
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public Model3D addModel() {
        return databaseAccess.addModel(new Model3D());
    }

    @Override
    public void deleteModel(Model3D model) {
        databaseAccess.deleteModel(model);
    }

}
