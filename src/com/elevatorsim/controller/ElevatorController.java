package com.elevatorsim.controller;

public interface ElevatorController {
	public enum Direction {
		UP, DOWN;
	}
	
	/**
	 * Request an elevator on a particular floor to go in a particular direction.
	 * @param floor The floor the elevator is requested on.
	 * @param dir The requested direction.
	 */
	public void request(int floor, Direction dir);
}
