/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Maashes Phillips, Sam Hudock
 */
public class Room {
	private double study;
	private double hall;
	private double lounge;
	private double diningRoom;
	private double kitchen;
	private double ballroom;
	private double conservatory;
	private double billiardRoom;
	private double library;
	
    public Room(){
		study=hall=lounge=diningRoom=kitchen=ballroom=
                conservatory=billiardRoom=library=(double)1/9;
	}
	
	public void setStudy(double a){
		study=a;
	}
	
	public void setHall(double a){
		hall=a;
	}
	
	public void setLounge(double a){
		lounge=a;
	}
	
	public void setDiningRoom(double a){
		diningRoom=a;
	}
	
	public void setKitchen(double a){
		kitchen=a;
	}
	
	public void setBallroom(double a){
		ballroom=a;
	}
	
	public void setConservatory(double a){
		conservatory=a;
	}
	
	public void setBilliardRoom(double a){
		billiardRoom=a;
	}
	
	public void setLibrary(double a){
		library=a;
	}
	
	public double getStudy(){
		return study;
	}
	
	public double getHall(){
		return hall;
	}
	
	public double getLounge(){
		return lounge;
	}
	
	public double getDiningRoom(){
		return diningRoom;
	}
	
	public double getKitchen(){
		return kitchen;
	}
	
	public double getBallroom(){
		return ballroom;
	}
	
	public double getConservatory(){
		return conservatory;
	}
	
	public double getBilliardRoom(){
		return billiardRoom;
	}
	
	public double getLibrary(){
		return library;
	}
}
