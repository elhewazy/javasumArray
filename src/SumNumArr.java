
public class SumNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArray = { 10, 9, 20, 19, 18, 16, 90 };
		int num = 39;

		findTheNumbers(newArray, num);

	}

	static void findTheNumbers(int myArray[], int X) {
		int currentSum;
		for (int i = 0; i < myArray.length; i++) {
			currentSum = myArray[i];

			for (int j = i + 1; j <= myArray.length; j++) {
				if (currentSum == X) {
					int theLast = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + theLast);
					for (int k = i; k <= theLast; k++) {
						System.out.print(myArray[k] + " ");
					}
					return;
				}
				if (currentSum > X || j == myArray.length)
					break;
				currentSum = currentSum + myArray[j];
			}
		}

		System.out.println("No subarray found");
		return;
	}

}
