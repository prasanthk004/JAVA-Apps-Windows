package Java.basics;

public class SecondLargest {	
int a[] = { 10, 20, 15, 30, 5, 25 };	
public static void main(String[] args) {
	SecondLargest sl = new SecondLargest();
	sl.FindSecondMax(); // Calling function to Find SecondMaximum .
}
private void FindSecondMax() {
	// TODO Auto-generated method stub
	int i;
	Integer max = null, smax = 0; 
	max = max.MIN_VALUE; // Assigning Lowest Value
	smax = max.MIN_VALUE;

	for (i = 0; i < a.length; i++) // Traversing Array TO find Second Largest Number
	{
		if (a[i] > max) {
			smax = max;
			max = a[i];
		} else if (a[i] > smax && a[i] != max) {
			smax = a[i];
		}
	}
	// Printing the Results
	System.out.println("        Largest Number : " + max);
	System.out.println(" Second Largest Number : " + smax);
}
}
 

