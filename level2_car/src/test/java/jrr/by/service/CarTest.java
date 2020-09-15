package jrr.by.service;

import jrr.by.service.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car car;

    @Before
    public void setup(){
      car = new Car("Peugeot 307","grey",220);
    }
    @Test
    public void canAccelerateTrue() {
        car.setCurrentSpeed(90);
        boolean expected = true;
        boolean actual = car.canAccelerate();

        assertEquals(expected,actual);
    }

    @Test
    public void canAccelerateFalse() {
        car.setCurrentSpeed(230);
        boolean expected = false;
        boolean actual = car.canAccelerate();

        assertEquals(expected,actual);
    }



    @Test
    public void accelerateTargetSpeedISMaxSpeed() {
        car.accelerate(220);
        int expected = 220;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }

    @Test
    public void accelerate() {
        car.accelerate(20);
        car.accelerate(40);
        car.accelerate(60);

        int expected = 60;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }

    @Test
    public void accelerateIfSetMaxSpeed() {
        car.accelerate(220);

        int expected = 220;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }
    @Test
    public void decelerate() {
        car.setCurrentSpeed(100);
        car.decelerate(60);

        int expected = 60;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }
    @Test
    public void decelerateGetZero() {
        car.decelerate(20);

        int expected = 0;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }

    @Test
    public void decelerateSetThreeValuesOfTheSpeed() {
        car.setCurrentSpeed(90);
        car.decelerate(70);
        car.decelerate(60);
        car.decelerate(40);

        int expected = 40;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }
    @Test
    public void isDrivingFalse() {
        boolean expected = false;
        boolean actual = car.isDriving();

        assertEquals(expected,actual);
    }

    @Test
    public void isDrivingTrue() {
        car.setCurrentSpeed(90);
        boolean expected = true;
        boolean actual = car.isDriving();

        assertEquals(expected,actual);
    }
    @Test
    public void isStoppedReturnTrue() {
        boolean expected = true;
        boolean actual = car.isStopped();

        assertEquals(expected,actual);
    }

    @Test
    public void isStoppedReturnFalse() {
        car.setCurrentSpeed(50);
        boolean expected = false;
        boolean actual = car.isStopped();

        assertEquals(expected,actual);
    }

    @Test
    public void testEqualsReturnTrue() {
        Car secondCar = new Car("Peugeot 307","grey",220);

        boolean expected = true;
        boolean actual =secondCar.equals(car);

        assertEquals(expected,actual);
    }

    @Test
    public void testEqualsReturnFalse() {
        Car secondCar = new Car("Peugeot 308","green",220);

        boolean expected = false;
        boolean actual =secondCar.equals(car);

        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() {
        int expected = -2068405241;
        int actual = car.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        String expected = "Car{model='Peugeot 307', color='grey', maxSpeed=220, currentSpeed=0}";
        String actual = car.toString();

        assertEquals(expected,actual);
    }




}