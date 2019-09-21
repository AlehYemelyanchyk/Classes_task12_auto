package by.epam.ayem.module4;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import by.epam.ayem.module4.model.*;
import by.epam.ayem.module4.service.AutoService;

public class AutoMain {

    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_LEFT);
        Wheel wheel2 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_RIGHT);
        Wheel wheel3 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_LEFT);
        Wheel wheel4 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_RIGHT);

        Engine engine1 = new Engine(EngineType.PETROL);

        Auto bmw = new Auto("BMW", EngineType.DIESEL, 4);
        AutoService autoService = new AutoService();

        System.out.println(bmw);

        autoService.putEngine(bmw, engine1);
        autoService.putWheel(bmw, wheel1);
        autoService.putWheel(bmw, wheel2);
        autoService.putWheel(bmw, wheel3);
        autoService.putWheel(bmw, wheel4);
        autoService.changeWheel(bmw, WheelPosition.FRONT_LEFT, wheel1);

        System.out.println(bmw);

        autoService.wheelsInfo(bmw);
        autoService.showModel(bmw);
        autoService.refill(bmw);
        autoService.move(bmw);

        Wheel wheel5 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_LEFT);
        Wheel wheel6 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_RIGHT);
        autoService.changeWheel(bmw, WheelPosition.FRONT_LEFT, wheel5);
        autoService.changeWheel(bmw, WheelPosition.FRONT_RIGHT, wheel6);

        System.out.println(bmw);
    }
}
