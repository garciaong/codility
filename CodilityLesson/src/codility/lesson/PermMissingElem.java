package codility.lesson;

import java.util.HashSet;

public class PermMissingElem {

	public static void main(String[] args) {
		int [] A = {1,2,3,4,5};
		System.out.println("Missing element : "+solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> ref = new HashSet<Integer>();
        int fullA = A.length+1;
        int size = A.length;
        for(int i=0; i<fullA; i++){
            ref.add(i+1);
        }
        for(int i=0; i<size; i++){
            ref.remove((Integer)A[i]);
        }
        return ref.iterator().next();
    }
}
