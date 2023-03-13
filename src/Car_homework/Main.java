package Car_homework;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Volvo","red",2023);
        System.out.println("Car is "+car.getModel());
        System.out.println("Color is "+car.getColor());
        System.out.println("Production Date is "+car.getProductionDate());
        System.out.println();
        PassengerCar passengerCar=new PassengerCar("Mersedes","blue",2020, 5);
        System.out.println("Car is "+passengerCar.getModel());
        System.out.println("Color is "+passengerCar.getColor());
        System.out.println("Production Date is "+passengerCar.getProductionDate());
        System.out.println("Number of seats is "+passengerCar.getNumberOfSeats());
        System.out.println();
        Track track=new Track("VW", "grey",2022,200);
        System.out.println("Car is "+track.getModel());
        System.out.println("Color is "+track.getColor());
        System.out.println("Production Date is "+track.getProductionDate());
        System.out.println("Number of seats is "+track.getLoadCapacity());




    }
}
