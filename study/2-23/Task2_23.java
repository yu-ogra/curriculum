package study;

import person.Person;
        
        
public class Task2_23 {

    public static void main(String[] args) {
        //Personクラスのインスタンスを格納するArrayListクラス型の変数persons
        ArrayList<Person> persons = new ArrayList<Person>(); 
        
        //①Personクラスの変数名「yamada」というインスタンスを作成して下さい。
        //引数には1:山田太郎 2:Java を入れて下さい。
        //また「Java」は、Constants.javaのものを扱って下さい。

        //ここに解答
        Person yamada = new Person("山田太郎","LANGUAGE_JAVA");
        
        class Person{
        	private String name;
        	private String language;
        
        public Person() {
             	this.name = "山田太郎";
             	this.language = "LANGUAGE_JAVA";
             }
        
        //②作成した変数「yamada」を利用し名前を表示して下さい。

        //ここに解答
       public void name() {
    	   System.out.println(this.name);
       }
        
        //③Personクラスの変数名「ishitani」というインスタンスを作成して下さい。
        //引数には1:石谷花子 2:HTML を入れて下さい。
        //また「HTML」は、Constants.javaのものを扱って下さい。
        
        //ここに解答
        
        
        //④作成した変数「ishitani」を利用し学んでいる言語を表示して下さい。

        //ここに解答
        
        //⑤「〇〇が△△を学んでいます」という表示で山田さん、石谷さんが何を学んでいるか出力して下さい。
        
        //ここに解答

    }

}
} 
    