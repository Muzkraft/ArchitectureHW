package org.example.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class ProductService {
    public  ArrayList<String> res;

    public void process1() {
    }

    public void process2() {
        res = null;
    }

    public Collection<String> readTextFile(File file){
        // Предусловие
        if (file.exists()){
            if (file.length() > 5000) {
                throw new RuntimeException("File too big, read failed.");
            }
        }
        else {
            throw new RuntimeException("File not found");
        }
        //TODO: read data ...
        //TODO: main code ...
        res = new ArrayList<>();
        res.add("AAAAA");
        res.add("BBBBB");

        process1();

        //invariant
        validateResult(res);

        process2();

        //invariant
        validateResult(res);

        //Постусловие
        if (res == null) {
            throw new RuntimeException("data error");
        }

        //TODO: return result

        return res;
    }

    private void validateResult(Collection<String> res) {
        if (res == null || res.size() == 0) {
            throw new RuntimeException("Incorrect object status");
        }
    }
}
