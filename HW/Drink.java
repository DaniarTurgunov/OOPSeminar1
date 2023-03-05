package Seminar1.HW;

public abstract class Drink {
    protected static String name;
    protected static double volume;
    protected static double temp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Drink.name = name;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        Drink.volume = volume;
    }

    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        Drink.temp = temp;
    }

}
