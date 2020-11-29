/*
 * DigiPet tester program
 */

import java.util.Scanner;

public class DigiPetTester
{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.print("Enter DigiPet name: ");
        String petName = input.next();
        System.out.print("Enter lifespan: ");
        int petLifespan = input.nextInt();
        
        DigiPet myPet = new DigiPet(petName, petLifespan);
        
        boolean keepGoing = true;
        while (myPet.getAge() <= myPet.getLifespan() && keepGoing)
        {
            System.out.println();
            myPet.showPet();
            
            System.out.print("\n(P)et, po(K)e, (F)eed, (E)xercise, (Q)uit: ");
            String userCommand = input.next();
            char command = userCommand.charAt(0);
            switch (command)
            {
                case 'P':
                case 'p':
                    myPet.pet();
                    break;
                case 'K':
                case 'k':
                    myPet.poke();
                    break;
                case 'F':
                case 'f':
                    System.out.println("Feed how much? ");
                    int amtFood = input.nextInt();
                    myPet.feed(amtFood);
                    break;
                case 'E':
                case 'e':
                    System.out.println("Exercise how much? ");
                    int amtExercise = input.nextInt();
                    myPet.exercise(amtExercise);
                    break;
                case 'Q':
                case 'q':
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Command not recognized.");
            }
        }
        
        System.out.println("Your pet expired :(");
    }
}
