/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.u3a5_project_syediltefat;

import java.io.*;

/**
 * Name: Syed Iltefat
 * Date: 19/10/2020
 * Assignment: Unit 3 Assignment 5
 * Title: Classes Assignment
 */

public class warriorClass
{
    static BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
    static String strName; // warrior name
    static int intStrength; //  warrior strength
    static int intArmor;  //  warrior armor
    static boolean hero; // hero/not hero
    
    weaponClass weapon1 = new weaponClass(); // weapon
    
    //warriors must have a weapon and armor
    //if the warrior has too much armor, he cannot carry a weapon
    public warriorClass(String strName, int intStrength,int intArmor)
    {
        
        warriorClass.strName = strName;
        warriorClass.intStrength = intStrength; 
        warriorClass.intArmor = armorClass.setArmor(); // setting the armor
        
     
    }
    
    public static int setStrength()
    {
    	intStrength = (int)(Math.random()*100+1); // setting  a random strength
    	return intStrength;
    	
    }
    
    
    
    
    
}
