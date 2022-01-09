package com.kh.practice.chap01;

import java.util.Arrays;

public class Test1 {
	public void forEx() {
		for(int i = 2; i <= 9; i++) { // 2 ~ 9 까지 열 반복
			for(int j = 1; j <= 9; j++) { // 1 ~ 9 까지 행 반복
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	public void breakTest() {
		int sum = 0;
		for(int i = 1; ; i++) { // 조건이 없으면 참으로 판별, 무한 반복
			sum += i;
			if(i == 100) // i가 100일 때 for문 강제 종료
				break;
		}
		System.out.println("1부터 100까지의 정수들의 합 : " + sum);
	}

	public void continueTest() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// 홀수들의 합계만 처리할 경우, 짝수를 건너뛰게 하기
			if(i % 2 == 0)
				continue;
			sum += i;
		}
		System.out.println("1부터 100까지의 홀수들의 합 : " + sum);
	}
	
	public void MutiBreak() {
		label:
			for( ; ; ) { // 무한 반복
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
					if(i == 5) 
						break label; // i 값이 5가 되면 반복을 종료
				}
			}
	}
	
	public void ShallowCopy() {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[]; // 배열의 주소 복사용 배열 레퍼런스 선언
		
		destArr = originArr; // 주소 복사
		
		for(int i = 0; i < 3; i++) {
			System.out.println(originArr[i] + " : " + destArr[i]);
		}
		System.out.println("================");
		
		originArr[1] = "Pineapple"; // 원본 배열 2번째 인덱스의 값 수정
		
		for(int i = 0; i < 3; i++) {
			System.out.println(originArr[i] + " : " + destArr[i]);
		}
	}
	
	public void DeepCopy() {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[];
		
		destArr = new String[originArr.length];
		
		for(int i = 0; i < originArr.length; i++) {
			destArr[i] = originArr[i];
		}
		
		originArr[1] = "Pineapple";
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}	
 	}
	
	public void ArrayCopy() {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[] = new String[originArr.length];
		
		System.arraycopy(originArr, 0, destArr, 0, originArr.length);
		
		for(int i = 0; i < destArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}
	}
	
	public void ArraysCopyOf() {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[] = new String[originArr.length];
		
		destArr = Arrays.copyOf(originArr, originArr.length);
		
		for(int i = 0; i < destArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}
	}
	
	public void cloneCopy() {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[] = new String[originArr.length];
		
		destArr = originArr.clone();
		
		for(int i = 0; i < destArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}
	}
	
	public void TestTwoVriableArray() {
		int score[][] = new int[3][]; // 가변배열
		score[0] = new int[] {1, 2, 3, 4, 5};
		score[1] = new int[] {12, 24, 36};
		score[2] = new int[] {11, 22, 33, 44};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(i + "행" + j + "열 : " + score[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

