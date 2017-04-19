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

		/** インスタンス化 */
		Mammal Mammal = new Mammal();
		Dog Dog = new Dog("おいぬさま");
		Kamonohashi Kamo = new Kamonohashi("かもちゃん");

		// Mammalの呼吸方法をコンソールに出力
		Mammal.breathe();

		// Mammalの種類をコンソールに出力
		Mammal.species();

		// Kamoの呼吸方法をコンソールに出力
		Kamo.breathe();

		// Kamoの種類をコンソールに出力
		Kamo.species();

		// Kamoの生まれ方をコンソールに出力
		Kamo.bear();

		// Dogの呼吸方法をコンソールに出力
		Dog.breathe();

		// Dogの種類をコンソールに出力
		Dog.species();

		// Dogの生まれ方をコンソールに出力
		Dog.bear();

		// Dogの特徴をコンソールに出力
		Dog.temperature();

		// 大型小型犬の判定を行い、コンソールに出力
		Dog.dogBreedCheck(10);
	}
}