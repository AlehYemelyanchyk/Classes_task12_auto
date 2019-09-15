package by.epam.ayem.module4.model;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auto {

    private String model;
    private List<Wheel> wheels;
    private int wheelsAmount;
    private Engine engine;

    public Auto(String model, int wheelsAmount) {
        this.model = model;
        this.wheelsAmount = wheelsAmount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    @Override
    public String toString() {
        return model + ": " + engine + " engine, " + wheelsAmount + " wheels: " + wheels;
    }
}
