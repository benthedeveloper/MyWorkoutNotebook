package com.benthedeveloper.myworkoutnotebook;

/**
 * RestTime is an enum to describe the length of rest between sets during an exercise.
 * For example, on one workout the user might be lifting heavy weights, and wants to
 * rest about 120s between sets. On another date he/she might be lifting lighter weights
 * and rest for a short amount of time between sets (30s) to improve endurance. Keeping
 * track of the rest time between sets allows the user to compare exercises at that
 * particular rest time.
 * @author Ben Harrison
 *
 */
public enum RestTime {
	VERY_SHORT,
	SHORT,
	MED,
	LONG,
	VERY_LONG;
}
