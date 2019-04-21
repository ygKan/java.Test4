package test.Java;
/*java中的Object练习。toString（）及equals（）方法
 */
public class Initail {

	public static void main(String[] args) {
		
		Test_3 b =new Test_3();
		System.out.println("age值" +b.age);
		// TODO Auto-generated method stub
		//创建2个对象来赋同值，运用equals（）比较异同
       test_4 hello =new test_4();
       hello.age = 12;
       test_4 hello2 =new test_4();
       hello2.age=12;
	   //if条件句判断
	   if(hello.equals(hello2)){
		   System.out.println("两个hello是一样的");
		  }else {
			System.out.println("两个hello不一样");
		  }
	   System.out.println( );
	   System.out.println(hello);
	   //使用toString（），来显示对象属性，须在子类中进行public String toString()的操作
	}

}