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
import java.io.*;
public class mainClass 
{
	static BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
	static int globalHeroCount1 = 1; //tracks num of light side heroes
	static int globalHeroCount2 = 1; //tracks num of dark side heroes
	static int globalWeaponCount1 = 0; //tracks num of light side weapons
	static int globalWeaponCount2 = 0;//tracks num of dark side weapons
	static int globalArmor1 = 0; //tracks the armor value of light side
	static int globalArmor2 = 0;//tracks the armor value of dark side
	static long globalTTroops1 = 0; //tracks the num of light side troops
	static long globalTTroops2 = 0;//tracks the num of dark side troops
	static int intScoreL = 0; // track war score
	static int intScoreD = 0; // track war score

	public static void main (String [] args) throws IOException
	{	

		menu(); //calling menu

	}


	public static void menu() throws IOException
	{
		System.out.println("The LIGHT SIDE and THE DARK SIDE are the two most powerful empires of the world. Although they are the most powerful");		 // the user selects which file they want to access
		System.out.println("empires, they find themselves in conflict because of their very different ideologies and laws. ");
		System.out.println("War is not uncommon between these two empires.\n");
		System.out.println("Press enter to find out who wins the war"); //description of the application's funtionality
		String userInput1 = myInput.readLine();
		lightSideSpawn(); //spawning the lightside warriors
		darkSideSpawn(); // spawning the darkside warriors
		fight();		
		
		while (true) 
		{
			System.out.println("Do you want to see a result of a different war? type: y or n ");
			userInput1 = myInput.readLine();
			if (userInput1.equals("y"))
			{
				globalHeroCount1 = 1; //resetting all the global variables
				globalHeroCount2 = 1;
				globalWeaponCount1 = 0;
				globalWeaponCount2 = 0;
				globalArmor1 = 0;
				globalArmor2 = 0;
				globalTTroops1 = 0; 
				globalTTroops2 = 0;
				lightSideSpawn(); //rerunning the spawn functions
				darkSideSpawn();
				fight();
				

			}
			else 
			{
				scores();
				System.out.println("\nHave a great day!");
				break;
			}
		}


	}





	public static void lightSideSpawn() throws IOException
	{
		int randTroops = (int)(Math.random()*10000+1);	// generate random number of troops	

		globalTTroops1= randTroops;  //transferring the random troop number to a global variable for accessing it outside this function
		lightSideWarriors w1[] = new lightSideWarriors[randTroops]; // array to store the light side warriors
		int count = 0; //counter
		while (count < randTroops) 
		{       
											 //warrior name             //warrior Strength			//warrior armor
			w1[count] = new lightSideWarriors("warrior" + " " + count,warriorClass.setStrength(), warriorClass.intArmor); 
			//determining wheather the troop is a hero or not
			//hero requirement ---> strength > 85, should have a weapon and armor > 1
			boolean heroStatus = heroClass.setHero(w1[count].intStrength, weaponClass.setWeapon(w1[count].intArmor) ,w1[count].intArmor);
			
			if(heroStatus == true) //if the warrior is a hero
			{
				globalHeroCount1 += 1; //global hero counter
			}

			
			if(weaponClass.setWeapon(w1[count].intArmor) == true) //if the warrior has a weapon
			{
				globalWeaponCount1 += 1; //global weapon counter


			}
			globalArmor1 += w1[count].intArmor;	//total armor

			count++; //counter += 1

		}





	}


	public static void darkSideSpawn() throws IOException
	{		
		int randTroops = (int)(Math.random()*10000+1); // generate random number of troops	
		globalTTroops2 = randTroops; //transferring the random troop number to a global variable for accessing it outside this function
		darkSideWarriors w2[] = new darkSideWarriors[randTroops];  // array to store the light side warriors
		int count = 0;
		while (count <randTroops)
		{       
			 									//warrior name             //warrior Strength			//warrior armor
			w2[count] = new darkSideWarriors("warrior" + " " + count, warriorClass.setStrength(), armorClass.intArmor); 
			//determining wheather the troop is a hero or not
			//hero requirement ---> strength > 85, should have a weapon and armor > 1
			boolean heroStatus = heroClass.setHero(w2[count].intStrength, weaponClass.setWeapon(w2[count].intArmor) ,w2[count].intArmor);
			
			//if the warrior is a hero
			if(heroStatus == true)
			{
				globalHeroCount2 += 1;

			}

			if(weaponClass.setWeapon(w2[count].intArmor) == true) //if the warrior has a weapon
			{
				globalWeaponCount2 += 1;


			}
			globalArmor2 += w2[count].intArmor ; //total armor						
			count ++; // counter += 1
		}




	}


	public static void fight() 
	{

		//output the stats of both sides
		//ex: num of heroes, num of troops with weapons, total armor and total troops -
		//for both sides
		System.out.print("LIGHT SIDE heroes : " + globalHeroCount1 + " | LIGHT SIDE weapons: " + globalWeaponCount1); 
		System.out.println(" LIGHT SIDE armor : " + globalArmor1 + " | LIGHT SIDE Troops: " + globalTTroops1);
		System.out.print("DARK SIDE heroes : " + globalHeroCount2 + " | DARK SIDE weapons: " + globalWeaponCount2);
		System.out.println(" DARK SIDE armor : " + globalArmor2 + " | DARK SIDE Troops: " + globalTTroops2);
		double dblFactor1=0;
		double dblFactor2=0;
		

		dblFactor1 = (globalArmor1+globalWeaponCount1);		
		dblFactor2 = (globalArmor2+globalWeaponCount2);

		double dblPower1 = ((globalTTroops1/dblFactor1)/globalHeroCount1)*1000;
		double dblPower2 = ((globalTTroops2/dblFactor2)/globalHeroCount2)*1000;
		//determining their power with a random formula
		// power = ((n troops)/(armor+weapon))/n heroes

		if (dblPower1<dblPower2) // the lesser power wins
		{
			
			intScoreL += 1; // track war score


		}

		else if (dblPower2<dblPower1) // the lesser power wins
		{
			
			intScoreD += 1;

		}


		else if (dblFactor2 == dblFactor1)
		{
			System.out.println("draw");
			intScoreL += 0;
			intScoreD += 0;
		}

		else 
		{
			System.out.println("3rror");


		}
		
		System.out.println("WAR SCORE ");
		System.out.println("LIGHT SIDE: " + intScoreL);
		System.out.println("DARK SIDE: " + intScoreD);

	}


	public static void scores()
	{
		if (intScoreL > intScoreD)
		{
			
			System.out.println("LIGHT SIDE won");
			
			
		}
		
		else if (intScoreL < intScoreD)
		{
			System.out.println("DARK SIDE won");

		}

		else if (intScoreL == intScoreD)
		{
			System.out.println("draw");
			
		}
		
	}



}
