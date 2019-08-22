/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class AutoMain {

    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_LEFT);
        Wheel wheel2 = new Wheel(WheelType.SUMMER, WheelPosition.BACK_RIGHT);
        Wheel wheel3 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_LEFT);
        Wheel wheel4 = new Wheel(WheelType.WINTER, WheelPosition.FRONT_RIGHT);
        Wheel wheel5 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_LEFT);
        Wheel wheel6 = new Wheel(WheelType.SUMMER, WheelPosition.FRONT_RIGHT);

        Engine engine1 = new Engine(EngineType.ELECTRIC);

        Auto auto1 = new Auto("BMW", 4, engine1, wheel1, wheel2, wheel3, wheel4);

        auto1.changeWheel(WheelPosition.FRONT_LEFT, wheel5);
        auto1.changeWheel(WheelPosition.FRONT_RIGHT, wheel6);
        
        auto1.wheelsInfo();
        auto1.showModel();
        auto1.getEngine().refill(auto1.getEngine().getEngineType());
        auto1.getEngine().move();

    }

}
