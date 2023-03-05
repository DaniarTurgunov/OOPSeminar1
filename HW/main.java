package Seminar1.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        HotDrinkAvtomat hda = new HotDrinkAvtomat();
        List<HotDrink> dr = new ArrayList<>(Arrays.asList(new HotDrink("Чай",0.50,46), new HotDrink("Кофе",0.30,50),
                new HotDrink("Глинтвейн", 0.80, 48)));
        hda.initProduct(dr);
        System.out.println(hda.getProduct("Чай").toString());
    }
}
