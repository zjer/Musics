package music;

import java.util.Scanner;

public class ActionMusic {
	public void choseMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎使用XX-KTV点歌系统");
		Music music = new Music();
		System.out.println("0添加歌曲，1选择歌曲置顶，2选择歌曲上调一位，3退出系统:");
		while (true) {
			System.out.print("选择操作：");
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
