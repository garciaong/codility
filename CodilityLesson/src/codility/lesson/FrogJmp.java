package codility.lesson;

public class FrogJmp {
	public static void main(String[] args) {
		/**
		 * start coordinate = x
		 * destination coordinate = y
		 * distance of each jump = d
		 * find minumum jump needed
		 */
		int x = 10;
		int y = 130;
		int d = 30;
		System.out.println("Total jump made : "+solution(x,y,d));
		
	}
	
	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		double gap = (double)(Y-X)/D;
		int jumps = (int)Math.ceil(gap);
		return jumps;
	}
}
