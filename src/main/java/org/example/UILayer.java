package org.example;

/**
 * interface User Interface Layer
 */
public interface UILayer {
    void openProject(String filename);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);

    void createModel();

    void deleteModel(int i);

}
