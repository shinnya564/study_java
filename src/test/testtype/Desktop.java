package test.testtype;

import test.Computer;

public class Desktop implements Computer {
	String name;
	String type;
	int price;
	@Override
	public void typeChoise(String name) {
		this.name = name;
		if("HP".equals(name)) {
			type = "デスクトップ";
		}else {
			type = "ノートパソコン";
		}
	}
	@Override
	public String computerInf() {
		return "パソコンの名前：" + name + " 種類：" + type;
	}
	public static double pcPrice(int price) {
		return (double)price * 0.92;
	}
}
