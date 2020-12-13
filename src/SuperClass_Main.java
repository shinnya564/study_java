
public class SuperClass_Main extends SuperClass_Sub1{
	public SuperClass_Main(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Superclass sample1 = new SuperClass_Sub1("HP");
		System.out.println(sample1.computerInfo());
		System.out.println("値段：" + price(100000) + "円");

		Superclass sample2 = new SuperClass_Sub2("IBM");
		System.out.println(sample2.computerInfo());
		System.out.println("値段：" + price(160000) + "円");
	}
}
