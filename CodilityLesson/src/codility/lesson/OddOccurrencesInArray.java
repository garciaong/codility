package codility.lesson;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = {5,7,5,6,1,2,3,1,2,3,6};
		System.out.println("Before Sort : "+Arrays.toString(A));
		
		System.out.println("Odd number is : "+solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        if(size==0)return -1;
        Arrays.sort(A);
		int startIndex = 0;
		int currentValue = A[startIndex];
		while((startIndex+1 < size) 
				&& A[startIndex] == A[startIndex+1]) {
			 startIndex = startIndex+2;
			 currentValue = A[startIndex];
		}
        return currentValue;
    }
	
}
