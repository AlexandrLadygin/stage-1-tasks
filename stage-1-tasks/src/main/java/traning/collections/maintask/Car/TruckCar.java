package traning.collections.maintask.Car;

import traning.collections.maintask.Models.TruckType;

public class TruckCar extends AbstractCar{

    private TruckType model;
    private int carryingCapacity;
    private int bodySpace;

    public TruckCar(int cost, int fuelConsumption, int speed, TruckType model, int carryingCapacity, int bodySpace) {
        super(cost, fuelConsumption, speed);
        this.model = model;
        this.carryingCapacity = carryingCapacity;
        this.bodySpace = bodySpace;
    }

    public TruckType getModel() {
        return model;
    }

    public void setModel(TruckType model) {
        this.model = model;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public double getBodySpace() {
        return bodySpace;
    }

    public void setBodySpace(int bodySpace) {
        this.bodySpace = bodySpace;
    }

    @Override
    public String toString() {
        return "TruckCar{" +
                "cost= " + this.getCost() +
                ", fuelConsumption= " + this.getFuelConsumption() +
                ", speed= " + this.getSpeed() +
                ", model=" + model +
                ", carryingCapacity=" + carryingCapacity +
                ", bodySpace=" + bodySpace +
                '}';
    }
}
