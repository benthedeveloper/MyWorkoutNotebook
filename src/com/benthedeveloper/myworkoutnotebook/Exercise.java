package com.benthedeveloper.myworkoutnotebook;

import java.util.List;

public class Exercise {
	// Fields
	String name;  // The name of the Exercise
	int repRange; // The range of reps for this exercise (i.e. 8-12 reps is MED)
	int restTime; // The amount of rest between sets (i.e. 30s[VERY_SHORT] to 121s+[VERY_LONG])
	boolean superSet; // Is this a super-set? (2 exercises in a row with no rest between)
	boolean triSet;   // Is this a tri-set? (3 exercises in a row with no rest between)
	Exercise nextExercise; // Reference to the next exercise in a superset/tri-set (if this exercise is one)
	List<ExSet> sets;  // The list of sets this Exercise consists of
	
	// Constructors
	//TODO
	
	// Methods
	//TODO
}
