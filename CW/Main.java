package Seminar1.CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Avtomat avtomat = new Avtomat();
        List<Tovar> tovars = new ArrayList<>(Arrays.asList(new Tovar("pepsi", 30), new Tovar("Cola", 40),  new Tovar("snickers", 15)));
        avtomat.intProduct(tovars);
        System.out.println(avtomat.getProduct("Cola").toString());
    }
}