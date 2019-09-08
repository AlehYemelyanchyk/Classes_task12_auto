package by.epam.ayem.module4;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import java.util.Arrays;

public class AutoService {

    private Auto auto;

    public AutoService(String model, int wheelsAmount, Engine engine, Wheel... wheels) {
        this.auto = new Auto(model, wheelsAmount, engine, wheels);
        System.out.println(auto.getModel() + " was created.");
    }

    public void changeWheel(WheelPosition position, Wheel wheel) {
        for (int i = 0; i < auto.getWheels().length; i++) {
            if (auto.getWheels()[i].getWheelPosition().toString().equals(position.toString())) {
                auto.getWheels()[i] = wheel;
            }
        }
    }

    public Auto getAuto() {
        return auto;
    }

    public void move() {
        System.out.println("The car is moving");
    }

    public void refill() {
        switch (auto.getEngine().getEngineType()) {
            case GAS:
                System.out.println("Refill gas");
                break;
            case DIESEL:
                System.out.println("Refill diesel");
                break;
            case PETROL:
                System.out.println("Refill petrol");
                break;
            case ELECTRIC:
                System.out.println("Refill electric");
                break;
        }
    }

    public void showModel() {
        System.out.println("The car model is " + auto.getModel());
    }

    @Override
    public String toString() {
        return auto.getModel() + ": " + auto.getEngine().getEngineType() + ", " + Arrays.toString(auto.getWheels());
    }

    public void wheelsInfo() {
        for (Wheel wheel : auto.getWheels()) {
            System.out.println(wheel.getWheelPosition() + " - " + wheel.getWheelType());
        }
    }
}
