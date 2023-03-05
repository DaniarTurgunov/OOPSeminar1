package Seminar1.HW;

public class HotDrink extends Drink {
    private String name;
    private double temp;
    private double volume;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getTemp() {
        return temp;
    }
    @Override
    public void setTemp(double temp) {
        this.temp = temp;
    }
    @Override
    public double getVolume() {
        return volume;
    }
    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume =" + volume + '\'' +
                ", temp =" + temp +
                '}';
    }
    public HotDrink(String name, double volume, double temp){
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }

}
