/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Wheel {

    private WheelType wheelType;
    private WheelPosition wheelPosition;

    public Wheel(WheelType wheelType, WheelPosition wheelPosition) {
        this.wheelType = wheelType;
        this.wheelPosition = wheelPosition;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public WheelPosition getWheelPosition() {
        return wheelPosition;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    public void setWheelPosition(WheelPosition wheelPosition) {
        this.wheelPosition = wheelPosition;
    }
}
