package models;

import java.util.ArrayList;
import java.util.List;

public class Producer {

    private String model;
    public String type;

    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public Producer() {
    }

    public String getModel() {
        return model;
    }

    public List<Producer> createListOfProducers() {
        List<Producer> allProducers = new ArrayList<>();
        allProducers.add(new Producer("Toyota", "Corolla"));
        allProducers.add(new Producer("Kia", "Carens"));
        allProducers.add(new Producer("Mazda", "3"));
        allProducers.add(new Producer("Mazda", "CX5"));
        allProducers.add(new Producer("Citroen", "C5"));
        allProducers.add(new Producer("Audi", "A6"));
        allProducers.add(new Producer("Volvo", "V50"));
        allProducers.add(new Producer("BMW", "X5"));
        allProducers.add(new Producer("Seat", "Leon"));
        allProducers.add(new Producer("Volkswagen", "Passat"));
        return allProducers;
    }


}
