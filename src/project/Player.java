/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Maashes Phillips, Sam Hudock
 */
public class Player {
        private String  card1;
	private String  card2;
	private String card3;
	
	public Player(String  a, String  b, String  c){
		card1=a;
		card2=b;
		card3=c;
	}
	
	public String  getCard1(){
		return card1;
	}
	
	public String  getCard2(){
		return card2;
	}
	
	public String getCard3(){
		return card3;
	}
        
        public void setCard1(String a){
            card1=a;
        }
        
        public void setCard2(String a){
            card2=a;
        }
        
        public void setCard3(String a){
            card3=a;
        }
}

