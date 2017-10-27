package com.elevatorsim.model;

public interface Elevator {
	public enum State {
		MOVING_UP, MOVING_DOWN, STILL, MAINTENANCE;
	}
	
	/**
	 * The current floor the elevator is on if its moving.
	 * @return  The current floor the elevator is on if its moving.
	 */
	public int getCurrentFloor();
	
	/**
	 * Is the elevator moving.
	 * @return TRUE if the elevator is moving else FALSE.
	 */
	public boolean isMoving();

	/**
	 * Get the direction the elevator is moving in.
	 * @return The direction the elevator is moving in.
	 */
	public State getDirection();
	
	/**
	 * Move the elevator up one floor.
	 */
	public void moveUp();
	/**
	 * Move the elevator down one floor.
	 */
	public void moveDown();
	
	public int getTrips();
	
	public int getFloorsPassed();
	
	public void setMaintenanceMode(boolean mode);
	
	public boolean getMaintenanceMode();
	
}
