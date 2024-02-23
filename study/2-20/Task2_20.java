package study;

public class Task2_20 {

	public static void main(String[] args, Object callName) {
		//④子クラスを元にしたインスタンスを作成して下さい。(インスタンス名：child)
		Child Child = new Child(); 
		//⑤インスタンスchildでcallNameメソッドを呼び出して下さい。
		Child.callName();
		//⑥インスタンスchildでupdateメソッドを呼び出して下さい。
		Child.update();
		//⑦オーバーロードされたargumentメソッドを呼び出し解答画像になるように出力して下さい。
		class Parent{
			public void argument() {
		        System.out.println("引数が0つのものが呼び出されました。");
		    }
			
			public void argument(int number) {
		        System.out.println("引数が" + number + "つのものが呼び出されました。");
		    }
			
			public void argument(int number1, int number2) {
		        System.out.println("引数が" + (number1 + number2) + "つのものが呼び出されました。");
		    }
		}
	}
}
