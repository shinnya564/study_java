public class For_practice {
	static int[] getS() {
		int[] point = new int[10];
		for (int i = 0; i < point.length; i++) {
			point[i] = i;
		}
		return point;
	}
	public static void main(String[] args) {
		for (int i : getS()) {
			System.out.println(i);
		}
	}
}
