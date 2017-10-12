package codingdojang;

import java.util.HashMap;
import java.util.Map;

public class CD365 {

    /*
     * � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������. ���� ��� d(91) = 9 +
     * 1 + 91 = 101 �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101��
     * ���׷������̴�. � ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. �׷���
     * �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸�
     * �ٿ���. ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�. 1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ����
     * ���϶�.
     */

    Map<Integer, Integer> cache = new HashMap<>(5000);

    public void run() {
	int sum = 0;
	for (int i = 1; i < 5000; i++) {
	    if (isSelfNumber(i) == true) {
		sum += i;
	    }
	}
	System.out.println(sum);
    }

    private boolean isSelfNumber(int num) {
	for (int j = 1; j < num; j++) {
	    if (calcGenerator(j) == num)
		return false;
	}
	return true;
    }

    private int calcGenerator(int num) {
	int v = cache.getOrDefault(num, -1);
	if (-1 == v) {
	    int sum = num + num / 1000 + (num / 100) % 10 + (num / 10) % 10 + num % 10;
	    //System.out.println("num:" + num +" = "+ + num / 1000 + " " + (num / 100) % 10 + " " + (num / 10) % 10 + " " + num % 10 +" :: " + sum);
	    cache.put(num, sum);
	    return sum;
	} else
	    return v;

    }
}
