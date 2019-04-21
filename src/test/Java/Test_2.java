package test.Java;
/*内部类使用
 * 
 */
public class Test_2 {
	private String name ="hanako";//声明外部类变量
	static String hobby="五月雨";
	private int age =25;
	public class Inner {//声明一个内部类
		String name = "四月";
        //内部类中的方法
		public void show() { 
			//内外部类具有相同的变量时，内部类方法访问外部类成分需要使用外部类名.this.变量名 形式
			System.out.println("外部类中的name：" +   Test_2.this.name );
			System.out.println("内部类中的name：" +        name          );
			System.out.println("外部类中的age：" + age);//内部类方法可直接调用外部类所有数据
			
			System.out.println("\t");//为了分清下一个内部类输出
		}
	}
	       
	
	public static class Inner2{//声明一个静态的内部类
		 private int a =3;//声明一个静态的变量
		 String hobby="四月";
		 public void show2(){//声明方法
		System.out.println("外部类中的hobby：" +Test_2.hobby);
		System.out.println("内部类中的a：" +   a  );	 
		 }
	
	}
    
	//测试成员内部类
	public static void main(String[] args) {
     /*外部类调用内部类成员或方法时，需先建立内部类对象，通过对象名来访问   
      * 语法： 外部类名   外部类对象名=new 外部类名();
      *      内部类名  内部类对象名=外部类对象名.new 内部类名();
      *      内部类对象名.内部类方法名
      *      
      *  (创建静态内部类的对象时，可直接创建   内部类 对象名=new 内部类();  
      */
        //创建外部类的对象
		Test_2 hello = new Test_2 (); 
        //创建内部类的对象
		Inner inn = hello.new Inner()             ;
        //调用内部类对象的show方法
		inn.show();
		
		Inner2 inn2=new Inner2();//创建静态内部类对象
		inn2.show2();//调用方法
	}
}


