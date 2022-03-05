package org.studyeasy;

public class Animal {
	protected int i;
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	
	private int height,weight;//initialize
	private String AT,BT=new String();//initialize
	
	

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", AT=" + AT + ", BT=" + BT + "]";
	}
	
	
}
