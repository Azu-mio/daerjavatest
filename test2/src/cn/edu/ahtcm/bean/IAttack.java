package cn.edu.ahtcm.bean;
/*
2019207320123 
������ 
21.5.11
 */
public interface IAttack {
	//��1��������̬�Ĳ��ɸı���ַ�������ֵADDRESS�ַ���������Ϊ"China";
	public final static String COUNTRY = "China";
	//��2��������������move������attack����
	void move();
	void attack();
	//��3������Ĭ�Ϸ���default void grow()ʵ������Ϊ��ӡ���"Insect grows fastly"
	default void grow(){
		System.out.println("Insect grows fastly");
	}
	
}
