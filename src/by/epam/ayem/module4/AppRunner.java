package by.epam.ayem.module4;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class AppRunner {

    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_LEFT);
        Wheel wheel2 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_RIGHT);
        Wheel wheel3 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_LEFT);
        Wheel wheel4 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_RIGHT);

        Engine engine1 = new Engine(EngineType.PETROL);

        AutoService bmw = new AutoService("BMW", 4, engine1, wheel1, wheel2, wheel3, wheel4);

        System.out.println(bmw);

        bmw.wheelsInfo();
        bmw.showModel();
        bmw.refill();
        bmw.move();

        Wheel wheel5 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_LEFT);
        Wheel wheel6 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_RIGHT);
        bmw.changeWheel(WheelPosition.FRONT_LEFT, wheel5);
        bmw.changeWheel(WheelPosition.FRONT_RIGHT, wheel6);

        System.out.println(bmw);

    }

}
