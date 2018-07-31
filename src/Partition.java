public class Partition {

	static int temp;
	
	public static int p(int numbers[], int left, int right) {
		while(left < right) {
			
			while(numbers[left] <= numbers[right] && left < right) {
				left += 1;
			}
			temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			
			while(numbers[left] <= numbers[right] && left < right) {
				right -= 1;
			}
			temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
		}
		return left;
	}
}
