package test00000002;

public class Dog extends Mammalin {

	/*--------------------------------------------
	  公開メソッド
	 ---------------------------------------------*/
	/**
	 * 犬の行動　食べる
	 */
	@Override
	public void eat() {
		System.out.println("犬は肉を食べる");
	}

	/**
	 * 犬の行動　吠える
	 */

	public void bark() {
		System.out.println("わんわん");
	}

}
