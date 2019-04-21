package test.Java;



public class test_4 extends Test_3 {//test_4继承Test_3父类
	public int age ;
	//equals（）来比较两个对象。Eclipse会自动生成
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		test_4 other = (test_4) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override   //toString（），来显示对象的属性   Eclipse自动生成。
	public String toString() {
		return "test_4 [age=" + age + "]";
	}
	
	}
     

