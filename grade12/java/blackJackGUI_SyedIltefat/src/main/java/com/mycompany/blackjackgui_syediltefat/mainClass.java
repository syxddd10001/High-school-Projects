/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjackgui_syediltefat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.stream.IntStream;

import javax.swing.*;

/**Name: Syed Iltefat      
 *Date: 09/11/2020
 *Purpose: BlackJack
 *Title: Assignment 09 
 */

public class mainClass {

	static JLabel lblDealerCard1 = new JLabel("CARD 1 DEALER");
	static JLabel lblPlayerCard1= new JLabel("CARD 1 PLAYER");
	static JLabel lblDealerCard2 = new JLabel("?");
	static JLabel lblPlayerPoints= new JLabel("POINTS");
	static JLabel lblDealerPoints= new JLabel("POINTS");

	static JLabel lblStat =  new JLabel(" ");


	static int FinalPointsDl = 0;
	static int FinalPointsPl = 0;

	static JButton btnHit = new JButton("Hit");
	static JButton btnStand = new JButton("Stand");
	static JButton btnShuffle = new JButton("Shuffle Deck");
	static JButton btnNew = new JButton("new round");

	static boolean stand = true;
	static boolean status=true;
	static String winloss;

	static int dealerPoints = 0;
	static int playerPoints = 0;
	static ArrayList <String> arrayDealerC = new ArrayList<String>();
	static ArrayList <String> arrayPlayerC = new ArrayList<String>();
	static deckClass deck1 = new deckClass();

	static JFrame frame;
	static JPanel DealerPanel;
	static JPanel PlayerPanel;
	static JPanel CenterPanel;
	private static void GUILayout() // main GUI layout
	{

		winloss  = " ";
		frame = new JFrame("black jack ");         
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		dealerPoints = 0;
		playerPoints = 0;
		DealerPanel = new JPanel(); 
		PlayerPanel = new JPanel();
		CenterPanel = new JPanel();
		//set Layout managers 
		DealerPanel.setLayout(new GridLayout(0,1)); 
		CenterPanel.setLayout(new BoxLayout(CenterPanel, BoxLayout.LINE_AXIS)); 
		PlayerPanel.setLayout(new GridLayout(0,1)); 


		lblDealerCard1 = new JLabel(arrayDealerC.get(0));
		lblPlayerCard1 = new JLabel(arrayPlayerC.toString());
		lblDealerPoints = new JLabel(Integer.toString(dealerPoints));
		lblPlayerPoints = new JLabel(Integer.toString(playerPoints));
		//text inputs and parsing


		ButtonHandler onClick = new ButtonHandler();  
		ButtonHandler onClick2 = new ButtonHandler(); 
		btnHit.addActionListener(onClick);
		btnStand.addActionListener(onClick);
		btnShuffle.addActionListener(onClick2);
		btnNew.addActionListener(onClick2);
		//attach an event listener to the button    
		DealerPanel.add(lblDealerPoints);
		DealerPanel.add(lblDealerCard1);
		DealerPanel.add(Box.createRigidArea(new Dimension(20, 0))); 

		CenterPanel.add(lblStat);
		CenterPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		CenterPanel.add(btnHit);
		CenterPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		CenterPanel.add(btnStand);
		CenterPanel.add(Box.createRigidArea(new Dimension(20, 0)));
		CenterPanel.add(btnShuffle);
		CenterPanel.add(Box.createRigidArea(new Dimension(20, 0)));

		CenterPanel.add(btnNew);

		PlayerPanel.add(lblPlayerPoints);
		PlayerPanel.add(lblPlayerCard1);
		PlayerPanel.add(Box.createRigidArea(new Dimension(10, 0))); 

		//btn1.addActionListener(onClick); 		

		//buttons and labels
		//add components to bottomPanel

		Container contentPane = frame.getContentPane();//add each panel 
		contentPane.add(DealerPanel,BorderLayout.NORTH); 
		contentPane.add(CenterPanel, BorderLayout.CENTER);
		contentPane.add(PlayerPanel, BorderLayout.SOUTH);

		frame.setSize(450,350);
		frame.setVisible(true);

	}

