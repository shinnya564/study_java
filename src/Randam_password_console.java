
public class Randam_password_console extends random_password {
	public static void main(String[] args) {
		random_password p1 = new random_password();
		random_password p2 = new random_password("aaa");

		System.out.println(p1.password);
		System.out.println(p2.password);
		System.out.println(create_password());
		System.out.println(create_password().length());
	}

}
