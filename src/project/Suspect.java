/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Maashes Phillips, Sam Hudock
 */
public class Suspect {
    private double colMustard;
	private double profPlum;
	private double msScarlett;
	private double mrGreen;
	private double mrsPeacock;
	private double mrsWhite;
	
	public Suspect(){
		colMustard=profPlum=msScarlett=mrGreen=mrsPeacock=mrsWhite=(double)1/6;
	}
	
	public void setColMustard (double a){
		colMustard=a;
	}
    
	public void setProfPlum (double a){
		profPlum=a;
	}
	
	public void setMrGreen(double a){
		mrGreen=a;
	}
	
	public void setMsScarlett(double a){
		msScarlett=a;
	}
	
	public void setMrsPeacock(double a){
		mrsPeacock=a;
	}
	
	public void setMrsWhite(double a){
		mrsWhite=a;
	}
	
	public double getColMustard(){
		return colMustard;
	}
	
	public double getProfPlum(){
		return profPlum;
	}

	public double getMrGreen(){
		return mrGreen;
	}

	public double getMsScarlett(){
		return msScarlett;
	}

	public double getMrsPeacock(){
		return mrsPeacock;
	}
	
	public double getMrsWhite(){
		return mrsWhite;
	}
}
