package cn.edu.ahtcm.bean;
/*
2019207320123 
  ������ 
21.5.11
 */
//��1���̳�Insect��ʵ�ֽӿ�IAttack
public class Ant extends Insect implements IAttack {

	public Ant(String name, int size, String color) {
		super(name, size, color);
		// TODO Auto-generated constructor stub
	}
//��2��ʵ��move������������ӡ���"Ant move slowly"��
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ant move slowly");
	}
//��3��ʵ��attack������������ӡ���"Ant bite people"��
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Ant bite people");
	}
//��4����д�����run������������ӡ���"Ant walk step by step";	
	@Override
	void run(Insect a) {
		// TODO Auto-generated method stub
		System.out.println("Ant walk step by step");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��5����main����newһ��Antʵ�����󣬸�ֵ������a��Ant a = new Ant(��)����move��attack��run��grow����

		Ant a = new Ant("����a",1,"��ɫ");
		a.move();
		a.attack();
		a.run(a);
		a.grow();
	}

}
