package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * имплементация DAC
 */
public class EditorDatabaseAccess implements DatabaseAccess{


    private final Database editorDatabase;

    public EditorDatabaseAccess(Database editorDatabase) {
        this.editorDatabase = editorDatabase;
    }


    @Override
    public void AddEntity(Entity entity) {
        editorDatabase.getAll().add(entity);
    }

    @Override
    public void RemoveEntity(Entity entity) {
        editorDatabase.getAll().remove(entity);
    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> textures = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()){
            if (entity instanceof Texture) {
                textures.add((Texture) entity);
            }
        }
        return textures;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()) {
            if (entity instanceof Model3D) {
                models.add((Model3D) entity);
            }
        }
        return models;
    }

    @Override
    public Model3D addModel(Model3D model){
        editorDatabase.getAll().add(model);
        return model;
    }

    @Override
    public Collection<Entity> deleteModel(Model3D model) {
        Collection<Entity> models = editorDatabase.getAll();
        Iterator<Entity> model3DIterator = models.iterator();
        while (model3DIterator.hasNext()) {
            Entity nextModel = model3DIterator.next();
            if (nextModel.equals(model)) {
                model3DIterator.remove();
            }
        }
        return models;
    }
}

