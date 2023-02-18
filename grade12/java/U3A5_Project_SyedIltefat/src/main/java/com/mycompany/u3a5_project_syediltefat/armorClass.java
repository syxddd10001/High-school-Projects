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
 * Title: Classes Assignment
 */
public class armorClass 
{
    static int intArmor = 1; 
    public static int setArmor()
    {
        intArmor = (int)(Math.random()*10+1); // random armor 
        return intArmor;
    }
    
    
}
