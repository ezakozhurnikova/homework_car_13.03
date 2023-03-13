package Car_homework;

public class Car {String model;
    String color;
    int productionDate;

    public Car(String model,String color,int productionDate){
        this.color=color;
        this.model=model;
        this.productionDate=productionDate;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }

    public int getProductionDate() {
        return productionDate;
    }

    void drive(){
        System.out.println("drive");
    }
    void stop(){
        System.out.println("stop");
    }


}
