package test.Java;
/*�ڲ���ʹ��
 * 
 */
public class Test_2 {
	private String name ="hanako";//�����ⲿ�����
	static String hobby="������";
	private int age =25;
	public class Inner {//����һ���ڲ���
		String name = "����";
        //�ڲ����еķ���
		public void show() { 
			//���ⲿ�������ͬ�ı���ʱ���ڲ��෽�������ⲿ��ɷ���Ҫʹ���ⲿ����.this.������ ��ʽ
			System.out.println("�ⲿ���е�name��" +   Test_2.this.name );
			System.out.println("�ڲ����е�name��" +        name          );
			System.out.println("�ⲿ���е�age��" + age);//�ڲ��෽����ֱ�ӵ����ⲿ����������
			
			System.out.println("\t");//Ϊ�˷�����һ���ڲ������
		}
	}
	       
	
	public static class Inner2{//����һ����̬���ڲ���
		 private int a =3;//����һ����̬�ı���
		 String hobby="����";
		 public void show2(){//��������
		System.out.println("�ⲿ���е�hobby��" +Test_2.hobby);
		System.out.println("�ڲ����е�a��" +   a  );	 
		 }
	
	}
    
	//���Գ�Ա�ڲ���
	public static void main(String[] args) {
     /*�ⲿ������ڲ����Ա�򷽷�ʱ�����Ƚ����ڲ������ͨ��������������   
      * �﷨�� �ⲿ����   �ⲿ�������=new �ⲿ����();
      *      �ڲ�����  �ڲ��������=�ⲿ�������.new �ڲ�����();
      *      �ڲ��������.�ڲ��෽����
      *      
      *  (������̬�ڲ���Ķ���ʱ����ֱ�Ӵ���   �ڲ��� ������=new �ڲ���();  
      */
        //�����ⲿ��Ķ���
		Test_2 hello = new Test_2 (); 
        //�����ڲ���Ķ���
		Inner inn = hello.new Inner()             ;
        //�����ڲ�������show����
		inn.show();
		
		Inner2 inn2=new Inner2();//������̬�ڲ������
		inn2.show2();//���÷���
	}
}


