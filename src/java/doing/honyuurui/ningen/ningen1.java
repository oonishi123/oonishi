package java.doing.honyuurui.ningen;

import java.doing.honyuurui.honyuurui;

public class ningen1 extends honyuurui {
	/*
	 * 哺乳類クラスを継承
	 */

	public ningen1(String action) {
		super(action);
		
	}
	
	public void who1() {
		System.out.println("トムは" + this.action);
		/*
		 * 人間１クラスコンストラクタ
		 * 哺乳類クラスから受け取った「起きる」を表示
		 */
	}
}