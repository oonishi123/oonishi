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
 * Mammmalクラス (親クラス)
 *
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

public class Mammal {

	/*------------------------------------------------------------------
	 クラス変数
	------------------------------------------------------------------*/
	/** 哺乳類の呼吸方法 */
	static final String BREATH = "肺";

	/** 哺乳類の種類 */
	static final int SPECIES = 2600;

	/*------------------------------------------------------------------
	 インスタンス変数
	------------------------------------------------------------------*/
	/** 哺乳類の名前 */
	String name;

	/*------------------------------------------------------------------
	  コンストラクタ
	------------------------------------------------------------------*/
	/**
     * 名前を入力、コンソールに出力
     * @param name 名前
     */
	public Mammal(String name) {
		System.out.println("哺乳類の仲間がうまれたよ！");
		System.out.println("Welcome to the Mammal World " + name + "!");
	}
	/** インスタンス化した際にコンソールに出力 */
	public Mammal() {
		System.out.println("哺乳類の仲間がうまれたよ！");
	}

	/*------------------------------------------------------------------
	  公開メソッド
	------------------------------------------------------------------*/
	/** 哺乳類の呼吸方法についてコンソールに出力 */
	public void breathe() {
		System.out.println("哺乳類は" + Mammal.BREATH + "呼吸する");
	}

	/** 哺乳類の種類についてコンソールに出力 */
	public void species() {
		System.out.println("哺乳類は約" + Mammal.SPECIES + "種いる");
	}
}
