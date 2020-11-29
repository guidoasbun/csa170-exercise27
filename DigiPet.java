/*
 * Guido Asbun
 * CS A-170
 * 29-November-2020
 * 
 * Exercise 27
 */

public class DigiPet
{
    // instance variables (representing the attributes/state of a DigiPet)
    private String name;
    private int lifespan;   // max age (in cycles)
    private int age;        // current age (in cycles, each action performed causes a cycle to pass)
    private int mood;       // (2 = joyful, 1 = happy, 0 = neutral, -1 = sad, -2 = angry)
    private int size;

    // Default constructor
    public DigiPet()
    {
        name = "(noname)";
        lifespan = 12;
        age = 0;
        size = 1;
        mood = 0;
    }

    // Overloaded constructor
    public DigiPet(String newName, int newLifespan)
    {
        // Initialize all five fields as appropriate:
        // Your code here:
        
        
    }

    // Makes a pet one cylcle older and checks if the pet is at the end of its life
    private void makeOlder()
    {
        age++;
        if (age >= lifespan)
        {
            name = "Zombie " + name;
        }
    }
    
    // Accessor method for age
    public int getAge()
    {
        return age;
    }
    
    // Accessor method for lifespan
    public int getLifespan()
    {
        return lifespan;
    }
    
    public void poke()
    {
        // Your code here
        
    }

    public void pet()
    {
        // Your code here
        
    }
    
    public void feed(int amount)
    {
        // Your code here
        
    }

    public void exercise(int amount)
    {
        // Your code here
        
    }

    // (Optional) Modify this method to customize your pet's "appearance" 
    public void showPet()
    {
        System.out.println(name + " (" + age + "/" + lifespan + ")");
        
        System.out.print("~");  // tail
        for (int i = 0; i < size; i++)
        {
            System.out.print("#");  // body segment
        }
        System.out.print("@");  // head
        
        System.out.print(" --(i'm so ");
        switch (mood)
        {
            case 2: System.out.print("joyful!"); break;
            case 1: System.out.print("happy"); break;
            case -1: System.out.print("sad"); break;
            case -2: System.out.print("angry!"); break;
            default: System.out.print("meh");
        }
        System.out.println(")");
    }
}
