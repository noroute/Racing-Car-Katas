package tddmicroexercises.leaderboard;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelfDrivingCarTest {

    @Test
    public void driversAreNotSelfDrivingCars() {
        SelfDrivingCar selfDrivingCar = new SelfDrivingCar("1", "Company1");
        Driver driver = new Driver("1", "Company1");

        assertFalse(selfDrivingCar.equals(driver));
    }

}