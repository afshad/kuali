package com.elevatorsim.controller;

import java.util.Observable;
import java.util.Observer;

import com.elevatorsim.model.Elevator;

public class ElevatorController implements Observer{
	public enum Direction {
		UP, DOWN;
	}

	/**
	 * Get the one and only {@link ElevatorController} instance.
	 * @return The singleton {@link ElevatorController} instance.
	 */
	public static ElevatorController getController() {
		return null;
	}
	
	/**
	 * Request an elevator on a particular floor to go in a particular direction.
	 * @param floor The floor the elevator is requested on.
	 * @param dir The requested direction.
	 * @return The elevator.
	 */
	public Elevator request(int floor, Direction dir) {
		return null;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
