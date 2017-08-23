package music;

import java.util.ArrayList;
import java.util.Scanner;

public class Music {
	private ArrayList<String> alt = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	// 添加歌曲
	public void addMusic() {
		System.out.print("输入添加的歌曲名：");
		String name = sc.nextLine();
		alt.add(name);
		System.out.println("当前歌曲目录：");
		for (String str : alt) {
			System.out.println(str);
		}
		System.out.println("------------");
	}
	
	// 置顶歌曲
	public void firstMusic() {
		System.out.print("输入置顶的歌曲名：");
		String name = sc.nextLine();
		int i = alt.indexOf(name);
		if (i != -1) {
			alt.remove(name);
			alt.add(0, name);
			System.out.println("当前歌曲目录：");
			for (String str : alt) {
				System.out.println(str);
			}
			System.out.println("------------");
		} else if (i == 0) {
			System.out.println("该曲目已置顶");
		} else {
			System.out.println("列表中没有此歌曲，请重更新输入");
		}
	}
	
	// 歌曲上移
	public void topMusic() {
		System.out.print("输入上移的歌曲名：");
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
			System.out.println("该曲目已置顶无法上移");
		} else {
			System.out.println("列表中没有此歌曲，请重更新输入");
		}
	}
	
	// 退出系统
	public void exit() {
		System.out.println("谢谢使用，即将退出本系统");
		System.exit(0);
	}
}
