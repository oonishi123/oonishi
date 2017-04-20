package com.dotinstall.myapp;
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.User;
//import com.dotinstall.myapp.model.*; //model以下のクラスを全て読み込む

public class Myapp{
	public static void main(String[] args){
		User tom;
		tom = new User("Tom"); //コンストラクタに渡してあげるlllll
		//tom = new User(); //オーバーライドできます
		//System.out.println(tom.name); nameがプロテクトされているので参照できない
		tom.sayHi();

		com.dotinstall.myapp.model.AdminUser bob = new AdminUser("Bob");
		//System.out.println(bob.name);
		bob.wow();
		bob.sayHi(); //メソッドのオーバーライド
		tom.sayHi(); //Userクラスのメソッドはそのまま

		//子クラスでオーバーライドしたメソッドは、
		//オブジェクト上の親クラスのメソッドも完全に上書きされる(?)
	}
}