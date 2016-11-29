package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Driver> results;
    private final Map<Driver, String> driverNames;

    public Race(String name, Driver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);
        this.driverNames = new HashMap<>();
        for (Driver driver : results) {
            this.driverNames.put(driver, driver.getDisplayName());
        }
    }

    public int position(Driver driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Driver driver) {
        final int position = position(driver);
        if(position > POINTS.length -1) {
            return 0;
        }
        return Race.POINTS[position];
    }

    public List<Driver> getResults() {
        return results;
    }

    public String getDriverName(Driver driver) {
        return this.driverNames.get(driver);
    }

    @Override
    public String toString() {
        return name;
    }
}
