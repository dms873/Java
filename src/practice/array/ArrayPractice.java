package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ���� ���� ���� �Է� : ");
		int[] arr = new int[sc.nextInt()];
		
		// �����ϴ� for��
		int num = 1;
		for(int i = 0; i < arr.length/2; i++) {
			arr[i] = num++;
			System.out.print(arr[i] + " ");
		}
		// �����ϴ� for��
		for(int i = arr.length/2; i < arr.length; i++) {
			arr[i] = num--;
			System.out.print(arr[i] + " ");
		}		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� �Է� : ");
		String[] strArr = new String[sc.nextInt()];
		
		sc.nextLine();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			strArr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
			String select = sc.nextLine();
			
			if(select.toUpperCase().equals("Y")) {
				System.out.print("�߰��� ���� : ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine();
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "��° ���ڿ� : ");
					newArr[i] = sc.nextLine();
				}
				strArr = newArr;
			} else if(select.toUpperCase().equals("N")) {
				System.out.println(Arrays.toString(strArr));
				break;
			}
		}	
	}
}
