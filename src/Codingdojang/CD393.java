package Codingdojang;

public class CD393 {

    /*
     * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가? 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는
     * 숫자를 모두 카운팅 해야 한다. (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
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
