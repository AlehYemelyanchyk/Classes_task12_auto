/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Engine {

    private EngineType engineType;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
    }

    public void move() {
        System.out.println("The car is moving");
    }

    public void refill(EngineType engineType) {
        switch (engineType) {
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
