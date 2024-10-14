package org.example;

import java.util.Collection;

/**
 * интерфейс DAC- Data Access Layer
 */
public interface DatabaseAccess {
    void AddEntity(Entity entity);

    void RemoveEntity(Entity entity);

    Collection<Texture> getAllTextures();

    Collection<Model3D> getAllModels();

    Model3D addModel(Model3D model);
    Collection<Entity> deleteModel(Model3D model);

}
