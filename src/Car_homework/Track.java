package Car_homework;

public class Track extends Car{

    int loadCapacity;

    public Track(String model, String color, int productionDate, int loadCapacity) {
        super(model, color, productionDate);
        this.loadCapacity=loadCapacity;

    }

    @Override
    public int getProductionDate() {
        return super.getProductionDate();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    String getModel() {
        return super.getModel();
    }

    @Override
    String getColor() {
        return super.getColor();
    }
}
