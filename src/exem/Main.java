package exem;

import codingdojang.CD266;
import codingdojang.CD365;
import codingdojang.CD393;
import codingdojang.CD408;

public class Main {

    public static void main(String[] args) {
	long start = System.currentTimeMillis();
	CD365 cd365 = new CD365();
	cd365.run();
	System.out.println("dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD393 cd393 = new CD393();
	cd393.run();
	System.out.println("dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD408 cd408 = new CD408();
	cd408.run();
	System.out.println("dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD266 cd266 = new CD266();
	cd266.run();
	System.out.println("dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

    }
}
