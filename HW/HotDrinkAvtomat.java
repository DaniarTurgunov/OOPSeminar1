package Seminar1.HW;

import Seminar1.HW.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkAvtomat extends Avtomat {
    List<HotDrink> hotDrinkrs = new ArrayList<>();

    void initProduct(List<HotDrink> bd) {
        this.hotDrinkrs = bd;
    }

    @Override
    String getProduct(String name) {
        for ( HotDrink p: hotDrinkrs) {
            if (p.getName().contains(name)) return p.getName() + " " + p.getVolume() +" ml" + " " + p.getTemp() + " oC";
        }
        return new HotDrink("Не найдено!", 0,0).toString();
    }
}
