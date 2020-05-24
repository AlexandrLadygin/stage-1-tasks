package traning.collections.maintask.Car;

import traning.collections.maintask.Models.PassengerCarBodies.Body;
import traning.collections.maintask.Models.PassengerType;

public class PassengerCar extends AbstractCar {

    private PassengerType model;
    private int seatingPositions;
    private Body body;


    public PassengerCar(int cost, int fuelConsumption, int speed, PassengerType model, int seatingPositions, Body body) {
        super(cost, fuelConsumption, speed);
        this.model = model;
        this.seatingPositions = seatingPositions;
        this.body = body;
    }

    public PassengerType getModel() {
        return model;
    }

    public void setModel(PassengerType model) {
        this.model = model;
    }

    public int getSeatingPositions() {
        return seatingPositions;
    }

    public void setSeatingPositions(int seatingPositions) {
        this.seatingPositions = seatingPositions;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "cost= " + this.getCost() +
                ", fuelConsumption= " + this.getFuelConsumption() +
                ", speed= " + this.getSpeed() +
                ", model= " + model +
                ", seatingPositions= " + seatingPositions +
                ", body= " + body +
                '}';
    }
}
