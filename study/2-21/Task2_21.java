package study;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * 本課題では、代表的なコレクション・フレームワークのArrayList及びHashMapを使い
 * くだものとその値段を管理するコードを記述します。
 * 
 * 問①～問④まであります。
 * 
 */
public class Task2_21 {
    
    public static final String orange = "オレンジ";
    public static final String grape = "ぶどう";
    public static final String apple = "りんご";
    public static final String pear = "梨";

    public static void main(String[] args) {
        // ① 変数名fruitsArrayListのデータ型StringでArrayListを宣言し、
        // 変数orange、grape、apple、pearの値を順に格納して下さい。
    	ArrayList<String> fruits = new ArrayList<String>();
    	
    	fruits.add("オレンジ");
    	fruits.add("ぶどう");
    	fruits.add("りんご");
    	fruits.add("梨");

        // ② 変数名fruitsHashMapのHashMapを宣言（データ型　キーはString、値はInteger）し、
        // キーにはfruitsArrayListに格納した値を格納し、
        // 値にはオレンジは150円、ぶどうは120円、りんごは180円、梨は140円を格納して下さい。
        // 値は数値のみで単位の円は入れないでください。

    	HashMap<String, String> fruitshashMap = new HashMap<String, String>();

        fruitshashMap.put("オレンジ", "150");
        fruitshashMap.put("ぶどう", "120");
        fruitshashMap.put("りんご", "180");
        fruitshashMap.put("梨", "140");
        // ③ オレンジの値段を200円に上書きしてください。

        fruitshashMap.replace("オレンジ","200");
        
        
        // ④ レッスン内容を参考に拡張for文を使い、
        // 実行結果がターミナルと同じように表示されるよう出力して下さい。
		
      
          String[] array = {"りんご", "ぶどう", "梨", "オレンジ"};
          int[] number = {180, 120, 140, 200};
            
          for (String name : array) for (int price : number)  {
           System.out.println(name + "の値段は" + price + "です。");
            }
        }
    }
          
		


    
