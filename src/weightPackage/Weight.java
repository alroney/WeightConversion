/**
 * 
 */
package weightPackage;

/**
 * @author Andrew Roney
 *
 */


public class Weight {
	//Attributes
	private final int OUNCES_IN_A_POUND = 16;//final indicates a constant variable. 1 pound = 16 ounces
	private int pounds;
	private double ounces;

	
//This is a constructor. This one initializes the weight value from external sources.
	public Weight(int pounds, double ounces) {
		//implementation
		this.pounds = pounds; //"this." refers to the class attributes above.
		this.ounces = ounces;
	}
	
	
//Method: Sets the pounds to ounces. 
	private double toOunces() {
		//implementation
		this.ounces += (this.pounds * OUNCES_IN_A_POUND); //Since 1lb = 16oz, we multiply the pounds by 16 and add that number to the existing ounces.
		this.pounds = 0;//All the pounds are in ounces now so we can set the value to 0 to prevent errors in the calculation.
		
		return this.ounces;//return the total ounces.
	}
	
	
//Method: Simplify the pounds and ounces. Keep ounces under 16. Convert 16 ounces to add 1 pound.
	private void normalize() {
		toOunces();//To more accurately simplify the weight we convert pounds into ounces and start from there.
		//implementation
		double oz;
		int lbs;
		
		oz = this.ounces % OUNCES_IN_A_POUND;
		lbs = (int)this.ounces / OUNCES_IN_A_POUND;
		
		this.ounces = oz;
		this.pounds = lbs;
		
	}
	
	
//Method: Make a comparison to the current weight object to the new external weight value.
	public boolean lessThan(Weight weight) {
		//implementation
		if (this.pounds < weight.pounds) //Validation: Check the first variable (this being pounds) see if they are less than each other.
			return true; // If the compared pound is less than, then wee can stop here.
		
		else if (this.pounds > weight.pounds) 
			return false;
		
		else { // If the pounds compared are equal (fails to satisfy both above statements) we check the ounces.
			if (this.ounces < weight.ounces) 
				return true;
			else
				return false;
		}
	}
	
//Method: Divide the added weights by the number of weights given.
	public Weight divideBy(int weightCount) {
		toOunces(); //Set weight to ounces for a more accurate measurement.
		this.ounces /= weightCount;
		
		return this;
	}
	
	
//Method: To begin the averaging, we add up the weights.
	public void addTo(Weight weight) {
		
		this.pounds += weight.pounds; //Add the pounds
		this.ounces += weight.ounces; //Add the ounces
		
	}
	
//Method: Print out the result.
	public String toString() {
		normalize();//Simplify weight for accurate reading.
		return pounds +" pounds "+ String.format("%.2f", ounces) +" ounces";// Return the results. Ounces will be forced to present 2 decimal places.
	}
}
