package com.example.day5.encapsulation;

public class GetSetModelDemo {
	
	String model;
	String make;
	String color;
	int milesPerGallon;
	int doorCount;
	String engineType;
	String trim;
	
	public GetSetModelDemo() {
	}
	
	public GetSetModelDemo(String model, String make, String color, int milesPerGallon, int doorCount,
			String engineType, String trim) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.milesPerGallon = milesPerGallon;
		this.doorCount = doorCount;
		this.engineType = engineType;
		this.trim = trim;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMilesPerGallon() {
		return milesPerGallon;
	}
	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	public int getDoorCount() {
		return doorCount;
	}
	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}

//	@Override
//	public String toString() {
//		return "GetSetModelDemo [model=" + model + ", make=" + make + ", color=" + color + ", milesPerGallon="
//				+ milesPerGallon + ", doorCount=" + doorCount + ", engineType=" + engineType + ", trim=" + trim + "]";
//	}


	

}
