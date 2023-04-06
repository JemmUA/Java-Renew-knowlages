package codeBro.entity;

import codeBro.Main;

public class Driver extends Human{
     private String license;

    public Driver() {
    }

    public Driver(String name, int age) {
        super(age);
    }

    public Driver(String license) {
        this.license = license;
    }

    public Driver(String name, int age, String license) {
        super(name, age);
        this.license = license;
    }

    public void drive() {
        System.out.println(super.getName() + " drives");
        System.out.println("Now is " + Main.event);
    }

    public String getLicense() {
        return license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Name='" + super.getName() + '\'' +
                "license='" + license + '\'' +
                '}';
    }
}
