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
 * Kamonohashiクラス Mammalを継承している
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

public class Kamonohashi extends Mammal {
	/*------------------------------------------------------------------
	 クラス変数
	------------------------------------------------------------------*/
	/** クラス(カモノハシ)の種類 */
	static final int SPECIES = 1;

	/** クラス(カモノハシ)の生まれ方 */
	static final String BEAR = "卵生";

	/*------------------------------------------------------------------
	 コンストラクタ
	------------------------------------------------------------------*/
	/** カモノハシの名前をコンソールに出力
	 * @param name 名前
	 */
	public Kamonohashi(String name) {
		this.name = name;
		System.out.println("Welcome to the Mammal World " + name + "!");
	}

	/*------------------------------------------------------------------
	  公開メソッド
	------------------------------------------------------------------*/
	/** カモノハシの呼吸方法についてコンソールに出力 */
	@Override
	public void breathe() {
		System.out.println("カモノハシは" + Mammal.BREATH + "呼吸する");
	}

	/** カモノハシの種類をコンソールに出力 */
	@Override
	public void species() {
		System.out.println("カモノハシは" + Kamonohashi.SPECIES + "種いる");
	}

	/** カモノハシの生まれ方をコンソールに出力 */
	public void bear() {
		System.out.println("カモノハシは" + Kamonohashi.BEAR + "である");
	}
}