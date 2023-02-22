package models;

import java.util.ArrayList;
import java.util.List;

public class Dimension {

    public int high;
    public int width;
    private int trunkCapacity;

    public Dimension(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public Dimension() {
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public List<Dimension> createListOfDimensions() {
        List<Dimension> allDimensions = new ArrayList<>();
        allDimensions.add(new Dimension(75, 145, 240));
        allDimensions.add(new Dimension(77, 150, 245));
        allDimensions.add(new Dimension(78, 151, 246));
        allDimensions.add(new Dimension(79, 155, 248));
        allDimensions.add(new Dimension(81, 157, 250));
        allDimensions.add(new Dimension(84, 166, 255));
        allDimensions.add(new Dimension(88, 167, 305));
        allDimensions.add(new Dimension(90, 171, 310));
        allDimensions.add(new Dimension(91, 174, 317));
        allDimensions.add(new Dimension(95, 177, 381));
        return allDimensions;
    }

}
