package com.OOP;

class Test<T,U,R>{
	T ob1;
	U ob2;
	R ob3;
	
	Test(T ob1,U ob2,R ob3){
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	
	public void print() {
		System.out.print(ob1);
		System.out.print(ob2);
		System.out.print(ob3);
	}
}

public class MultipleGenericsType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String,Integer,Float>obj = new Test<>("Test",23,45.56f);
		obj.print();
	}

}
