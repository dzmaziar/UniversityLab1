package bsu.rfe.java.group8.lab1.Maziar.varB12;

public abstract class Food implements Nutritios{
    public int number;
    public String name = null;

    public Food(String name)
    {
        this.name = name;
    }
    public boolean equals(Object arg0)
    {
        if(!(arg0 instanceof Food))
        {
            return false;
        }
        if(name==null || ((Food)arg0).name==null)
        {
            return false;
        }
        return name.equals(((Food)arg0).name);
    }
    public abstract void consum();

    @Override
    public abstract int calculateCalories();

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
