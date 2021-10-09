
package bsu.rfe.java.group8.lab1.Maziar.varB12;


public class Beef extends Food implements Nutritios{
    public String preparedness;
    public Beef(String Preparadness)
    {
        super("Мясо");
        this.preparedness = Preparadness;
    }

    public void consum()
    {
        System.out.println( "Мясо " + this.preparedness + "  съедено");
    }

    @Override
    public int calculateCalories() {
        int calories =0;
        if(this.preparedness == "с кровью")
        {
            calories+=220;
        }
        if(this.preparedness == "норма")
        {
            calories+=350;
        }
        if(this.preparedness == "прожаренное")
        {
            calories+=300;
        }
        if(this.preparedness == "с картошкой")
        {
            calories+=500;
        }
        if(this.preparedness == "с соусом барбекю")
        {
            calories+=320;
        }
        return calories;
    }
    public boolean equals(Object obj)
    {
            if(obj ==null || (!(obj instanceof Beef)))
            {
                return false;
            }
            Beef buff = (Beef) obj;
            return preparedness == buff.preparedness;
    }
    public String toString() {
        return "Мясо{" +
                "готовность='" + preparedness + '\'' +
                '}';
    }

}
