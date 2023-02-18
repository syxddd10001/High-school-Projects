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
public class weaponClass 
{

    static int intWeaponPower;
    
    // if the armor is too heavy, the warrior should not have a weapon.
    
    static boolean setWeapon(int armor) 
    {
        if (armor > 7)
        {
            
            return false;
        
        }
    
        
        else 
        {
            
            return true;
        }
        
    }
    
    
}
