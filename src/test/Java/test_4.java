package test.Java;



public class test_4 extends Test_3 {//test_4�̳�Test_3����
	public int age ;
	//equals�������Ƚ���������Eclipse���Զ�����
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
	@Override   //toString����������ʾ���������   Eclipse�Զ����ɡ�
	public String toString() {
		return "test_4 [age=" + age + "]";
	}
	
	}
     

