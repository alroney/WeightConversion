/**
 * 
 */
package weightPackage;


/**
 * @author Andrew Roney
 *
 *This Java program uses a set of weights to determine a minimum weight, a maximum weight, and an average weight.
 *In this program I demonstrate the use of private variables and methods. I also demonstrate using objects and creating instances.
 */
public class Project {
	public static void main(String[] args) {
		
		//Declaration
		Weight weight1 = new Weight(11, 3);
		Weight weight2 = new Weight(7, 20);
		Weight weight3 = new Weight(14, 6);

		
		System.out.println(weight1.toString());
		System.out.println(weight2.toString());
		System.out.println(weight3.toString());
		
		
		
		Weight minWeight = findMinimum(weight1, weight2, weight3);
		Weight maxWeight = findMaximum(weight1, weight2, weight3);
		Weight avgWeight = findAverage(weight1, weight2, weight3);
		
		System.out.println("\nThe minimum weight is "+ minWeight.toString());
		System.out.println("The maximum weight is "+ maxWeight.toString());
		System.out.println("The average weight is "+ avgWeight.toString());
	}
	
	
	/*
	 * When performing a method, w1 - w3 are the objects with weight set as Weight(pounds, ounces).
	 * I will need to check each object to ensure I calculate the method's intended result. Most likely will need to use the conversion toOunces to make an accurate calculation.
	 * After determining the correct result, return the weight with the correct result.
	 */
	
	
//Method: Check each weight to see if they are lessThan the other weights.
	private static Weight findMinimum(Weight w1, Weight w2, Weight w3) {
		
		if ((w1.lessThan(w2)) && (w1.lessThan(w3))){//Check if weight 1 is less than all.
			return w1;
		}
		
		else if ((w2.lessThan(w1)) && (w2.lessThan(w3))){//Check if weight 2 is less than all.
			return w2;
		}

		else if ((w3.lessThan(w1)) && (w3.lessThan(w2))){//Check if weight 3 is less than all.
			return w3;
		}
		
		else
			return null;//This would indicate they are all equal.
		
	}
	
	
//Method: Check each weight if they are not lessThan the other weights.
	private static Weight findMaximum(Weight w1, Weight w2, Weight w3) {
		
		if (!(w1.lessThan(w2)) && !(w1.lessThan(w3))){//Check if weight 1 is less than all.
			return w1;
		}
		
		else if (!(w2.lessThan(w1)) && !(w2.lessThan(w3))){//Check if weight 2 is less than all.
			return w2;
		}

		else if (!(w3.lessThan(w1)) && !(w3.lessThan(w2))){//Check if weight 3 is less than all.
			return w3;
		}
		
		else
			return null;//This would indicate they are all equal.
	}
	
//Method: Calculate the average by adding the weights together and dividing the total by the number of weights given.
	private static Weight findAverage(Weight w1, Weight w2, Weight w3) {
		
		Weight avgWeight;//Declare an avgWeight object.
		w1.addTo(w2);
		w1.addTo(w3);//Add the two other weights to the first one.
		
		avgWeight = w1.divideBy(3);//Divide by 3 and get the average.
		
		return avgWeight;
	}
}