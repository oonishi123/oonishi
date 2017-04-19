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
 *
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

public class Dog extends Mammal {
	/*------------------------------------------------------------------
	 クラス変数
	------------------------------------------------------------------*/
	/** クラス(犬)の種類 */
	private static final int SPECIES = 300;

	/** クラス(犬)の種類 */
	private static final String BEAR = "胎生";

	/*------------------------------------------------------------------
	 コンストラクタ
	------------------------------------------------------------------*/
	/**
	 * 犬の名前をコンソールに出力
	 * 
	 * @param name 名前
	 */
	public Dog(String name) {
		this.name = name;
		System.out.println("Welcome to the Mammal World " + name + "!");
	}

	/*------------------------------------------------------------------
	 公開メソッド
	------------------------------------------------------------------*/

	/** 犬の呼吸方法についてコンソールに出力 */
	@Override
	public void breathe() {
		System.out.println("イヌは" + Mammal.BREATH + "呼吸する");
	}

	/** 犬種数をコンソールに出力 */
	@Override
	public void species() {
		System.out.println("イヌは約" + Dog.SPECIES + "種いる");
	}

	/** 犬の生まれ方をコンソールに出力 */
	public void bear() {
		System.out.println("イヌは" + Dog.BEAR + "である");
	}

	/** 犬の特徴をコンソールに出力 */
	public void temperature() {
		System.out.println("イヌは舌を出すことで体温を調節している");
	}

	/**
	 * 小型犬大型犬チェック
	 * 
	 * @param dogWeight 重さ(kg)
	 */
	public void dogBreedCheck(int dogWeight) {
		// 1.dogWeightが35より小さければ、以下を行う。
		if (dogWeight < 35) {
			// (1) コンソールに出力
			System.out.println(this.name + "は小型犬です");

		// 2.dogWeightが35より小さければ、以下を行う。
		} else {
			// (1) コンソールに出力
			System.out.println(this.name + "は大型犬です");
		}
	}
}
