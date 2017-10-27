package com.elevatorsim.controller;

import com.elevatorsim.model.Elevator;

public interface ElevatorController {
	public enum Direction {
		UP, DOWN;
	}

	/**
	 * Request an elevator on a particular floor to go in a particular direction.
	 * @param floor The floor the elevator is requested on.
	 * @param dir The requested direction.
	 * @return The elevator.
	 */
	public Elevator request(int floor, Direction dir);
}
