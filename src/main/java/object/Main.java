package main.java.object;

public class Main {

    public static void main(String[] args) {

        int x = 100;

        Object o = new Object();
        Object oo = new Object();
        Class<?> classO = o.getClass();
        System.out.println(classO.getName());


        System.out.println(o.toString());
        System.out.println(o.getClass());
        System.out.println(o.getClass().getName());
        System.out.println(o.hashCode());
        System.out.println(o.equals(oo));

        House house = new House(2, "white");
        House house2 = new House(2, "blue");
        System.out.println(house.equals(house2));
        Car car = new Car();
        System.out.println(house.equals(car));
        System.out.println(house.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(car.hashCode());

        System.out.println(x);

//        car.setModel("Merc");
        car.setModel("Audi");
        System.out.println(car.getModel());



        RaceCar raceCar = new RaceCar();
        raceCar.setModel("bmw");
        System.out.println(raceCar.getModel());

    }

    private static void getX(int x) {
        x += 100;
//        return x;

        System.out.println();


    }
}
