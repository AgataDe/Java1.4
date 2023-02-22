package models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String typeOfSegment;
    private Dimension dimension;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String typeOfSegment, Dimension dimension) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.typeOfSegment = typeOfSegment;
        this.dimension = dimension;
    }

    public Car() {
    }

    public List<Car> createListOfCars() {
        Producer producer = new Producer();
        Market market = new Market();
        Dimension dimension = new Dimension();

        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(producer.createListOfProducers().get(1), true,
                market.createListOfNewMarkets().get(1), typeOfSegment, dimension.createListOfDimensions().get(1)));
        allCars.add(new Car(producer.createListOfProducers().get(1), true,
                market.createListOfNewMarkets().get(0), typeOfSegment, dimension.createListOfDimensions().get(9)));
        allCars.add(new Car(producer.createListOfProducers().get(2), false,
                market.createListOfNewMarkets().get(2), typeOfSegment, dimension.createListOfDimensions().get(8)));
        allCars.add(new Car(producer.createListOfProducers().get(3), false,
                market.createListOfNewMarkets().get(3), typeOfSegment, dimension.createListOfDimensions().get(7)));
        allCars.add(new Car(producer.createListOfProducers().get(4), false,
                market.createListOfNewMarkets().get(4), typeOfSegment, dimension.createListOfDimensions().get(6)));
        allCars.add(new Car(producer.createListOfProducers().get(5), false,
                market.createListOfNewMarkets().get(0), typeOfSegment, dimension.createListOfDimensions().get(1)));
        allCars.add(new Car(producer.createListOfProducers().get(6), false,
                market.createListOfNewMarkets().get(1), typeOfSegment, dimension.createListOfDimensions().get(2)));
        allCars.add(new Car(producer.createListOfProducers().get(7), true,
                market.createListOfNewMarkets().get(2), typeOfSegment, dimension.createListOfDimensions().get(7)));
        allCars.add(new Car(producer.createListOfProducers().get(8), true,
                market.createListOfNewMarkets().get(3), typeOfSegment, dimension.createListOfDimensions().get(4)));
        allCars.add(new Car(producer.createListOfProducers().get(9), true,
                market.createListOfNewMarkets().get(4), typeOfSegment, dimension.createListOfDimensions().get(5)));
        allCars.add(new Car(producer.createListOfProducers().get(0), true,
                market.createListOfNewMarkets().get(4), typeOfSegment, dimension.createListOfDimensions().get(6)));
        allCars.add(new Car(producer.createListOfProducers().get(1), true,
                market.createListOfNewMarkets().get(0), typeOfSegment, dimension.createListOfDimensions().get(3)));
        allCars.add(new Car(producer.createListOfProducers().get(2), false,
                market.createListOfNewMarkets().get(3), typeOfSegment, dimension.createListOfDimensions().get(2)));
        allCars.add(new Car(producer.createListOfProducers().get(3), true,
                market.createListOfNewMarkets().get(3), typeOfSegment, dimension.createListOfDimensions().get(1)));
        allCars.add(new Car(producer.createListOfProducers().get(4), true,
                market.createListOfNewMarkets().get(2), typeOfSegment, dimension.createListOfDimensions().get(0)));
        return allCars;
    }

    public void printChosenOptions(String model, boolean isAutomaticGear, int trunkCapacity) {
        this.isAutomaticGear = isAutomaticGear;
        createListOfCars();
        for (Car chosenCar : createListOfCars()) {
            if (chosenCar.producer.getModel().equals(model) && chosenCar.isAutomaticGear
                    && chosenCar.dimension.getTrunkCapacity() > trunkCapacity) {
                for (int i = 0; i < 3; i++) {
                    Country marketCountry = chosenCar.market.getCountries().get(i);
                    chosenCar.market.printFullCountryName(marketCountry);
                }
            }
        }

    }

}
