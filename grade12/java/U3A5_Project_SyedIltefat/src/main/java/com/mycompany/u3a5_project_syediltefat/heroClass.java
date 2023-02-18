/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.u3a5_project_syediltefat;

/**
 * Name: Syed Iltefat
 * Date: 19/10/2020
 * Assignment: Unit 3 Assignment 5
 * Title: classes assignment
 */
public class heroClass extends warriorClass
{
	//determining wheather the troop is a hero or not
	//a warrior doesnt HAVE to be a hero
    public heroClass(String name, int strength, int armor)
    {
        super(name,strength, armor);
    
    }
    static boolean setHero(int Strength, boolean weapon, int armor)
    {
    	
		//hero requirement ---> strength > 85, should have a weapon and armor > 1
        if(Strength > 85 && weapon == true && armor > 1) 
        {
        	
            return true;
        
        }
        else
        {
            return false;
        }
    
    }
}
