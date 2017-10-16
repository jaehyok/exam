package exem;

import codingdojang.CD266;
import codingdojang.CD365;
import codingdojang.CD393;
import codingdojang.CD408;
import codingdojang.CD410;

public class Main {

    public static void main(String[] args) {
	long start = System.currentTimeMillis();
	CD365 cd365 = new CD365();
	cd365.run();
	System.out.println("CD365 dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD393 cd393 = new CD393();
	cd393.run();
	System.out.println("cd393 dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD408 cd408 = new CD408();
	cd408.run();
	System.out.println("CD408 dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD266 cd266 = new CD266();
	cd266.run();
	System.out.println("CD266 dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

	start = System.currentTimeMillis();
	CD410 cd410 = new CD410();
	cd410.run();
	System.out.println("CD410 dt : " + (System.currentTimeMillis() - start) / 1000.0 + "\n");

    }
}
