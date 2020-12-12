
package test.testitem;

import test.Computer;
import test.testtype.Desktop;

public class ReviewVolum extends Desktop{
	public static void main(String[] args) {
		Computer sample = new Desktop();

		sample.typeChoise("IBM");
		System.out.println(sample.computerInf());
		System.out.println("値段:" + pcPrice(18000) + "円");
	}
}
