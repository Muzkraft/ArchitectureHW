package org.example;

public class ProjectFile {
    private String filename;
    private int setting1;
    private String setting2;
    private boolean setting3;


    /**
     * Файл проекта
     * @param filename
     */
    public ProjectFile(String filename) {
//        TODO: загрузка настроек проекта из файла
        this.filename = filename;

        setting1 =1;
        setting2 = "...";
        setting3 = true;
    }

    public String getFilename() {
        return filename;
    }

    public int getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }

    public boolean getSetting3() {
        return setting3;
    }
}
