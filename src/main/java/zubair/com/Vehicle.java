package zubair.com;

public class Vehicle extends Engine {
    private String name;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // Vehicle attribute
    public void Hoot() {                    // Vehicle method
        System.out.println("Peep, Peep!");
    }

    @Override
    public void engineSound() {
        System.out.println("Ratatatatata!");
    }
}
