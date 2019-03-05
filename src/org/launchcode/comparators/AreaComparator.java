package org.launchcode.comparators;

import org.launchcode.City;

import javax.swing.plaf.nimbus.State;
import java.util.Comparator;

public class AreaComparator implements Comparator<City> {
    /**
     * Decidees where city1 belongs in relation to city 2
     * based on the square of the area of city
     * @param city1
     * @param city2
     * @return
     */
    @Override
    public int compare(City city1, City city2) {
        if (city1.getArea()<city2.getArea()) {
            return -1;
        } else if (city1.getArea() == city2.getArea()) {
            return 0;
        } return 1;
    }
}