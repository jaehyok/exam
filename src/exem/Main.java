package exem;

import Codingdojang.CD365;
import Codingdojang.CD393;

public class Main {

    public static void main(String[] args) {
	CD365 cd365 = new CD365();
	cd365.run();
	
	CD393 cd393 = new CD393();
	long start = System.currentTimeMillis();
	cd393.run();
	long end = System.currentTimeMillis();
	System.out.println("dt : " + (end - start) / 1000.0);
    }
}
