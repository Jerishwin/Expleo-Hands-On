package com.practice;

public class IfElseControlStructure {
	public static void main(String[] args) {
		
		boolean isMoving = true;
		int currentSpeed = 10;
		
		if(isMoving) {
			currentSpeed--;
			System.out.println("the bicycyle is stopped"+currentSpeed);
		}else {
			System.out.println("Bicycle is already stopped");
		}
	}

}
