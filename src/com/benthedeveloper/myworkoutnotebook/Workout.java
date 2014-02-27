package com.benthedeveloper.myworkoutnotebook;

import java.util.Date;
import java.util.List;

/**
 * A workout consists of 
 * @author Ben Harrison
 *
 */
public class Workout {
	// Fields
	private String name;               // Name of the Workout
	private Date date;                 // Date of the Workout (i.e. 3/10/2014)
	private List<Exercise> exercises;  // The list of exercises for this Workout
	
	// Constructors
	public Workout(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	/**
	 * Sets the name of the Workout.
	 * @param newName New name for the workout.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Gets the name of the Workout.
	 * @return The name of the workout.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the date of this Workout to a new Date.
	 * @param newDate
	 */
	public void setDate(Date newDate) {
		date = newDate;
	}
}
