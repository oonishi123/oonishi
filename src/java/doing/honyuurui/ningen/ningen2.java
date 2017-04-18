package java.doing.honyuurui.ningen;

import java.doing.honyuurui.honyuurui;

public class ningen2 extends honyuurui {
	/*
	 * 哺乳類クラスを継承
	 */

	public ningen2(String action) {
		super(action);
		
	}
	
	public void who2() {
		System.out.println("ボブは" + this.action);
		/*
		 * 人間２クラスコンストラクタ
		 * 哺乳類クラスから受け取った「寝る」を表示
		 */
	}
	
}