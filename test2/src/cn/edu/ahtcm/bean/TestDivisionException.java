package cn.edu.ahtcm.bean;
/*
2019207320123 
  ������ 
21.5.11
 */
import java.util.Scanner;

public class TestDivisionException {
//��1�����徲̬����divisionNum������������������������������������ʹ��throws�׳�ArithmeticException�쳣��
	public static double divisionNum(int a,int b) throws ArithmeticException {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��2��main��������ռ���������������a,b;����divisionNum����������������c��
//��3���������Ϊ0�����쳣���в���
		Scanner in = new Scanner(System.in);
		double c = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		
		try{
			 c = divisionNum(a,b);
		}catch(Exception e){
//��4����ӡ���������Ϣ�ʹ����ջ��Ϣ��
			e.printStackTrace();
//			System.out.println(e);
		}finally{			
//��5����󲻹��Ƿ��д��󶼴�ӡ���c�Ľ��������ӡ��������ϡ���
			System.out.println(c);
			System.out.println("�������");
		}
	}
}
