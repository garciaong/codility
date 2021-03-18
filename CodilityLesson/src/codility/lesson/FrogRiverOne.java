package codility.lesson;

import java.util.HashSet;

public class FrogRiverOne {
	public static void main(String[] args) {
		int [] A = {1,3,1,4,5,6,8,7,2,9,4,6};
		int X = 6;
		System.out.println("Minimum time to cross river : "+solution(X, A));
	}
	
	public static int solution(int X, int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> leavesRequired = new HashSet<Integer>();
		int size = A.length;
		for(int i=1; i<=X; i++) {
			leavesRequired.add((Integer)i);
		}
		for(int i=0; i<size; i++) {
			leavesRequired.remove((Integer)A[i]);
			if(leavesRequired.isEmpty()) {
				return i;
			}
		}
		return -1;
	}
}
