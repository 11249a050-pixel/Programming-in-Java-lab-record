class Vehicle{
    Vehicle(){
    System.out.println("htis is a Vehicle");
}
}
class Car extends Vehicle{
    Car(){
        System.out.println("this Vehicle is car");
    }
}
public class test{
    public static void main(String[] args){
        Car obj = new Car();
    }
}
