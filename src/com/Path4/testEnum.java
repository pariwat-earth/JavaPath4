package com.Path4;

public class testEnum {
	enum Status {
		HEALTHY,
		SLEEPY,
		DEAD
		}
		public static void main(String[] args) {
		Status myStatus = Status.HEALTHY;
		switch (myStatus) {
		case HEALTHY:
		System.out.println("���������¡ѹ�ҹҹ�������!!");
		break;
		case SLEEPY:
		System.out.println("��ǧ�ѧ�͡��˹���");
		break;
		case DEAD:
		System.out.println("����������仹͹�к����");
		break;
		}
		}

}
