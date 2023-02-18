/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjackgui_syediltefat;

import java.util.*;
import java.awt.*; 
/**
 *
 * @author 348461252
 */
public class deckClass {
    static ArrayList <Integer> cardValue = new ArrayList<Integer>();
    static ArrayList <String> cards = new ArrayList<String>();
    static Queue deck = new LinkedList();
    static int count = 0;
    
    public deckClass()
    {
    	count = 0;
    	int rand;
        while (count < 53)
        {
            rand = (int)(Math.random()*11+1);
            cardValue.add(rand);
            
            count+=1;
            
        } 
    
    }
    
    
    static void deckValues() // determines the values of the cards in the deck
    {
              
        
    	Collections.shuffle(cardValue);
        count = 0;
        
        while (count < 53)
        {
            if(cardValue.get(count) == 1 || cardValue.get(count) == 11)
            {
                cards.add("A"); 
            }     
            
            else if (cardValue.get(count) == 10)
            {
                int rand1 = (int)(Math.random()*4+1);
                
                if (rand1 == 1)
                {
                    cards.add("K");
                }
                
                 if (rand1 == 2)
                {
                	 cards.add("Q");;
                }
                 
                  if (rand1 == 3)
                {
                	  cards.add("J");;
                }
                  
                 if (rand1 == 4)
                 {
                	 cards.add("10");
                 }
            }
            else 
            {
            	cards.add(Integer.toString(cardValue.get(count)));
            }
            
            count+=1;
        }
        count = 0;
        
        while(count < 53)
        {
            deck.add(cards.get(count));   
            count+=1;
           
        }
        
        
        
        
    }

    
    static String accessDeck()
    {
              	
        return (String) deck.poll();
        
        
    }
	
    
    
    
    
    
    
    
}
