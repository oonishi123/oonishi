/*
 * Copyright (c) 2017 BrainHearts Co.,LTD
 *
 * This software is the confidential and proprietary information of
 * BrainHearts Co.,LTD. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with BrainHearts.
 */


package creature.mammalian;

/**
 * Dogクラス Mammalを継承している
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

public class Dogs extends Mammal {
	String bear;
	int species;

	/*------------------------------------------------------------------
     コンストラクタ
	------------------------------------------------------------------*/
	// 種類
	public Dogs(){
		super();
		this.bear = "胎生";
		this.species = 300;
	}

	/*------------------------------------------------------------------
     公開メソッド
	------------------------------------------------------------------*/

	// 犬の呼吸方法についてコンソールに出力
	@Override
	public void breathe(){
		System.out.println("イヌは" + this.breathe + "呼吸する");
	}

	// 犬種数をコンソールに出力
	@Override
	public void species() {
		System.out.println("イヌは" + this.species + "種いる");
	}

	// 生まれ方をコンソールに出力
	public void bear(){
		System.out.println("イヌは" + this.bear + "である");
	}

	// 生まれ方をコンソールに出力
	public void temperature(){
		System.out.println("イヌは舌を出すことで体温を調節している");
	}

    /**
     * 小型犬大型犬チェック
     * dogWeightの値のよって変化させる
     */
	public void dogBreedCheck(String dogBreed, int dogWeight) {
		// 35より小さければ
		if(dogWeight < 35) {
			System.out.println(dogBreed + "は小型犬です" );
		} else {
		// そうでなければ
			System.out.println(dogBreed + "は大型犬です");
		}
	}
}

