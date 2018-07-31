import java.util.Arrays;

public class QuickSort {

	static int numbers[] = {199, 3, 6, 2, 9, 1, 7, 8};
	static int PivotPosition = 0;
	
	public static void main(String[] args) {
		System.out.println("Array length: " + (numbers.length -1));
		qSort(numbers, 0, (numbers.length)-1);
		System.out.println("\nThe output array is " + Arrays.toString(numbers));
	}
	
	public static void qSort(int numbers[], int left, int right) {
		if(left < right) {
			PivotPosition = Partition.p(numbers, left, right);
			qSort(numbers, left, PivotPosition - 1);
			qSort(numbers, PivotPosition + 1 , right);
		}
	}
}
