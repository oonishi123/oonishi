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
	 * @author BrainHearts Co.,LTD.
	 * @version 1.0
 	 */

public class Mammal  {
	String breathe;
	int species;

	/*------------------------------------------------------------------
      コンストラクタ
	------------------------------------------------------------------*/
	// 名前
	public Mammal() {
		System.out.println("Welcome to the Mammal World");
		this.breathe = "肺";
		this.species = 2600;
	}

	/*------------------------------------------------------------------
      公開メソッド
	------------------------------------------------------------------*/

	public void breathe() {
		System.out.println("哺乳類は" + this.breathe + "呼吸する");
	}

	public void species() {
		System.out.println("哺乳類は約" + this.species + "種いる");
	}
}

