package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			if (n == 0) {
				return 0;
			}
			else {
				return geometricSum(n - 1) + Math.pow(0.5, n);
			}
		
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		// FIXME complete the recursive drawing
		if (radius < radiusMinimumDrawingThreshold) {
			return;
		}
		else {
		StdDraw.circle(xCenter, yCenter, radius);
		double newRadius = radius / 3.0;

		circlesUponCircles(xCenter + radius, yCenter, newRadius, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter - radius, yCenter, newRadius, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter + radius, newRadius, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter - radius, newRadius, radiusMinimumDrawingThreshold);
		}
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		// FIXME create a helper method that can recursively reverse the given array
		int index = 0;
		int[] newArray = new int[array.length];
	 	return toReversedHelper(array, index, newArray);
	}
	public static int[] toReversedHelper(int[] array, int index, int[] newArray) {
		boolean isEven = (array.length % 2 == 0);

		if (index == array.length / 2 && !isEven) {
			int midNum = array[array.length / 2];
			newArray[array.length/2] = midNum;
			return newArray;
		}

		else if (index == array.length / 2 && isEven) {
			return newArray;
		}

		else {
			int firstNum = array[index];
			int lastNum = array[array.length - index - 1];
			newArray[index] = lastNum;
			newArray[array.length - index - 1] = firstNum;
			return toReversedHelper(array, index + 1, newArray);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}


}