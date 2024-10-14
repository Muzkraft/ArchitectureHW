package org.example;


import java.util.ArrayList;
import java.util.Collection;

/**
 * 3D модель
 */
public class Model3D implements Entity{
    private int id;
    private static int counter;

    private Collection<Texture> textures = new ArrayList<>();

    {
        id = ++counter;
    }


    @Override
    public int getId() {
        return id;
    }

    public Model3D(){
    }

    public Model3D(Collection<Texture> textures) {
        this.textures = textures;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    @Override
    public String toString() {
        return String.format("Model #%s", id);
    }
}
