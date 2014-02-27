package com.benthedeveloper.myworkoutnotebook;

/**
 * Defines a Set for an exercise. For example, a user could do 3 sets of 20 reps.
 * Using the name "ExSet" so this class isn't confused with Java's "Set" interface.
 * @author Ben Harrison
 *
 */
public class ExSet {
	// Fields
	private int weight;  // The weight this set was performed at, in lbs
	private int reps;    // The number of reps performed for this set
	
	// Constructors
	public ExSet(int weight, int reps) {
		this.weight = weight;
		this.reps = reps;
	}
	
	// Methods
	/**
	 * Gets the weight for this set.
	 * @return the weight for this set in lbs.
	 */
	public int getWeight() {
		return weight;
	}
	
	/**
	 * Gets the weight for this set in kg instead of lbs.
	 * @return The weight of this set in kg (rounded to nearest integer)
	 */
	public int getWeightInKg() {
		return (int)Math.round(weight * 0.453592);
	}
	
	/**
	 * Sets the weight for this set.
	 * @param newWeight The new weight (in lbs.) for this set.
	 */
	public void setWeight(int newWeight) {
		weight = newWeight;
	}
	
	/**
	 * Gets the number of reps performed for this set
	 * @return The number of reps performed for this set
	 */
	public int getReps() {
		return reps;
	}
	
	/**
	 * Sets the number of reps to a new integer.
	 * @param newReps The new number of reps
	 */
	public void setReps(int newReps) {
		reps = newReps;
	}
	
}
