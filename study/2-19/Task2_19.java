package study;
/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/


//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
//②Fruits.javaをインポートしなさい。
import fruits.Fruits;

public class Task2_19 {

	public static void main(String[] args) {
    /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
    * また、課題の画像と同じ表示になるように
    * printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
    */
    	Fruits fruits = new Fruits();
    	FruitsConstants constants = new FruitsConstants();
   
    	public class Fruits{
    		public void fruits(String[] args) {
    			System.out.println("食べ物は" + fruits);
    			System.out.println(count + "個です");
    		
    		
    	public class constants{
    		public void FruitsConstants(String[] args) {
    		static String fruits = "レモン";
    		static int  count = 20;
    		}	
    		}
    		}
    }
	}
}
