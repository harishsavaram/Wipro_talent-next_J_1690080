package com.automobile.twoWheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{

	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	public String getModelName() {
		return this.modelName;
	}
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void cdPlayer() {
		System.out.println("Controlling cd player");
	}
	
}
