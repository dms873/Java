package practice.comprehensive;

import java.util.Arrays;
import java.util.Scanner;

public class ComprehensivePractice {
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ũ�� ���� : ");
		int len = sc.nextInt();

		// ������ �迭�� �ߺ� �� ������ �� ������ �迭 ����
		int[] temArr = new int[len*len];

		// ���� �� ���� �� �ߺ� ��
		for(int i = 0; i < temArr.length; i++) {
			temArr[i] = (int)(Math.random()*(len*len)) + 1;
			// �ߺ� �� �߻��ϸ� i--
			// �� i+1�� �������� �ʰ� �ٽ� i�� ���� �� ���� �� �ߺ� ��
			for(int j = 0; j < i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}

		// �ߺ� �� ���Ű� �� �Ǿ��ִ��� ������ �迭 ���
		System.out.println(Arrays.toString(temArr));

		// ������ �迭 -> ������ �迭
		int[][] arr = new int[len][len];
		int index = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				arr[i][j] = temArr[index++];
			}
		}

		System.out.println("========== ���� ���� ���� ===========");

		// ������ ���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");		
			}
			System.out.println();
		}

		// ��� �ڸ��� 0�� �� ������ ���� �ݺ�
		while(true) {
			System.out.print("���� ���� : ");
			int num = sc.nextInt();

			// ������ ���ڸ� 0���� �ٲ� �� ���
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == num) {
						arr[i][j] = 0;
					}
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

			/*// ���� ���� ���� Ȯ��
			boolean flag = false;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] != 0) flag = true;
				}
			}
			
			// ��� ĭ�� 0�̸� ���� ����
			if(flag == false) break;
			*/
			
			// 3�����̸� ���� ����
			int bingoCnt = 0;
			int crossCnt1 = 0;
			int crossCnt2 = 0;
			
			for(int i = 0; i < arr.length; i++) {
				int colCnt = 0;
				int rowCnt = 0;
				for(int j = 0; j < arr[i].length; j++) {
					// ����
					if(arr[i][j] == 0) {
						rowCnt++;
					}
					// ����
					if(arr[j][i] == 0) {
						colCnt++;
					}
					// ���ʿ��� ������ �Ʒ��� �밢��
					if(i == j && arr[i][j] == 0) {
						crossCnt1++;
					}
					// �����ʿ��� ���� �Ʒ��� �밢��
					if((i + j == len - 1) && arr[i][j] == 0) {
						crossCnt2++;
					}
					
				}
				// ���� ������ ��� 0�̶�� ����
				if(rowCnt == len) {
					bingoCnt++;
				}
				// ���� ������ ��� 0�̶�� ����
				if(colCnt == len) {
					bingoCnt++;
				}
			}
			// ���ʿ��� ������ �Ʒ��� �밢���� ��� 0�̸� ����
			if(crossCnt1 == len) {
				bingoCnt++;
			}
			// �����ʿ��� ���� �Ʒ��� �밢���� ��� 0�̸� ����
			if(crossCnt2 == len) {
				bingoCnt++;
			}
			
			// ���� 3���̸� ���� ����
			if(bingoCnt == 3) {
				break;
			}
		}
		System.out.println("�� �� �� ��!!!");
		System.out.println("========== ���� ���� ���� ==========");
	}
}
