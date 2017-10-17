package codingdojang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD314 {
/*
 * http://codingdojang.com/scode/314?answer_mode=hide
 * LCD Display
 * �� ģ���� ��� �� ��ǻ�͸� ���. �� ģ���� ���ݱ��� ��� ���� ������ ��ǻ�ʹ� ���п� ���� ���⿴��.
 * �׷��� �� ģ���� �� ��ǻ���� ����ͺ��� ���п� ���⿡ �ִ� LCD ���÷��̰� �� ���ٸ� ũ�� �Ǹ��ϰ� ���Ҵ�.
 * �� ģ���� ������ų �� �ֵ��� ���ڸ� LCD ���÷��� ������� ����ϴ� ���α׷��� ������.
 * 
 * �Է�
 * �Է� ������ ���� �ٷ� �����Ǹ� ǥ�õ� ������ ���ڸ��� �� �پ� �Էµȴ�.
 * �� �ٿ��� s�� n�̶�� �ΰ��� ������ ��������� n�� ��µ� ����( 0<= n <= 99,999,999 ),
 * s�� ���ڸ� ǥ���ϴ� ũ��( 1<= s < 10 )�� �ǹ��Ѵ�. 0 �� �� �� �Էµ� ���� ������ �Է��� ����Ǹ� �� ���� ó������ �ʴ´�.
 * 
 * ���
 * �Է� ���Ͽ��� ������ ���ڸ� ���� ������ '-' ��ȣ��, ���� ������ '|'�� �̿��ؼ� LCD ���÷��� ���·� ����Ѵ�. �� ���ڴ� ��Ȯ�ϰ� s+2���� ��, 2s+3���� ������ �����ȴ�. ������ ���ڸ� ������ ��� ���ڸ� �̷�� ������ �����̽��� ä���� �Ѵ�. �� ���� ���� ���̿��� ��Ȯ�ϰ� �� ���� ������ �־�� �Ѵ�.
 * �� ���� �������� �� ���� �� �� ����Ѵ�. �ؿ� �ִ� ��� ���� �� ���ڸ� ����ϴ� ����� �����ִ�.
 * 
 * �Է� ��
 * 2 12345
 * 3 67890
 * 0 0
 * 
 * ��� ��
      --   --        --
   |    |    | |  | |
   |    |    | |  | |
      --   --   --   --
   | |       |    |    |
   | |       |    |    |
      --   --        --

 ---   ---   ---   ---   ---
|         | |   | |   | |   |
|         | |   | |   | |   |
|         | |   | |   | |   |
 ---         ---   ---
|   |     | |   |     | |   |
|   |     | |   |     | |   |
|   |     | |   |     | |   |
 ---         ---   ---   ---
 */

	public void run() {
//		while (true) {
//			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			String input = "";
//			try {
//				input = in.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//				return;
//			}
//
//			String param[] = input.split(" ");
//			if (param.length != 2)
//				return;
//
//			int s = Integer.parseInt(param[0]);
//			int n = Integer.parseInt(param[1]);
//			if (s < 1 || s > 9)
//				return;
//			if (n < 0 || s > 100000000)
//				return;
//
//			if (s == 0 && n == 0)
//				return;
//
//			printLCD(String.format("%d", n), s);
//		}

		printLCD("12345", 2);
		printLCD("67890", 3);
	}

	private void printLCD(String number, int size) {
		// s+2���� �� 2s+3���� ������ ����
		printRowTop(number, size);
		for (int i = 0; i < size; i++) {
			printRowTopMiddle(number, size);
		}
		printRowMiddele(number, size);
		for (int i = 0; i < size; i++) {
			printRowMiddleBottom(number, size);
		}
		printRowBottom(number, size);
		System.out.println();
	}

	private void printRowTopMiddle(String number, int size) {
		// int digit = (int) Math.log10((double) number);
		for (int i = 0; i < number.length(); i++) {
			// int n = (int) (number / (Math.pow(10.0, (double) i))) % 10;
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (n == 0 || n == 4 || n == 7 || n == 8 || n == 9) {
				System.out.print("|");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print("|");
			} else if (n == 5 || n == 6) {
				System.out.print("|");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print(" ");
			} else if (n == 1 || n == 2 || n == 3) {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print("|");
			} else {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	private void printRowMiddleBottom(String number, int size) {
		for (int i = 0; i < number.length(); i++) {
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (n == 0 || n == 6 || n == 8) {
				System.out.print("|");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print("|");
			} else if (n == 2) {
				System.out.print("|");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print(" ");
			} else if (n == 1 || n == 3 || n == 4 || n == 5 || n == 7 || n == 9) {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print("|");
			} else {
				System.out.print(" ");
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	private void printRowTop(String number, int size) {
		// int digit = (int) Math.log10((double) number);
		// for (int i = digit; i >= 0; i--) {
		for (int i = 0; i < number.length(); i++) {
			System.out.print(" ");
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 7 || n == 8 || n == 9) {
				for (int j = 0; j < size; j++) {
					System.out.print("-");
				}
			} else {
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		}
		System.out.println();
	}

	private void printRowMiddele(String number, int size) {
		for (int i = 0; i < number.length(); i++) {
			System.out.print(" ");
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9) {
				for (int j = 0; j < size; j++) {
					System.out.print("-");
				}
			} else {
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		}
		System.out.println();
	}

	private void printRowBottom(String number, int size) {
		for (int i = 0; i < number.length(); i++) {
			System.out.print(" ");
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (n == 0 || n == 2 || n == 3 || n == 5 || n == 6 || n == 8) {
				for (int j = 0; j < size; j++) {
					System.out.print("-");
				}
			} else {
				for (int j = 0; j < size; j++) {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
		}
		System.out.println();
	}

}
