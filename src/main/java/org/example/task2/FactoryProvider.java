package org.example.task2;

import java.util.ArrayList;

/**
 * details factory
 */
public class FactoryProvider {
    ArrayList<ComponentInfo> components = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            components.add(new ComponentInfo(900000 + i, String.format("component description %d", 900000 + i)));
        }
    }

    {
        for (int i = 0; i < 5; i++) {
            components.add(new ComponentInfo(1000 + i, String.format("component description %d", 1000 + i)));
        }
    }

    /**
     * get detail info by id
     * @param id
     * @throws RuntimeException описание ошибки
     * @return detail info
     */
    public ComponentInfo getComponentInfo(int id) throws RuntimeException{
        //предусловие
        if (id < 0)
            throw new RuntimeException("incorrect component id");
        if (String.valueOf(id).length() < 6)
            throw new RuntimeException("incorrect component id. Component exists but obsolete.");

//        выполнение основного кода подпрограммы
        ComponentInfo searchComponent = null;
        for(ComponentInfo componentInfo: components) {
            if (componentInfo.getId() == id) {
                searchComponent = componentInfo;
                break;
            }
        }

        // Постусловие
//        if (searchComponent == null)
//            throw new RuntimeException("component not found");

        return searchComponent;
    }
}
