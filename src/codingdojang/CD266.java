package codingdojang;

import java.util.ArrayList;
import java.util.List;

public class CD266 {
    /*
     * 문제는 다음과 같다:
     * 6 6
     *  0   1   2   3   4   5
     * 19  20  21  22  23   6
     * 18  31  32  33  24   7
     * 17  30  35  34  25   8
     * 16  29  28  27  26   9
     * 15  14  13  12  11  10
     * 위처럼 6 6이라는 입력을 주면 6 X 6 매트릭스에 나선형 회전을 한 값을 출력해야 한다.
     */

    private int in1 = 6; //left, right
    private int in2 = 6; //up, down
    private int index = 0;
    private int count = 1;

    int[] S = { 1, 3, 4, 8, 13, 17, 20 };

    public void run() {
	int dir = -1; //0:>  1:v  2:<  3:^
	int[] arr = new int[in1 * in2];

	arr[0] = count;
	count++;
	dir = changeDir(dir);
	exec(arr, dir, in1 - 1);

	int loop = 1;
	while (true) {
	    if (in1 - loop == 0 || in2 - loop == 0)
		break;
	    dir = changeDir(dir);
	    exec(arr, dir, in2 - loop);
	    dir = changeDir(dir);
	    exec(arr, dir, in1 - loop);
	}
	print(arr, in1, in2);
    }

    private void print(int[] arr, int width, int height) {
	for (int i = 0; i < width * height; i++) {
	    System.out.print(arr[i] + "\t");
	    if (i % width == width - 1)
		System.out.println("");
	}
    }

    private void exec(int[] arr, int direction, int step) {
	for (int i = 0; i < step; i++) {
	    if (direction == 0) { // right
		index++;
	    } else if (direction == 1) {// down
		index += in1;
	    } else if (direction == 2) {//left
		index--;
	    } else if (direction == 3) {//up
		index -= in1;
	    }
	    arr[index] = count;
	    count++;
	}
    }

    private int changeDir(int dir) {
	return (++dir) % 4;
    }

}
