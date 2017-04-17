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
import creature.mammalian.Dogs;
import creature.mammalian.Kamonohashi;
import creature.mammalian.Mammal;

/**
 * メインクラス
 * @author BrainHearts Co.,LTD.
 * @version 1.0
 */

class Creatures {

	public static void main(String[] args){

		Mammal Mammal = new Mammal();
		Dogs Dog = new Dogs();
		Kamonohashi Kamo = new Kamonohashi();


		Mammal.breathe();
		Mammal.species();
		
		Kamo.breathe();
		Kamo.species();
		Kamo.bear();
		
		Dog.breathe();
		Dog.species();
		Dog.bear();
		Dog.temperature();
		Dog.dogBreedCheck("ねこ", 10);
	}
}