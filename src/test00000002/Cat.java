package test00000002;

public class Cat extends Mammalin {

	int hight;

	/*--------------------------------------------
	  ���J���\�b�h
	 ---------------------------------------------*/
	/**
	 * �l�R�̍s���@�W�����v����
	 * 
	 * @param hight
	 */

	public void jump(int hight) {
		System.out.println("�l�R��" + hight + "���W�����v����");

	}

	/**
	 * �l�R�̍s���@�H�ׂ�
	 */
	@Override
	public void eat() {
		System.out.println("�l�R�͋���H�ׂ�");
	}
}
