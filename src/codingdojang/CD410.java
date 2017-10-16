package codingdojang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*
 * �־��� ���ڿ�(���� ���� ��ǥ�� ���еǾ� ����)�� ������ �Ʒ� ������ ���� ���α׷��� �ۼ��ϼ���.
 * 
 * ������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������
 * 
 * 1 �达�� �̾��� ���� �� �� �ΰ���?
 * 2 "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
 * 3 �ߺ��� ������ �̸��� ����ϼ���.
 * 4 �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.
 */

public class CD410 {
    private String str ="������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
    
    public void run() {
		String arr[] = str.split(",");
		//Arrays.sort(arr);
		int a1kim = 0;
		int a1lee = 0;
		int a2leejaemyung = 0;
		List<String> list = new ArrayList<>();
		for (String string : arr) {
		    if(string.startsWith("��")) {
			a1kim++;		
		    }
		    if(string.startsWith("��")) {
			a1lee++;		
		    }
		    if("���翵".equals(string))
		    {
			a2leejaemyung++;
		    }
		    list.add(string);
		}
		System.out.println(a1kim + ", " + a1lee);
		System.out.println(a2leejaemyung);
		
		List<String> uniqueList = new ArrayList<String>(new HashSet<String>(list));
		for (String string : uniqueList) {
		    System.out.println(string);
		}
		System.out.println();
		Collections.sort(uniqueList);
		for (String string : uniqueList) {
		    System.out.println(string);
		}
    }

}
