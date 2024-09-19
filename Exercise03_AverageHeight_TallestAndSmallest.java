/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise03_AverageHeight_TallestAndSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] heights = new double[4];

		heights[0] = 1.4;
		heights[1] = 1.9;
		heights[2] = 1.31;
		heights[3] = 1.2;

		double averageHeight;

		averageHeight = calculateaverageheight(heights);
		System.out.println();
		System.out.printf("Average height to 2 decimal places: %.2f%n", averageHeight);
		System.out.println();
		minValue(heights);
		System.out.println();
		maxValue(heights);

	}

	/**
	 * This Method calculates the minimum value, as well as it's index position, and
	 * prints this information to the console
	 * 
	 * @param heights - array of heights
	 */
	public static void maxValue(double[] heights) {
		double currentMax = heights[0];
		int index = 0;

		for (int i = 0; i < heights.length; i++) {
			if (currentMax <= heights[i]) {
				currentMax = heights[i];
				index = i;
			}
		}
		System.out.println("The maximum value is: " + currentMax);
		System.out.println("This value is found at the index heights [" + index + "]");
	}

	/**
	 * This Method calculates the minimum value, as well as it's index position, and
	 * prints this information to the console
	 * 
	 * @param heights - array of heights
	 */
	public static void minValue(double[] heights) {
		double currentMin = heights[0];
		int index = 0;

		for (int i = 0; i < heights.length; i++) {
			if (currentMin > heights[i]) {
				currentMin = heights[i];
				index = i;
			}
		}
		System.out.println("The minimum value is: " + currentMin);
		System.out.println("This value is found at the index heights [" + index + "]");
	}

	/**
	 * This method returns the averageHeight of the heights inputed in the array
	 * 
	 * @param heights - array of heights
	 * @return - averageHeight of inputed heights
	 */
	public static double calculateaverageheight(double[] heights) {
		double heightTotal = 0;
		double averageHeight = 0;

		for (double numbers : heights) {
			heightTotal += numbers;
		}
		averageHeight = heightTotal / heights.length;
		return averageHeight;
	}

}
