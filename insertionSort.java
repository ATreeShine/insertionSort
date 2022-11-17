
import java.util.Arrays;

public class insertionSort{
	public static void sort(int unsortedArray[]) {
		for(int i = 1; i < unsortedArray.length; i++) {
			int val = unsortedArray[i];
			int k = i;
			while(k > 0 && unsortedArray[k-1]>val) {
				unsortedArray[k] = unsortedArray[k-1];
				k--;
				
			}
			unsortedArray[k] = val;
		}
	}
	public static void main(String[] args) {
		int[] randomArray = {1, 3, 8, 2, 4, 6, 2, 3};
		sort(randomArray);
		System.out.println(Arrays.toString(randomArray));

		
	}
}