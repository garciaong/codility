package codility.lesson;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int [] A = {3,1,2,4,3};
		System.out.println("Smallest Difference : "+solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int size = A.length;
		int total = 0;
		int [] diff = new int[size-1];
		for(int i=0; i<size; i++) {
			total += A[i];
		}
		int firstPartSum = 0;
		int secondPartSum = 0;
		for(int i=0; i<size-1; i++) {
			firstPartSum += A[i];
			secondPartSum = total - firstPartSum;
			diff[i]=Math.abs(firstPartSum-secondPartSum);
		}
		Arrays.sort(diff);
		return diff[0];
	}
}
