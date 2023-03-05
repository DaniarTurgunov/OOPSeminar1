package Seminar1.CW;

import java.util.ArrayList;
import java.util.List;

public class Avtomat {
    private List<Tovar> tovars = new ArrayList<>();

    public void intProduct(List<Tovar> tovars) {
        this.tovars = tovars;
    }
    public Tovar getProduct(String name){
        for(Tovar p : tovars){
            if(p.getName().equals(name)){
                return  p;
            }
        }
        return new Tovar("Продукт осутствует", 0);
    }
}
