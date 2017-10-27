package com.elevatorsim.simulator;

public interface Simulation {
	
	/**
	 * Create an elevator simulation.
	 * @param numberOfElevators The number of Elevators.
	 * @param numberOfFloors The number of floors.
	 */
	public void simulateElevaotrs(int numberOfElevators, int numberOfFloors);
}
