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
<<<<<<< HEAD
=======
                String bodyLoc;
>>>>>>> Restrictions added.
		
		ArrayList<String> deck = new ArrayList(); 
                deck.add("Dagger");//0
                deck.add("Rope");
<<<<<<< HEAD
                deck.add("Lead Pipe");
                deck.add("Candle Stick");
                deck.add("Revovler");
                deck.add("Wrench");//5
                deck.add("Col. Mustard");//6
                deck.add("Prof. Plum");
=======
                deck.add("Lead Pipe"); //2
                deck.add("Candlestick"); //3
                deck.add("Revovler");
                deck.add("Wrench");//5
                deck.add("Col.Mustard");//6
                deck.add("Prof.Plum");
>>>>>>> Restrictions added.
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
<<<<<<< HEAD
                //weapon
                int index = rand.nextInt(6);
                String temp1 = deck.get(index);
                solution.setCard1(deck.get(index));               
=======
                
                //room
                int index=rand.nextInt(9)+12;
                String temp3 = deck.get(index);
                solution.setCard3(deck.get(index));
                
>>>>>>> Restrictions added.
                //suspect
                index=rand.nextInt(6)+6;
                String temp2 = deck.get(index);
                solution.setCard2(deck.get(index));
<<<<<<< HEAD
                //room
                index=rand.nextInt(9)+12;
                String temp3 = deck.get(index);
                solution.setCard3(deck.get(index));
                
                //remove solution from deck
                deck.remove(temp1);
                deck.remove(temp2);
=======

                //weapon
                index = rand.nextInt(6);  
                
                //conditions based on murderer
                if(temp2.equals("Col.Mustard")&&index==4){
                    //make the murder weapon not the gun
                    while(index==4){
                        index= rand.nextInt(6);
                    }
                }else if(temp2.equals("Mrs.Peacock")&&index==1){
                    //make sure the weapon is not the rope
                    while(index==1){
                        index= rand.nextInt(6);
                    }
                }else if(temp2.equals("Mr.Green")){
                    //he only uses the wrench and pipe
                    index = rand.nextInt(3);               
                    //blunt = (2/3 chance)
                    if(index==1||index==2){
                        index = rand.nextInt(2);
                        if(index==0){
                          //wrench
                          index=5;  
                        }else{
                          //pipe
                          index=2;  
                        }
                        
                    }else{
                       //rope = (1/3 chance) 
                       index=1;               
                    }
                }else if(temp2.equals("Prof.Plum")||temp2.equals("Miss Scarlett")
                        &&index==0){
                    //weapon cannot be dagger
                    while(index==0){
                        index= rand.nextInt(6);
                    }
                }else if(temp2.equals("Mrs.White")){
                    //determine blunt or other
                    index = rand.nextInt(3);
                    //blunt
                    if(index==1||index==2){
                        ArrayList<Integer> rwep = new ArrayList();
                        rwep.add(2); //Pipe
                        rwep.add(3); //cStick
                        rwep.add(5); //Wrench
                        Collections.shuffle(rwep);
                        //choose one at random
                        index=rwep.get(0);
                    }else{
                        ArrayList<Integer> rwep = new ArrayList();
                        rwep.add(0); //Dagger
                        rwep.add(1); //Rope
                        rwep.add(4); //Revovler
                        Collections.shuffle(rwep);
                        //choose one at random
                        index=rwep.get(0);
                    }
                }
                String temp1 = deck.get(index);
                solution.setCard1(deck.get(index));               
                
                //location of the body based on murderer
                //if female, only adjacent rooms.
                if(temp2.equals("Miss Scarlett")||temp2.equals("Mrs.Peacock")
                    ||temp2.equals("Mrs.White")){
                    if(temp3.equals("Study")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Hall";
                        }else{
                            bodyLoc="Library";
                        }
                    }else if(temp3.equals("Hall")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Study";
                        }else{
                            bodyLoc="Lounge";
                        }
                    }else if(temp3.equals("Lounge")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Hall";
                        }else{
                            bodyLoc="Dining Room";
                        }
                    }else if(temp3.equals("Dining Room")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Lounge";
                        }else{
                            bodyLoc="Kitchen";
                        }
                    }else if(temp3.equals("Kitchen")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Dining Room";
                        }else{
                            bodyLoc="Ballroom";
                        }
                    }else if(temp3.equals("Ballroom")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Kitchen";
                        }else{
                            bodyLoc="Conservatory";
                        }
                    }else if(temp3.equals("Conservatory")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Ballroom";
                        }else{
                            bodyLoc="Billiard Room";
                        }
                    }else if(temp3.equals("Billiard Room")){
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Conservatory";
                        }else{
                            bodyLoc="Library";
                        }
                    }else{
                        index = rand.nextInt(2);
                        if(index==1){
                            bodyLoc="Billiard Room";
                        }else{
                            bodyLoc="Study";
                        }
                    }
                }else{
                    //murderer is male
                    index=rand.nextInt(9)+12;
                    bodyLoc = deck.get(index);
                }
                
                
                //remove solution from deck
                //weapon
                deck.remove(temp1);
                //suspect
                deck.remove(temp2);
                //room
>>>>>>> Restrictions added.
                deck.remove(temp3);
                
		//distrubute remaining cards
		Collections.shuffle(deck);
		
		Player p1 = new Player(deck.get(0),deck.get(1),deck.get(2));
		Player p2 = new Player(deck.get(3),deck.get(4),deck.get(5));
		Player p3 = new Player(deck.get(6),deck.get(7),deck.get(8));
		Player p4 = new Player(deck.get(9),deck.get(10),deck.get(11));
		Player p5 = new Player(deck.get(12),deck.get(13),deck.get(14));
		Player p6 = new Player(deck.get(15),deck.get(16),deck.get(17));
                
<<<<<<< HEAD
                System.out.println("Done.");
=======
                System.out.println("Body Found in the "+bodyLoc);
                
                System.out.println("Solution: ");
                System.out.println("Murderer: "+temp2);
                System.out.println("Weapon: "+temp1);
                System.out.println("Room: "+temp3);
>>>>>>> Restrictions added.
			
	}
	
}
