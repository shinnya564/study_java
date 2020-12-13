
public class SuperClass_Sub2 extends Superclass{
	private String name;
	private String type;
	public SuperClass_Sub2(String name) {
		this.name = name;
		if("HP".equals(name)== true) {
			type = "デスクトップ";
		}else {
			type = "ノートパソコン";
		}
	}
	public static double price(int price) {
		return (double)price * 1.08;
	}
	@Override
	public String computerInfo() {
		return "PC名：" + name + "\t" + "種類：" + type;
	}
}
