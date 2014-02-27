package com.benthedeveloper.myworkoutnotebook;

/**
 * RepRange is an enum to describe the range of reps the user is trying to stay within
 * for a given exercise. For example, if a user is doing a bicep workout and they
 * want to build muscle, they might want to be in the 8-12 rep range (MED). However,
 * during a later workout they may want to focus on gaining strength only, so they
 * might do the 2-7 rep range (LOW). Keeping track of the rep range for a particular
 * exercise allows the user to try to lift a bit in that range at a later date.
 * @author Ben Harrison
 *
 */
public enum RepRange {
	MAX,   // 1-rep max
	LOW,   // 2-7 rep range
	MED,   // 8-12 rep range
	HIGH;  // 13 or more reps
}
