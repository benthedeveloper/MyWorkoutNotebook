package com.benthedeveloper.myworkoutnotebook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * An Exercise consists of a name, a rep-range, a rest time (rest between sets), a 
 * superSet flag which indicates to do another Exercise immediately after this one, 
 * and a List of ExSet objects.
 * @author Ben Harrison
 *
 */
public class Exercise {
	// Fields
	String name;  // The name of the Exercise
	int repRange; // The range of reps for this exercise (i.e. 8-12 reps is MED)
	int restTime; // The amount of rest between sets (i.e. 30s[VERY_SHORT] to 121s+[VERY_LONG])
	boolean superSet; // Is this a super-set? (2 exercises in a row with no rest between)
	Date date;        // The date this exercise was performed
	List<ExSet> sets;  // The list of sets this Exercise consists of
	
	// Constructors
	public Exercise(String name, int repRange, int restTime, boolean superSet, Date date) {
		this.name = name;
		this.repRange = repRange;
		this.restTime = restTime;
		this.superSet = superSet;
		this.date = date;
		sets = new ArrayList<ExSet>();
	}
	
	// Methods
	// getName
	// setName
	// getRestTime
	// setRestTime
	// isSuperSet (if it's a superSet, display the next exercise in the same box)
	
	//TODO more methods
}
