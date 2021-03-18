package codility.lesson;

import java.util.Arrays;

public class MaxCounters {
	public static void main(String[] args) {
		int [] A = {3,1,2,4,3,6,5};
//		int [] A = {};
		int N = 5;
		System.out.println("Final counters : "+Arrays.toString(solution(N,A)));
	}
	
	public static int [] solution(int N, int[] A) {
        // write your code in Java SE 8
		int size = A.length;
		int max = 0;
		int [] result = new int[N]; 
		for(int i=0; i<size; i++) {
			int current = A[i];
			
			if(1<=current && current<=N) {
				result[current-1]=result[current-1]+1;
				if(result[current-1] > max) {
					max = result[current-1];
				}
			}
			if(current == N+1) {
				Arrays.fill(result, max);
			}
		}
		return result;
	}
}
