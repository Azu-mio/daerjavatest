package cn.edu.ahtcm.bean;
/*
2019207320123 
  ������ 
21.5.11
 */
public abstract class AbsAnimal {
//��1����������name��weight��color;
	String name;
	int size;
	String color;
	
//��2���������вι��췽��;
	public AbsAnimal(String name, int size, String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}
//��3�������ܱ�����run�����������Ǵ�ӡ���"Animal run fastly";
	protected void run(){
		System.out.println("Animal run fastly");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��4����main������ʵ�����������a,AbsAnimal a = new AbsAnimal(��.) ����һ��Ϊʲô�ᱨ���������ע�͵�����䡣
//		AbsAnimal a = new AbsAnimal("����",50,"��ɫ");
		//����ԭ��:�����಻�ܱ�ʵ����ֻ�ܱ��̳�

	}
}
