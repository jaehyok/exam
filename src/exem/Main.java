package exem;

import Codingdojang.CD365;

public class Main {

    public static void main(String[] args) {
	long start = System.currentTimeMillis();

	CD365 cd365 = new CD365();
	cd365.run();

	long end = System.currentTimeMillis();
	System.out.println("dt : " + (end - start) / 1000.0);
    }
}
