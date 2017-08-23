package music;

import java.util.ArrayList;
import java.util.Scanner;

public class Music {
	private ArrayList<String> alt = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	// ��Ӹ���
	public void addMusic() {
		System.out.print("������ӵĸ�������");
		String name = sc.nextLine();
		alt.add(name);
		System.out.println("��ǰ����Ŀ¼��");
		for (String str : alt) {
			System.out.println(str);
		}
		System.out.println("------------");
	}
	
	// �ö�����
	public void firstMusic() {
		System.out.print("�����ö��ĸ�������");
		String name = sc.nextLine();
		int i = alt.indexOf(name);
		if (i != -1) {
			alt.remove(name);
			alt.add(0, name);
			System.out.println("��ǰ����Ŀ¼��");
			for (String str : alt) {
				System.out.println(str);
			}
			System.out.println("------------");
		} else if (i == 0) {
			System.out.println("����Ŀ���ö�");
		} else {
			System.out.println("�б���û�д˸��������ظ�������");
		}
	}
	
	// ��������
	public void topMusic() {
		System.out.print("�������Ƶĸ�������");
		String name = sc.nextLine();
		int i = alt.indexOf(name);
		if (i > 0) {
			alt.remove(i);
			alt.add(i-1, name);
			for (String str : alt) {
				System.out.println(str);
			}
			System.out.println("------------");
		} else if (i == 0) {
			System.out.println("����Ŀ���ö��޷�����");
		} else {
			System.out.println("�б���û�д˸��������ظ�������");
		}
	}
	
	// �˳�ϵͳ
	public void exit() {
		System.out.println("ллʹ�ã������˳���ϵͳ");
		System.exit(0);
	}
}
