package test.Java;
/*java�е�Object��ϰ��toString������equals��������
 */
public class Initail {

	public static void main(String[] args) {
		
		Test_3 b =new Test_3();
		System.out.println("ageֵ" +b.age);
		// TODO Auto-generated method stub
		//����2����������ֵͬ������equals�����Ƚ���ͬ
       test_4 hello =new test_4();
       hello.age = 12;
       test_4 hello2 =new test_4();
       hello2.age=12;
	   //if�������ж�
	   if(hello.equals(hello2)){
		   System.out.println("����hello��һ����");
		  }else {
			System.out.println("����hello��һ��");
		  }
	   System.out.println( );
	   System.out.println(hello);
	   //ʹ��toString����������ʾ�������ԣ����������н���public String toString()�Ĳ���
	}

}