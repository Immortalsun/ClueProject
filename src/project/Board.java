/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Maashes Phillips, Sam Hudock
 */
public class Board {
    public static void main (String[] args){
	
		//starting probabilities	
		Weapon w = new Weapon();
                Suspect s = new Suspect();
                Room r = new Room();
		
		ArrayList<String> deck = new ArrayList(); 
                deck.add("Dagger");//0
                deck.add("Rope");
                deck.add("Lead Pipe");
                deck.add("Candle Stick");
                deck.add("Revovler");
                deck.add("Wrench");//5
                deck.add("Col. Mustard");//6
                deck.add("Prof. Plum");
                deck.add("Miss Scarlett");
                deck.add("Mr.Green");
                deck.add("Mrs.Peacock");
                deck.add("Mrs.White");//11
                deck.add("Study");//12
                deck.add("Hall");
                deck.add("Lounge");
                deck.add("Dining Room");
                deck.add("Kitchen");
                deck.add("Ballroom");
                deck.add("Conservatory");
                deck.add("Billard Room");
                deck.add("Library");//20
                
                //create solution
                Random rand = new Random();
                Player solution = new Player("","","");
                //weapon
                int index = rand.nextInt(6);
                String temp1 = deck.get(index);
                solution.setCard1(deck.get(index));               
                //suspect
                index=rand.nextInt(6)+6;
                String temp2 = deck.get(index);
                solution.setCard2(deck.get(index));
                //room
                index=rand.nextInt(9)+12;
                String temp3 = deck.get(index);
                solution.setCard3(deck.get(index));
                
                //remove solution from deck
                deck.remove(temp1);
                deck.remove(temp2);
                deck.remove(temp3);
                
		//distrubute remaining cards
		Collections.shuffle(deck);
		
		Player p1 = new Player(deck.get(0),deck.get(1),deck.get(2));
		Player p2 = new Player(deck.get(3),deck.get(4),deck.get(5));
		Player p3 = new Player(deck.get(6),deck.get(7),deck.get(8));
		Player p4 = new Player(deck.get(9),deck.get(10),deck.get(11));
		Player p5 = new Player(deck.get(12),deck.get(13),deck.get(14));
		Player p6 = new Player(deck.get(15),deck.get(16),deck.get(17));
                
                System.out.println("Done.");
			
	}
	
}
