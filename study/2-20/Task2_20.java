package study;

public class Task2_20 {

	private static int number=1;
	private static int number1=1;
	private static int number2=1;
	

	public static void main(String[] args) {
		//④子クラスを元にしたインスタンスを作成して下さい。(インスタンス名：child)
		Child Child = new Child(); 
		//⑤インスタンスchildでcallNameメソッドを呼び出して下さい。
		Child.callName();
		//⑥インスタンスchildでupdateメソッドを呼び出して下さい。
		Child.update();
		//⑦オーバーロードされたargumentメソッドを呼び出し解答画像になるように出力して下さい。
		Parent argument = new Parent();
		
		System.out.println("引数が0つのものが呼び出されました。");
		System.out.println("引数が" + number + "つのものが呼び出されました。");		
		System.out.println("引数が" + (number1 + number2) + "つのものが呼び出されました。");
	}
}
