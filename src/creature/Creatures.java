/*
 * Copyright (c) 2017 BrainHearts Co.,LTD
 *
 * This software is the confidential and proprietary information of
 * BrainHearts Co.,LTD. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with BrainHearts.
 */

package creature;
import creature.mammalian.Dog;
import creature.mammalian.Kamonohashi;
import creature.mammalian.Mammal;

/**
 * メインクラス
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

class Creatures {

	public static void main(String[] args){

		// 1. インスタンス化を実行
		Mammal mammal = new Mammal();

		// 2. mammalの呼吸方法
		mammal.breathe();

		// 3. mammalの種類
		mammal.species();

		// 1. インスタンス化を実行
		Kamonohashi kamo = new Kamonohashi("かもちゃん");

		// 2. kamoの呼吸方法
		kamo.breathe();

		// 3. kamoの種類
		kamo.species();

		// 4. kamoの生まれ方
		kamo.bear();

		// 1. インスタンス化を実行
		Dog dog = new Dog("おいぬさま");
	
		// 2. dogの呼吸方法
		dog.breathe();

		// 3. dogの種類
		dog.species();

		// 4. dogの生まれ方
		dog.bear();

		// 5. dogの特徴
		dog.temperature();

		// 6. 大型小型犬の判定を行う
		dog.dogBreedCheck(10);
	}
}