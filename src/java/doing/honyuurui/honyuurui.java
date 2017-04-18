package java.doing.honyuurui;
/*
 * 人間1(2)クラスの基底クラス、人間1(2)クラスはこれを継承すること
 */
import java.doing.doing;
import java.doing.honyuurui.ningen.ningen1;
import java.doing.honyuurui.ningen.ningen2;


public class honyuurui extends doing{
	/*
	 * doingクラスを継承
	 */
	public String action;
	public honyuurui(String action) {
		this.action = action;
	}
	
	public void play(){
		ningen1 tom = new ningen1("起きる");
		tom.who1();
		/*
		 * 人間1クラスに「起きる」を渡す
		 */
		
		ningen2 bob = new ningen2("寝る");
		bob.who2();
		/*
		 * 人間２クラスに「寝る」を渡す
		 */
	}

	}