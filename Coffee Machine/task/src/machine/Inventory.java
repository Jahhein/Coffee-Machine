package machine;

public class Inventory {
    private int water=0;
    private int milk=0;
    private int beans=0;
    private int cups=0;

    public Inventory() {}

    public Inventory(int water, int milk, int beans, int cups) {
        this.water=water;
        this.milk=milk;
        this.beans=beans;
        this.cups=cups;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
}
