package org.example;

import java.util.Collection;

/**
 * интерфейс BLL- Business Logical Layer
 */
public interface BusinessLogicalLayer {
    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();

    Model3D addModel();
    void deleteModel(Model3D model);

    void renderModel(Model3D model);
    void renderAllModels();

}
