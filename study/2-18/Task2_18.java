package study;
    public class Task2_18 {
        public static void main(String[] args) {
        //問② Personクラスをインスタンス化し、名前「山田太郎」 年齢「23」 住所「東京都」 をカプセル化されたsetterで設定して下さい。
        
        Person person = new Person();
         person.setName("山田太郎");
         person.setAge(23);		
        person.setAddles("東京都");
        
       
      //問③ 設定した名前・年齢・住所をカプセル化されたgetterで呼び出してして下さい。
 
            System.out.println("名前は、" + person.getName() + "です。");
            System.out.println("年齢は、" + person.getAge() + "才です。");
            System.out.println("住所は、" + person.getAddles() + "です。");
        }
        


        //問① 上記変数に従って、getterとsetterを設定して下さい。
        static class Person {
            private String name = "山田太郎";
            private int age = 23;
            private String addles = "東京都";
        
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public String getAddles() {
            return addles;
        }


        public void setName(String name){
        }
        
        public void setAge(int age){
        }
        
        public void setAddles(String addles){
        }
    }
    }
        
    
    
