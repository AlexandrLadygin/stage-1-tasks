package traning.collections.maintask.Car;

abstract public class AbstractCar {
    private int cost;
    private int fuelConsumption;
    private int speed;

    public AbstractCar(int cost, int fuelConsumption, int speed) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
