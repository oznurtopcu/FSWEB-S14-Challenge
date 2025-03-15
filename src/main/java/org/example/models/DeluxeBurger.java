package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips = "CURVY";
    private String drink = "COKE";

    public DeluxeBurger(String name, String meat, double price , String breadRollType) {
        super(name, meat, 19.10, breadRollType);
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10,"Double Sandwich");
    }

    public String getCips() {
        return cips;
    }
    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Hamburger: " + getName() + "Et: "+ getMeat() + "Ekmek Tipi: "+ getBreadRollType() + " Cips: " + getCips() + " İçecek: " + getDrink() + "  Toplam Fiyat: " + getPrice());
    }

}
