import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(123);
		list.add(456);

		for(int i : list) {
			System.out.println(i);
		}
		System.out.println();
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			int n = it.next();
			System.out.println(n);
		}
	}
}
