package test00000002;

public class Cat extends Mammalin {

	int hight;

	/*--------------------------------------------
	  公開メソッド
	 ---------------------------------------------*/
	/**
	 * ネコの行動　ジャンプする
	 * 
	 * @param hight
	 */

	public void jump(int hight) {
		System.out.println("ネコは" + hight + "ｍジャンプする");

	}

	/**
	 * ネコの行動　食べる
	 */
	@Override
	public void eat() {
		System.out.println("ネコは魚を食べる");
	}
}
