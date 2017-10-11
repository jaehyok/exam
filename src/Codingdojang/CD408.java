package Codingdojang;

public class CD408 {

    /*
     * 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ���
     * ���ĵǾ��ִٰ� �����Ѵ�.) ������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� ��
     * ���̴�.
     * http://codingdojang.com/scode/408?answer_mode=hide
     */
    int[] S = { 1, 3, 4, 8, 13, 17, 20 };

    public void run() {
	int result = Integer.MAX_VALUE;
	int result_pos = -1;
	for (int i = 1; i < S.length; i++) {
	    int dleta = S[i] - S[i - 1];
	    if (dleta < result) {
		result = dleta;
		result_pos = i - 1;
		if(result == 0)
		    break;
	    }
	}

	System.out.println("(" + S[result_pos] + ", " + S[result_pos + 1] + ")");
    }

}
