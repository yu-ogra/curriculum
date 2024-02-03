package study;
/**
*
* 本課題では、フィールド変数、メソッドの基本的な使い方を学んでいきましょう。
* 課題範囲は以下のとおりです。
* Main.java: 問①から問③
* 指定された値と変数名を守って記述して下さい。
*
*/
public class Task2_16 {
    private static final int ogura = 0;
	private static final int yuu = 0;

	public static void main(String[] args) {

        //① firstNameとlastNameという名前の変数を定義し、
        // firstNameには自分の名前、lastNameには自分の名字で初期化しなさい
    	int ogura = 0;
    	int yuu = 0;
    	
    	int firstName = ogura;
    	int lastName = yuu;
    	
        //getNameメソッドの呼び出しと出力
        System.out.println(getName(firstName, lastName));
        System.out.println();

		int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		//③ arr 配列をループさせ、isOddメソッドを使って配列の要素が奇数かどうかの判定を行いなさい。
        // 要素が奇数の場合には「nは奇数です。」と出力されます。
		for (int n = 0; n < arr.length; n++) { 
	    	if(n % 2 != 0) {
	    		System.out.println(n + "は奇数です");
	    	}
	    	
		}


	}

    //② メソッドを定義しなさい。
    // メソッド名：getName
    // 修飾子：public
    // 引数には①で定義したfirstNameとlastNameを引数で受け取り、
    // 連結した値を戻り値とする変数を定義しなさい。
    
    public static void getName(String[] args) {
 
    }
    
   	int firstName = ogura; 
	int lastName = yuu;
    
    private static char[] getName(int firstName, int lastName) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
    
	//奇数の判定を行う。
    public static void isOdd(int num) {
        if(num % 2 != 0) {
            System.out.println(num + "は奇数です。");
        }
    }
}
