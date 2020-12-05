
public class practice_for {
	public static void main(String[] args) {
		int[][] point = {
				{20, 10, 24,20},
				{22, 69, 45, 66},
				{12, 33, 6, 46}
		};

		for(int[] i : point) {
			for(int j : i) {
				System.out.print("\t" + j);
			}
			System.out.println();
		}
	}
}
