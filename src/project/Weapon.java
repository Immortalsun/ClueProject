/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Maashes Phillips, Sam Hudock
 */
public class Weapon {
	private double candlestick;
	private double rope;
	private double leadPipe;
	private double dagger;
	private double wrench;
	private double revolver;
	
	public Weapon(){
		candlestick=rope=leadPipe=dagger=wrench=revolver=(double)1/6;
	}
	
	public void setCandlestick (double a){
		candlestick=a;
	}
    
	public void setRope (double a){
		rope=a;
	}
	
	public void setLeadPipe(double a){
		leadPipe=a;
	}
	
	public void setDagger(double a){
		dagger=a;
	}
	
	public void setWrench(double a){
		wrench=a;
	}
	
	public void setRevolver(double a){
		revolver=a;
	}
	
	public double getCandlestick(){
		return candlestick;
	}
	
	public double getRope(){
		return rope;
	}

	public double getLeadPipe(){
		return leadPipe;
	}

	public double getDagger(){
		return dagger;
	}

	public double getWrench(){
		return wrench;
	}
	
	public double getRevolver(){
		return revolver;
	}

}
