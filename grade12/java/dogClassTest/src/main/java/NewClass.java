/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author 348461252
 */
public class NewClass 
{
    public static void main(String args[]) throws IOException
    {
        
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of your first dog: ");
        String strName1 = myInput.readLine();
        System.out.println("Enter name of your second dog: ");
        String strName2 = myInput.readLine();
        System.out.println("Enter breed of your first dog: ");
        String strBreed1 = myInput.readLine();
        System.out.println("Enter breed of your second dog: ");
        String strBreed2 = myInput.readLine();
        DogClass dog1 =  new DogClass(strName1, strBreed1);        
        DogClass dog2 = new DogClass(strName2, strBreed2);
        
        String dogArray[] = new String[2];
        if (dog1.getAggression() < 6 && dog2.getAggression() < 6)
        {
            System.out.println(dog1.getName() + " loves " + dog2.getName());
            dog1.bark1();
            dog2.bark1();
        }
        else if (dog1.getAggression() < 6 && dog2.getAggression() > 6)
        {
            System.out.println(dog2.getName() + " is angry at " + dog1.getName());
            dog1.bark1();
            dog2.bark2();          

        }
        
        else if (dog1.getAggression() > 6 && dog2.getAggression() < 6)
        {
            System.out.println(dog1.getName() + " is angry at " + dog2.getName());
            dog2.bark1();
            dog1.bark2();          

        }
        
        else
        {
            System.out.println("BOTH DOGS ARE ANGRY! RUN!!!!!!!!");
             dog1.bark2();          
             dog2.bark2();
        }
        
    }
}
