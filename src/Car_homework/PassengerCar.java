package Car_homework;

public class PassengerCar extends Car {

    int numberOfSeats;

    public PassengerCar(String model, String color, int productionDate,int numberOfSeats) {
        super(model, color, productionDate);
        this.numberOfSeats=numberOfSeats;
    }

    @Override
    public int getProductionDate() {
        return super.getProductionDate();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    String getColor() {
        return super.getColor();
    }

    @Override
    String getModel() {
        return super.getModel();
    }
}

