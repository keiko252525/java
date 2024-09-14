package sample;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//氏名
		String name = "竹田 桂子";
		//年齢
		int age = 27;
		//趣味
		String hobby = "料理";
		/*自己紹介文を出力する処理*/
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("趣味は" + hobby + "です。");
		
		method1();
		method2(); 
		
	}
	
	public static String method1() {
		return "竹田";
		
	}
	public static String method2() {
		return "桂子";}
	
}
