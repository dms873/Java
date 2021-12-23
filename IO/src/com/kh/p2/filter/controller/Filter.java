package com.kh.p2.filter.controller;

import java.io.*;

public class Filter {
	
	public void consoleInOut() {
		
	}
	
	public void buf() {
		
	}
	
	public void data() {
		
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {
			
//			파일에 자료형별로 기록
			dout.writeUTF("홍길동"); // 문자열을 쓸 때는 UTF
			dout.writeChar('남');
			dout.writeInt(32);
			dout.writeUTF("유관순");
			dout.writeChar('여');
			dout.writeInt(21);
			dout.writeUTF("장보고");
			dout.writeChar('남');
			dout.writeInt(27);
			
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readChar() + ", "
						+ din.readInt());
			}
			
		} catch(EOFException e) {
			System.out.println("파일 읽기 완료");
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}

	public void bufData() {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		DataInputStream din = null;
		
		try {
			fin = new FileInputStream("member.txt");
			bin = new BufferedInputStream(fin);
			din = new DataInputStream(bin);
			
			System.out.println(din.readUTF());
			
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public void reWri() {
//		FileReader를 기반스트림처럼 생각하고 쓰자
//		File file = new File("exam.txt");
//		try(FileReader fr = new FileReader(file)) {
//			int check = 0;
//			while((check = fr.read()) != -1) {
//				System.out.print((char)check);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다.");
//		} catch (IOException e) {
//			System.out.println(e);
//		}
		
//		보조스트림(BufferedWriter, BufferedReader)을 달고 쓰자
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("fileReWri.txt"));
				BufferedReader br = new BufferedReader(new FileReader("fileReWri.txt"))) {
//			bw.write("첫째줄\n둘째줄\n셋째줄");
			
			bw.write("첫째줄");
			bw.newLine();
			bw.write("둘째줄");
			bw.newLine();
			bw.write("셋째줄");
			bw.newLine();
			
			bw.flush(); // close 전이므로 flush를 안해주면 버퍼에 쌓여있는 상태이다.
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
