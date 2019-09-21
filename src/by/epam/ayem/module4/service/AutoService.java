package by.epam.ayem.module4.service;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import by.epam.ayem.module4.model.Auto;
import by.epam.ayem.module4.model.Engine;
import by.epam.ayem.module4.model.Wheel;
import by.epam.ayem.module4.model.WheelPosition;

public class AutoService {

    public void putEngine(Auto auto, Engine engine) {
        if (auto.getEngine() == null) {
            auto.setEngine(engine);
        } else if (auto.getEngine() != null) {
            auto.setEngine(engine);
            System.out.println("The current engine was replaced with " + engine.getEngineType());
        }
    }

    public void putWheel(Auto auto, Wheel wheel) {
        if (auto.getWheels().size() < auto.getWheelsAmount()) {
            auto.getWheels().add(wheel);
        } else {
            System.out.println("Auto has all " + auto.getWheelsAmount() + " wheels");
        }
    }

    public void changeWheel(Auto auto, WheelPosition position, Wheel wheel) {
        if (!auto.getWheels().isEmpty()) {
            for (int i = 0; i < auto.getWheels().size(); i++) {
                if (auto.getWheels().get(i).getWheelPosition().equals(position)) {
                    auto.getWheels().set(i, wheel);
                    break;
                }
            }
        } else {
            auto.getWheels().add(wheel);
        }
    }

    public void move(Auto auto) {
        System.out.println(auto.getModel() + " is moving");
    }

    public void refill(Auto auto) {
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

    public void showModel(Auto auto) {
        System.out.println("The car model is " + auto.getModel());
    }

    public void wheelsInfo(Auto auto) {
        if (auto.getWheels().isEmpty()) {
            System.out.println("There are no wheels");
        } else {
            for (Wheel wheel : auto.getWheels()) {
                System.out.println(wheel.getWheelPosition() + " - " + wheel.getWheelType());
            }
        }
    }
}
