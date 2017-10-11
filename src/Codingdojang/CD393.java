package Codingdojang;

public class CD393 {

    /*
     * 1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�? 8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶��
     * ���ڸ� ��� ī���� �ؾ� �Ѵ�. (�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
     */
    private int magicNumber = 8;

    public void run() {
	int sum = 0;
	for (int i = 1; i < 10001; i++) {
	    if (i % 10 == magicNumber)
		sum++;
	    if ((i / 10) % 10 == magicNumber)
		sum++;
	    if ((i / 100) % 10 == magicNumber)
		sum++;
	    if ((i / 1000) % 10 == magicNumber)
		sum++;
	}
	System.out.println(sum);
    }

    public void run2() {
	//8XXX : 8000~8999 ==> count 1000
	//X8XX : 0800~0899, 1800~1899, 2800~2899, ... , 9800~9899 ==> count 100 * 10 
	//XX8X : 0080~0089, 0180~0189, 0280~0289, ... , 9900~9989 ==> count 10 * 100
	//XXX8 : 0008~9998 ==> count 1000
	int sum = 4000;
	System.out.println(sum);
    }
}
