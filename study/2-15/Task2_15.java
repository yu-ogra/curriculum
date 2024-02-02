package study;

/**
*
* 本課題では、インスタンス化、フィールド変数の基本的な使い方を学んでいきましょう。
* 課題範囲は以下のとおりです。
*   Task2_15: 問①から問②
* 指定された値と変数名を守って記述してください。
*
*/

public class Task2_15 {
	/**
	* ➀下記の「red」と「blue」に「static修飾子＋アクセス修飾子」を追加してください。
	*/
	final static String red = "赤";
	final static String blue = "青";

	public static void main(String[] args) {
		/**
		* ②Bikeクラスをインスタンス化してください。
		* 　下記条件にしたがって作成して下さい。
		* 条件1：インスタンス名「bike1」「bike2」でそれぞれをインスタンス化して下さい。
		* 条件2：「bike1」「bike2」に適切な引数を設定して下さい。
		*/
		Bike bike1 = new Bike(red);
		Bike bike2 = new Bike(blue,"700cc");

		bike1.run();
		System.out.println("car1は" + bike1.color + "色で" + bike1.type + "タイプです。 現在" + bike1.check());
		bike2.stop();
		System.out.println("car2は" + bike2.color + "色で" + bike2.type + "タイプです。 現在" + bike2.check());
	}
}
 
class Bike {
	String color;
	String type;
	Boolean state;

	public Bike (String color) {
		this.color = color;
		this.type = "250cc";
	}

	
	public Bike (String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	public void run() {
		this.state = true;
	}

	public void stop() {
		this.state = false;
	}

	public String check( ) {
		if(this.state) {
			return "走行中です。";
		} else {
			return "停止中です。";
		}
	}
}