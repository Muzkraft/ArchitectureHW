package org.example.task2;

/**
 * dealer
 */
public class DealerProvider {
    private final FactoryProvider factoryProvider;

    public DealerProvider(FactoryProvider factoryProvider){
        this.factoryProvider = factoryProvider;
    }

    /**
     *
     * @param id
     * @return
     */
    public ComponentInfo getComponent(int id){

        //предусловие
//
//        if (id < 0 || String.valueOf(id).length() < 6)
//            throw new RuntimeException("Incorrect detail id");
//        return factoryProvider.getComponentInfo(id);

        // выполнение основного кода подпрограммы
        ComponentInfo componentInfo = factoryProvider.getComponentInfo(id);

        //постуловие

        if (componentInfo == null)
            throw new RuntimeException("Component not found");

        return componentInfo;
    }
}
