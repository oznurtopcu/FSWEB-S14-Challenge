package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + healthyExtra1Price + healthyExtra2Price;
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Hamburger: " + getName() + "Et: "+ getMeat() + "Ekmek Tipi: "+ getBreadRollType() + "Malzemeler: " + healthyExtra1Name + " , " + healthyExtra2Name + "  Toplam Fiyat: " + getPrice() );
    }
}
