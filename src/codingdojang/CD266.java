package codingdojang;

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
    private enum Direction {
	RIGHT, DOWN, LEFT, UP
    }

    private int input1 = 6; // left, right
    private int input2 = 6; // up, down
    private int index = 0;
    private int count = 1;

    public void run() {
	Direction dir = Direction.UP; // 0:> 1:v 2:< 3:^
	int[] arr = new int[input1 * input2];

	arr[0] = count;
	count++;
	dir = changeDir(dir);
	exec(arr, dir, input1 - 1);

	int loop = 1;
	while (true) {
	    if (input1 - loop == 0 || input2 - loop == 0)
		break;
	    dir = changeDir(dir);
	    exec(arr, dir, input2 - loop);
	    dir = changeDir(dir);
	    exec(arr, dir, input1 - loop);
	    loop++;
	}
	print(arr, input1, input2);
    }

    private void print(int[] arr, int width, int height) {
	for (int i = 0; i < width * height; i++) {
	    System.out.print(arr[i] + "\t");
	    if (i % width == width - 1)
		System.out.println("");
	}
    }

    private void exec(int[] arr, Direction direction, int step) {
	for (int i = 0; i < step; i++) {
	    if (direction == Direction.RIGHT) { // right
		index++;
	    } else if (direction == Direction.DOWN) {// down
		index += input1;
	    } else if (direction == Direction.LEFT) {// left
		index--;
	    } else if (direction == Direction.UP) {// up
		index -= input1;
	    }
	    arr[index] = count;
	    count++;
	}
    }

    private Direction changeDir(Direction dir) {
	int val = dir.ordinal();
	val = (++val) % 4;
	Direction direction[] = Direction.values();
	return direction[val];
    }

}
