package by.epam.ayem.module4.model;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import java.util.ArrayList;
import java.util.List;

public class Auto {

    private final String model;
    private final int wheelsAmount;
    private Engine engine;
    private final List<Wheel> wheels;

    public Auto(String model, EngineType engineType, int wheelsAmount) {
        this.model = model;
        this.engine = new Engine(engineType);
        this.wheelsAmount = wheelsAmount;
        this.wheels = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public List<Wheel> getWheels() {
        return wheels;
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

    @Override
    public String toString() {
        return model + ": " + engine.getEngineType() + " engine, " + wheels.size()
                + " wheels from " + wheelsAmount + ": " + wheels;
    }
}
