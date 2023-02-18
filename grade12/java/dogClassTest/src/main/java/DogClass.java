/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348461252
 */
public class DogClass 
{
    
        String strName; 
        String strArrName[] = new String[5];             
        String strBreed;
        int intAggression;
        int intHunger;
        int intAge;
        
        public DogClass(String strName, String strBreed, int intAggression, int intHunger, int intAge)
        {
        //assign characteristics from parameters
            this.strName = strName;
            this.strBreed = strBreed;
            this.intAggression = intAggression;
            this.intHunger = intHunger;
            this.intAge = intAge;
        }
    
        public DogClass(String strName, String strBreed)
        {
            this.strName = strName;
            this.strBreed = strBreed;
            this.intAggression = (int)(Math.random()*10+1);
            this.intHunger = (int)(Math.random()*10+1);
            this.intAge = (int)(Math.random()*10+1);
        
        }
        
        
        
        
     //set is unneccesary if you dont use it    
        public void setAge(int factor)
        {
            this.intAge = factor;
        }
    
        public void setHunger(int factor)
        {
            this.intHunger = factor;
        }

        public void setAggression(int factor)
        {
            this.intAggression = factor;
        }
        
        
        
        public int getAge()
        {
            return this.intAge;
        }

        public String getBreed()
        {
            return this.strBreed;

        }

        public String getName()
        {
            return this.strName;

        }

        public int getAggression()
        {
            return this.intAggression;
        }
    
        public void bark1()
        {
            System.out.println("WOOOF!");
        }
        public void bark2()
        {
            System.out.println("HOOWWWL!");
        }
        
        public String toString()
        {
            String dogData1 = "Name: " + this.strName + " Breed: " + this.strBreed+ "\n";
            String dogData2 = "Aggression factor: "  + this.intAggression + "\nHunger Factor: " + intHunger+"\n";
            String dogData3 = "Age: " + this.intAge + "\n";
            return dogData1 + dogData2 + dogData3;
        }
    
}



