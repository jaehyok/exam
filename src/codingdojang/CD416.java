package codingdojang;

import java.util.ArrayList;
import java.util.List;

public class CD416 {
/*
 * http://codingdojang.com/scode/416?answer_mode=hide
 * �Ƹ��� ��������
 * ������ ���� ������ �迭��
 * [a1,a2,a3...,an,b1,b2...bn]
 * ������ ���� ���·� �ٲٽÿ�
 * [a1,b1,a2,b2.....an,bn]
 */
	public void run() {
		//String[] arr = { "a1", "a2", "a3", "a4", "b1", "b2", "b3", "b4" };
		String[] arr = { "a1", "a2", "a3", "a4", "a5", "b1", "b2", "b3", "b4", "b5" };
		List arr2 = new ArrayList<>();
		for (int i = 0; i < arr.length/2; i++) {
			arr2.add(arr[i]);
			arr2.add(arr[i + arr.length/2]);
		}
		System.out.println(arr2);
	}

}
