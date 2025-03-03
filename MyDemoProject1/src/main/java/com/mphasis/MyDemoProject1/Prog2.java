package com.mphasis.MyDemoProject1;

interface Sports{
	void play();
}

class Football implements Sports{
	public void play() {
		System.out.println("This is football class");
	}
}

class Basketball implements Sports{
	public void play() {
		System.out.println("This is Basketball class");
	}
}

class Rugby implements Sports{
	public void play() {
		System.out.println("This is Rugby class");
	}
}



public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports f=new Football();
		f.play();
		f=new Basketball();
		f.play();
		f=new Rugby();
		f.play();

	}

}
