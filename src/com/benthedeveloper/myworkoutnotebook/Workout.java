package com.benthedeveloper.myworkoutnotebook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A Workout consists of a name, and a list of Exercises perfomed on a specific date.
 * Two workouts can have the same name.
 * @author Ben Harrison
 *
 */
public class Workout implements Comparable<Workout> {
	// Fields
	private String name;               // Name of the Workout
	private Date date;                 // Date of the Workout (i.e. 3/10/2014)
	private List<Exercise> exercises;  // The list of exercises for this Workout
	
	// Constructors
	public Workout(String name, Date date) {
		this.date = date;
		this.exercises = new ArrayList<Exercise>();
	}
	
	/**
	 * Gets the name of this Workout.
	 * @return The name of the Workout.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the Workout to a new name.
	 * @param newName The new name for the Workout.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Gets the date of this workout.
	 * @return The date this workout was performed as a Date object.
	 */
	public Date getDate() {
		//TODO: Probably want a method to return a formatted string like 10/15/2014
		return date;
	}
	
	/**
	 * Sets the date of this Workout to a new Date.
	 * @param newDate
	 */
	public void setDate(Date newDate) {
		//TODO: Probably want a way to set it to a new date by passing in a
		// string in the format of: MM/DD/YYYY
		date = newDate;
	}
	
	/**
	 * Workouts are sorted by date. If the dates are equal, then they are
	 * sorted by name.
	 */
	public int compareTo(Workout otherWorkout) {
		//TODO: Comparing dates probably won't work. Probably want to compare
		// just the year/month/day
		int dateComp = this.date.compareTo(otherWorkout.date);
		if (dateComp != 0) // Dates are not equal
			return dateComp;
		else
			return this.name.compareTo(otherWorkout.name);
	}
}
