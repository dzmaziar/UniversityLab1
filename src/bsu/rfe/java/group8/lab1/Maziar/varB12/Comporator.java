package bsu.rfe.java.group8.lab1.Maziar.varB12;
import java.util.Comparator;
public class Comporator implements Comparator<Beef> {
    public int compare(Beef obj,Beef obj2)
    {
        return -(obj.calculateCalories() - obj2.calculateCalories());
    }
}
