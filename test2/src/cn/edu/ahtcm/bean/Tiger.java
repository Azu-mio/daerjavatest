package cn.edu.ahtcm.bean;
/*
2019207320123 
  ������ 
21.5.11
 */
public class Tiger extends AbsAnimal {

	public Tiger(String name, int size, String color) {
		super(name, size, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��1����main������ʵ����һ��Tiger����
		Tiger t = new Tiger("̩��",100,"��ɫ");
//��2������run�������鿴������
		t.run();
	}

}
