package acess_specifer_case3_outside_the_package_becoming_subclass_2;

import Acess_specifer.case2_witin_package;
import acess_specifer_case3_outside_the_package_becoming_subclass_1.classA;

public class classB extends classA {

	public static void main(String[] args) {
	
		add();//public method can be acess outside the package by becoming subclass
		classB a1=new classB();
		a1.sub();
		//mul();method is a dfault method and cannot be access  outside the package by becoming subclass
		//c2.division method is a private method and cannot be access  outside the package by becoming subclass

	}

}
