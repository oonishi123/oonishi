package com.dotinstall.myapp.model;

public class AdminUser extends User {
	public AdminUser(String name){
		super(name);
	}

	public void wow(){
		System.out.println("wow!" + this.name);
	}

	//override
	@Override
	 //アノテーション：@Override
	 //オーバーライドした場合につけておくと,エラーがあった時に気づきやすくなる
	public void sayHi() {
		System.out.println("HI!Admin " + this.name);
	}
}