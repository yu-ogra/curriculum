package study;

import java.util.ArrayList;

import constants.Constants;
import language.Student;
import person.Person;
        
        
public class Task2_23 {

    public static void main(String[] args) {
        //Personクラスのインスタンスを格納するArrayListクラス型の変数persons
        ArrayList<Person> persons = new ArrayList<Person>(); 
        
        //①Personクラスの変数名「yamada」というインスタンスを作成して下さい。
        //引数には1:山田太郎 2:Java を入れて下さい。
        //また「Java」は、Constants.javaのものを扱って下さい。

        //ここに解答
        Person yamada = new Person("山田太郎",Constants.LANGUAGE_JAVA);
 
        
        //②作成した変数「yamada」を利用し名前を表示して下さい。

        //ここに解答
        System.out.println(yamada.getName());
        
        //③Personクラスの変数名「ishitani」というインスタンスを作成して下さい。
        //引数には1:石谷花子 2:HTML を入れて下さい。
        //また「HTML」は、Constants.javaのものを扱って下さい。
        
        //ここに解答
        Person ishitani = new Person("石谷花子",Constants.LANGUAGE_HTML);
        
        //④作成した変数「ishitani」を利用し学んでいる言語を表示して下さい。

        //ここに解答
        System.out.println(ishitani.getLanguage());
        
        //⑤「〇〇が△△を学んでいます」という表示で山田さん、石谷さんが何を学んでいるか出力して下さい。
        
        //ここに解答
        Student yamada1 = new Student("山田太郎",Constants.LANGUAGE_JAVA);
        yamada1.studyLanguage();
        
        Student ishitani1 = new Student("石谷花子",Constants.LANGUAGE_HTML);
        ishitani1.studyLanguage();
      
       
    }

}



    
