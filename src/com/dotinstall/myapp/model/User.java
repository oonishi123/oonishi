package com.dotinstall.myapp.model;

public class User{
	protected String name;

	// constructor
	//インスタンス化した時に必ず呼ばれる、初期値的なイメージ
	public User(String name){
		this.name = name;
	}

	//this() このクラスのコンストラクタ
	public User(){
		this.name = "ME";
		//this("ME");
	}

	public void sayHi(){
		System.out.println("HI!" + this.name);
	}
}