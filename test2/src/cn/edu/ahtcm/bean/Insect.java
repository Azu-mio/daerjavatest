package cn.edu.ahtcm.bean;
/*
 2019207320123 
   ������ 
 21.5.11
  */
public class Insect {
	//��1����������name��size��color
	String name;
	int size;
	String color;
	
	//��2���������вι��췽��;
	public Insect(String name, int size, String color) {
		super();
		this.name = name;
		this.size = size;
		this.color = color;
	}
	//��3�����ɳ�Ա������get��set������
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

	//��4������run���� void run(Insect a)��ӡ����˭���ܣ����ղ���ΪInsect���ͣ�
	void run(Insect a){
		System.out.println(a.name +" is running");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��5����main�������Ը���newһ��ʵ������i������run������Ȼ���ӡ���i��name��size��color
		Insect i = new Insect("���",3,"��ɫ");
		i.run(i);
		System.out.println(i.name);
		System.out.println(i.size);
		System.out.println(i.color);
	}


}
