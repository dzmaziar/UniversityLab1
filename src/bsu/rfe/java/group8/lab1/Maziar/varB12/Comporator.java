package bsu.rfe.java.group8.lab1.Maziar.varB12;
import java.util.Comparator;
public class Comporator implements Comparator<Food> {
    public int compare(Food obj,Food obj2)
    {
        return -(obj.calculateCalories() - obj2.calculateCalories());
    }
}
