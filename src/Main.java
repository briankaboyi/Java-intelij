// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args){
        int num1 =4;
        int num2 = 8;
    House newhouse = new House(8,true,"red");
    newhouse.openDoor();
        newhouse.allSpecs();

    Car raptor = new Car("green",4,"v8");
    Car.startEngine();
    System.out.println(raptor.color);
    raptor.specs();


        int result = num1 + num2;
        System.out.println(result);
    }

    public static class Car{
        String color;
        int seats;
        String engine;



        //methods
        static void startEngine(){
            System.out.println("vroom");
        }

        void specs(){
            System.out.println("color: "+color);
            System.out.println("seats: "+seats);
            System.out.println("engine: "+ engine);


        }


//constructor
        public Car(String color,int seats,String engine){
            this.color = color;
            this.seats = seats;
            this.engine = engine;
        }

    }
}