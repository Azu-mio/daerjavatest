package cn.edu.ahtcm.bean;
/*
2019207320123 
  ������ 
21.5.11
 */
public class TestArrayBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��1�������ַ�������s��������{��Apple��,��pear��,��banana��}��
		String s[] = {"apple","pear","banana"};
//��2��ѭ����ӡ���ÿ��Ԫ�أ������±�Խ������쳣����
		try{
			for(int i=0;i<4;i++){
				System.out.println(s[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
//��3����󲻹��Ƿ��д��󶼴�ӡ�������ӡ��ϡ���
			System.out.println("��ӡ���");
		}
		
	}
}


