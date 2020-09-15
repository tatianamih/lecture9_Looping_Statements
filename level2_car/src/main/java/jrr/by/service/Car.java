package jrr.by.service;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int targetSpeed) {
        if (targetSpeed <= this.currentSpeed || targetSpeed > this.getMaxSpeed()) {
            return;
        }

        for (int i = this.currentSpeed; i < targetSpeed; i++) {
            this.currentSpeed += 1;
        }

    }

    public void decelerate(int targetSpeed) {
        if (this.currentSpeed - targetSpeed <= 0 || targetSpeed == 0) {
            return;
        }
        int min = this.currentSpeed - targetSpeed;
        for (int i = 0; i < min; i++) {
            this.currentSpeed -= 1;
        }
    }

    public boolean isDriving() {
        if (true) {
            return currentSpeed > 0;
        }
      return true;
    } 


    public boolean isStopped() {
        if (true) {
            return currentSpeed == 0;
        } 
            return true;
        
    }

    public boolean canAccelerate() {
        if (true) {
            return this.currentSpeed < this.maxSpeed;
        } 
            return true;
        
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
