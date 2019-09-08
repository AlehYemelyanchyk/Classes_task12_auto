package by.epam.ayem.module4;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Auto {

    private String model;
    private Wheel[] wheels;
    private int wheelsAmount;
    private Engine engine;

    public Auto(String model, int wheelsAmount, Engine engine, Wheel... wheels) {
        this.model = model;
        this.wheels = wheels;
        this.wheelsAmount = wheelsAmount;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
