package music;

import java.util.Scanner;

public class ActionMusic {
	public void choseMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭʹ��XX-KTV���ϵͳ");
		Music music = new Music();
		System.out.println("0��Ӹ�����1ѡ������ö���2ѡ������ϵ�һλ��3�˳�ϵͳ:");
		while (true) {
			System.out.print("ѡ�������");
			int a = sc.nextInt();
			switch (a) {
			case 0:
				music.addMusic();
				break;
			case 1:
				music.firstMusic();
				break;
			case 2:
				music.topMusic();
				break;
			case 3:
				music.exit();
				break;
			}
		}
	}
}
