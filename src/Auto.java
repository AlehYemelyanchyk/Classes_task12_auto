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

    public void showModel (){
        System.out.println("The car model is " + model);
    }

    public String getModel() {
        return model;
    }

    public void changeWheel(WheelPosition position, Wheel wheel) {
        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].getWheelPosition().toString().equals(position.toString())) {
                wheels[i] = wheel;
            }
        }
    }

    public void wheelsInfo() {
        for (Wheel wheel : wheels) {
            System.out.println(wheel.getWheelPosition() + " - " + wheel.getWheelType());
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
