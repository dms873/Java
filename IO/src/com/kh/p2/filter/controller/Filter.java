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
			
//			���Ͽ� �ڷ������� ���
			dout.writeUTF("ȫ�浿"); // ���ڿ��� �� ���� UTF
			dout.writeChar('��');
			dout.writeInt(32);
			dout.writeUTF("������");
			dout.writeChar('��');
			dout.writeInt(21);
			dout.writeUTF("�庸��");
			dout.writeChar('��');
			dout.writeInt(27);
			
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readChar() + ", "
						+ din.readInt());
			}
			
		} catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�");
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
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public void reWri() {
//		FileReader�� ��ݽ�Ʈ��ó�� �����ϰ� ����
//		File file = new File("exam.txt");
//		try(FileReader fr = new FileReader(file)) {
//			int check = 0;
//			while((check = fr.read()) != -1) {
//				System.out.print((char)check);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("������ �����ϴ�.");
//		} catch (IOException e) {
//			System.out.println(e);
//		}
		
//		������Ʈ��(BufferedWriter, BufferedReader)�� �ް� ����
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("fileReWri.txt"));
				BufferedReader br = new BufferedReader(new FileReader("fileReWri.txt"))) {
//			bw.write("ù°��\n��°��\n��°��");
			
			bw.write("ù°��");
			bw.newLine();
			bw.write("��°��");
			bw.newLine();
			bw.write("��°��");
			bw.newLine();
			
			bw.flush(); // close ���̹Ƿ� flush�� �����ָ� ���ۿ� �׿��ִ� �����̴�.
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