	public static void main(String[] args) // run GUI
	{

		


		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{
				deck1.deckValues();
				addCards(arrayDealerC);
				addCards(arrayPlayerC);
				addCards(arrayPlayerC);
				GUILayout();
			}
		});


	} 
	static int count = 0;
	private static class ButtonHandler implements ActionListener 
	{ // handles all button presses      



		public void actionPerformed(ActionEvent e) 
		{


			if(deck1.deck.isEmpty())
			{
				if (FinalPointsPl < FinalPointsDl)
				{
					lblStat.setText("DEALER IS THE WINNER WITH " + FinalPointsDl + " ROUND WINS ");
				}
				
				else
				{
					lblStat.setText("YOU ARE THE WINNER WITH " + FinalPointsPl + "WINS ROUND ");
					
				}
			}

			if (e.getSource() == btnHit)
			{
				if(!deck1.deck.isEmpty() && status == true)
				{

					addCards(arrayPlayerC);


				}
				else
				{


					lblPlayerPoints.setText("player points: "+ Integer.toString(playerPoints));
					lblDealerPoints.setText("dealer points: "+ Integer.toString(dealerPoints));

				}
				lblPlayerCard1.setText(arrayPlayerC.toString());

			}


			if (e.getSource() == btnStand)
			{

				points();
				if(!deck1.deck.isEmpty())
				{

					for(int d = 0; d < 3; d++) 
					{
						addCards(arrayDealerC);

					}
					//System.out.println(dealerPoints);

				}
				lblDealerCard1.setText(arrayDealerC.toString());
				points();
				winner();
				lblStat.setText(winloss);
				status = false;
				lblPlayerPoints.setText("player points: "+ Integer.toString(playerPoints));
				lblDealerPoints.setText("dealer points: "+ Integer.toString(dealerPoints));




			}

			if(e.getSource() == btnShuffle)
			{
				deck1.deckValues();

			}

			if(e.getSource() == btnNew)
			{
				arrayDealerC.removeAll(arrayDealerC);
				arrayPlayerC.removeAll(arrayPlayerC);
				dealerPoints = 0;
				playerPoints = 0;

				status = true;
				addCards(arrayDealerC);
				addCards(arrayPlayerC);
				addCards(arrayPlayerC);
				
				lblStat.setText(" ");
				lblDealerCard1.setText(arrayDealerC.get(0));
				lblPlayerCard1.setText(arrayPlayerC.toString());
				lblDealerPoints.setText(Integer.toString(dealerPoints));
				lblPlayerPoints.setText(Integer.toString(playerPoints));
				
			}



		}
	}







	static void addCards(ArrayList <String> x) 
	{

		x.add(deck1.accessDeck());



	}

	static void points()
	{
		count = 0;
		int tempArray[] = new int[arrayPlayerC.size()];

		while(count < arrayPlayerC.size())
		{

			if(arrayPlayerC.get(count) == "Q" || arrayPlayerC.get(count) == "J" || arrayPlayerC.get(count) == "K")
			{  			
				tempArray[count] = 10;		
			}


			else if(arrayPlayerC.get(count) == "A")
			{

				tempArray[count] = 1;


			}

			else
			{
				tempArray[count] = Integer.parseInt(arrayPlayerC.get(count));



			}
			count+=1;


		}


		count = 0;
		playerPoints = IntStream.of(tempArray).sum();

		int tempArray2[] = new int[arrayDealerC.size()];
		count = 0;
		while(count < arrayDealerC.size())
		{

			if(arrayDealerC.get(count) == "Q" || arrayDealerC.get(count) == "J" || arrayDealerC.get(count) == "K")
			{  			
				tempArray2[count] = 10;		
			}




			else if(arrayDealerC.get(count) == "A")
			{
				if(dealerPoints>10)
				{
					tempArray2[count] = 11;
				}

				else
				{
					tempArray2[count] = 1;

				}
			}

			else
			{
				tempArray2[count] = Integer.parseInt(arrayDealerC.get(count));



			}

			count+=1;

		}

		count = 0;
		dealerPoints = IntStream.of(tempArray2).sum();

		if (playerPoints > 21)
		{
			status = false;
		}
		System.out.println(playerPoints);

	}

	static void winner()
	{


		if (playerPoints > 21 && dealerPoints < playerPoints)
		{
			status = false;
			winloss = "you lose";
			FinalPointsDl +=1; 
		}

		else if (dealerPoints <= 21 && dealerPoints > playerPoints)
		{

			status = false;
			winloss = "dealer wins";
			FinalPointsDl +=1; 

		}
		else if (dealerPoints > 21)
		{

			status = false;
			winloss = "dealer lost";
			FinalPointsDl +=1;
		}

		else if (playerPoints <= 21 && dealerPoints < playerPoints)
		{

			status = false;
			winloss = "you win";
			FinalPointsPl +=1; 
		}

		else if (playerPoints == dealerPoints)
		{
			status = false;
			winloss = "draw";
		}



	}



}
