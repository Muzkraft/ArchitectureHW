package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Database
 */
public class EditorDatabase implements Database{

    private Random random = new Random();

    private Collection<Entity> entities;

    private final ProjectFile projectFile;

    public EditorDatabase(ProjectFile projectFile) {
        this.projectFile = projectFile;
        load();
    }

    public Collection<Entity> getAll(){
        if (entities == null) {
            entities = new ArrayList<>();
            int entCount = random.nextInt( 5, 11);
            for (int i = 0; i < entCount; i++){
                generateModelAndTextures();
            }
        }
        return entities;
    }

    private void generateModelAndTextures(){
        Model3D model3D = new Model3D();
        int texCount = random.nextInt(3);
        for (int i = 0; i < texCount; i++) {
            Texture texture = new Texture();
            model3D.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model3D);
    }
    @Override
    public void load() {
//        TODO: Загрузка всех сущностей проекта(модели, текстуры и т.д.)
    }

    @Override
    public void save() {
//        TODO: Сохранение текущего состояния всех сущностей проекта
    }

}
