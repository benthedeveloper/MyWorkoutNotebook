package com.benthedeveloper.myworkoutnotebook;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The User class contains state and behavior for the app's user. For example, it keeps
 * track of the user's current weight, lean body mass, etc.
 * @author Ben Harrison
 *
 */
public class User {
	// Constants
	public static final double LB_TO_KG_CONVERSION = 0.453592; // Conversion-factor for lb->kg
	public static final double KG_TO_LB_CONVERSION = 2.20462;  // Conversion-factor for kg->lb
	
	
	// Fields
	private String name;       // user's name
	private String goal;       // user's goal (e.g. "I want to get to 150lbs by 3/30/14, because...")
	private double weight;     // user's current weight in lbs to the nearest 1/10 lb (i.e. 150.3)
	private double bfPercent;  // user's body fat percentage (i.e. 0.125 is 12.5% body fat)
	private double lbm;        // user's lean body mass in lbs to the nearest 1/10 lb
	
	
	// Constructors
	// Blank user constructor
	public User() {
		this("", "", 0.0, 0.0, 0.0);
	}
	
	// Actual constructor
	public User(String name, String goal, double weight, double bfPercent, double lbm) {
		this.name = name;
		this.goal = goal;
		this.weight = weight;
		this.bfPercent = bfPercent;
		this.lbm = lbm;
	}
	
	/**
	 * Get the user's name.
	 * @return the user's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the user's name
	 * @param newName The user's new name.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Get's the user's goal.
	 * @return A String that represents the user's goal
	 */
	public String getGoal() {
		return goal;
	}
	
	/**
	 * Sets the user's goal to a new goal. User should be encouraged to set specific goals, 
	 * e.g. "I want to get to 150lbs and 10% body fat by 5/30, so I'll look good and feel
	 * great on my vacation to Vegas.
	 * @param newGoal A string representing the user's new goal.
	 */
	public void setGoal(String newGoal) {
		goal = newGoal;
	}
	
	/**
	 * Gets the user's weight. If the "metric" parameter is true, then returns the user's
	 * weight in kg, otherwise it returns the user's weight in lbs.
	 * @param metric Use true if you want to get the weight in kgs, use false if you want to get
	 * 		  the weight in lbs.
	 * @return The user's weight, rounded to 1 decimal place.
	 */
	public double getWeight(boolean metric) {
		if (metric)
			return round(weight * LB_TO_KG_CONVERSION, 1);
		else
			return weight;
	}
	
	/**
	 * Sets the user's weight to a new weight in lbs. After setting the new weight in lbs, the
	 * user's new LBM is calculated as well.
	 * @param newWeight The user's new weight, in lbs or kg.
	 * @param metric Use "true" if the newWeight is in kg, use "false" if the newWeight
	 * 		  is in lbs.
	 */
	public void setWeight(double newWeight, boolean metric) {
		if (newWeight <= 0)
			throw new IllegalArgumentException("newWeight must be > 0");
		if (metric)
			weight = round(newWeight * KG_TO_LB_CONVERSION, 1);  // convert to lbs, round to 1 decimal place
		else
			weight = round(newWeight, 1); // round to 1 decimal place
		updateLBM(); // also update user's LBM
	}
	
	/**
	 * Gets the user's body fat percentage as a double between 0 and 100.0.
	 * @return The user's body fat percentage (i.e. 12.5)
	 */
	public double getBFPercent() {
		return round(bfPercent * 100.0, 1); // Round to 1 decimal place
	}
	
	/**
	 * Sets the user's new body fat percentage as a decimal (i.e. 0.143). After setting
	 * the user's new bodyfat percentage, the user's new LBM is updated as well.
	 * @param newBFPercent The new body fat percentage (i.e. 14.3)
	 */
	public void setBFPercent(double newBFPercent) {
		if (newBFPercent <= 0 || newBFPercent >= 100)
			throw new IllegalArgumentException("newBFPercent must be > 0.0 and < 100.0");
		// Store the new bfPercent rounded to 3 decimal places (i.e. 12.5 -> 0.125)
		bfPercent = round(newBFPercent / 100.0, 3);
		updateLBM(); // Also update the user's current LBM
	}
	
	/**
	 * Gets the user's current lean body mass (LBM). If "metric" is true, returns the weight
	 * in kg. If "metric" is false, returns the weight in lbs.
	 * @param metric Use metric==true to get kg, metric==false to get lbs.
	 * @return The user's current lean body mass (LBM) in lbs or kg, rounded to 1 decimal place.
	 */
	public double getLBM(boolean metric) {
		if (metric)
			return round(lbm * LB_TO_KG_CONVERSION, 1);
		else
			return lbm;
	}
	
	/**
	 * Calculates and updates the user's new lean body mass (LBM), based on the user's
	 * current weight and current body fat percentage.
	 * lbm and weight are saved in lbs. User can get kgs using the "get" methods.
	 * The LBM formula is:
	 * LBM = weight * bodyfatpercent
	 */
	private void updateLBM() {
		lbm = round(weight * bfPercent, 1);
	}
	
	
	/**
	 * Rounding utility method to round doubles.
	 * @param value The original value to round (double).
	 * @param places The number of decimal places to round to.
	 * @return The original value as a double, rounded to the number of decimal places passed in.
	 */
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException("Decimal places must be >= 0 when using round method");

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}