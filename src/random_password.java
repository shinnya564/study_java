
public class random_password {
	public static void main(String[] args) {
		String pass = "ABCDEFGH";

		while(true) {
			int rnd = (int)(Math.random() * 10);
			if(rnd == 9) {
				break;
			}else if(rnd == 8) {
				continue;
			}else {
				String target = pass.substring(rnd, rnd + 1);
				String lowertarget = target.toLowerCase();
				pass = pass.replace(target, lowertarget);
			}
		}
		if(pass == "AbCdEfGh") {
			pass = "password";
		}else if("def".indexOf(pass) >= 0){
			pass = "define";
		}
		System.out.println(pass);
		System.out.println(pass.length());
	}
}
