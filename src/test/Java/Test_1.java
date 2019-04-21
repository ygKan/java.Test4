package test.Java;
/*目的：关键字 this ，修饰符及setter/getter用法
 * 封装时：属性用private修饰，方法用public修饰
 */
public class Test_1 {
	private int age;//声明成员变量
    private String name;
    
    public void show(){
    	System.out.println("age:"+age+" name:"+name);
    }
	public int getAge() {//source中可以自动生成getter/setter方法
		return age;
	}
	public void setAge(int age) {//参数名与属性名相同，为了区分用this，
		this.age = age; //表明age参数的值付给（this.对象的属性）
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.show();//this.方法名（）; 可以直接调用该方法
	}
    public static void main(String[] args){
    	Test_1 hello =new Test_1();
    	hello.age=34;
    	hello.name="tanaka";
    	System.out.println(hello.age);
    	hello.show();
    }

}
