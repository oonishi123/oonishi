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
	String bear;
	int species;
	

	/*------------------------------------------------------------------
     コンストラクタ
	------------------------------------------------------------------*/
	// 種類
	public Kamonohashi(){
		super();
		this.bear = "卵生";
		this.species = 1;
	}

	/*------------------------------------------------------------------
     公開メソッド
	------------------------------------------------------------------*/
	// カモノハシの呼吸方法についてコンソールに出力
	@Override
	public void breathe(){
		System.out.println("カモノハシは" + this.breathe + "呼吸する");
	}
	// カモノハシの種類をコンソールに出力
	@Override
	public void species(){
		System.out.println("カモノハシは" + this.species + "種いる" );
	}
	
	// カモノハシの生まれ方をコンソールに出力
	public void bear(){
		System.out.println("カモノハシは"+ this.bear + "である" );
	}
}