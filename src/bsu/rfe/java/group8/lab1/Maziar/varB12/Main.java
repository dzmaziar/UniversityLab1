
package bsu.rfe.java.group8.lab1.Maziar.varB12;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Food> feedback = new ArrayList<Food>();
        Food[] breakfast = new Food[5];
        feedback.add(new Beef("норма"));
        feedback.add(new Beef("с кровью"));
        feedback.add(new Beef("с картошкой"));
        feedback.add(new Beef("с кровью"));
        feedback.add(new Beef("с соусом барбекю"));
        boolean sort = true;
        boolean calor = true;
        int j=0;
        for (int i = 0; i < feedback.size(); i++) {
            if (feedback.get(i).equals("-calories")) {
                calor = true;
                continue;
            }
            if (feedback.get(i).equals("-sort")) {
                sort = true;
                continue;
            }
        }
        for (int i = 0; i < feedback.size(); i++) {
            if (feedback.get(i) == null)
            {break;}

            feedback.get(i).consum();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (calor)
        {
            int sum=0;
            for(int i =0;i<feedback.size();i++)
            {
                sum+=feedback.get(i).calculateCalories();
            }
            System.out.println("full callories = " + sum);
        }

        for(int i=0;i<feedback.size();i++)
        {
            breakfast[i]=feedback.get(i);
        }
        if (sort) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Отсортировано по калорийности в обратном порядке");
            System.out.println();
            Arrays.sort(breakfast, new Comporator());
        }
        for (int i = 0; i < breakfast.length; i++)
        {
            if (breakfast[i] == null) continue;
            System.out.println(breakfast[i].toString() + "    " + breakfast[i].calculateCalories());
        }
        int kol=0;
        for (int i = 0; i < breakfast.length; i++)
        {

           if(feedback.get(i).equals(feedback.get(1)))
           {
               kol++;
           }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println(feedback.get(1).toString() + " в завтраке " + "    " + kol);
    }
}
