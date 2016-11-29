package tddmicroexercises.leaderboard;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RaceTest {

    @Test
    public void isShouldCalculateDriverPoints() {
        // setup

        // act

        // verify
        assertEquals(25, TestData.race1.getPoints(TestData.driver1));
        assertEquals(18, TestData.race1.getPoints(TestData.driver2));
        assertEquals(15, TestData.race1.getPoints(TestData.driver3));
    }

    @Test
    public void namesOfSelfDrivingCarsHaveSpecificDisplayName() {
        Race race = new Race("name", TestData.selfDrivingCar);
        assertEquals("Self Driving Car - Acme (1.3)", race.getDriverName(TestData.selfDrivingCar));
    }

    @Test
    public void namesOfDriversHaveSpecificDisplayName() {
        Race race = new Race("name", TestData.driver1);
        assertEquals("Nico Rosberg", race.getDriverName(TestData.driver1));
    }

    @Test
    public void raceCanHaveMoreThanThreeDrivers() {
        Race race = new Race("name", TestData.driver1,TestData.driver2, TestData.driver3, TestData.selfDrivingCar);
        assertEquals(0, race.getPoints(TestData.selfDrivingCar));
    }
}
