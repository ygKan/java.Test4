package test.Java;
/*Ŀ�ģ��ؼ��� this �����η���setter/getter�÷�
 * ��װʱ��������private���Σ�������public����
 */
public class Test_1 {
	private int age;//������Ա����
    private String name;
    
    public void show(){
    	System.out.println("age:"+age+" name:"+name);
    }
	public int getAge() {//source�п����Զ�����getter/setter����
		return age;
	}
	public void setAge(int age) {//����������������ͬ��Ϊ��������this��
		this.age = age; //����age������ֵ������this.��������ԣ�
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.show();//this.����������; ����ֱ�ӵ��ø÷���
	}
    public static void main(String[] args){
    	Test_1 hello =new Test_1();
    	hello.age=34;
    	hello.name="tanaka";
    	System.out.println(hello.age);
    	hello.show();
    }

}
