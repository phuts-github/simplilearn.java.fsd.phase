package com.simplilearn.accessmodifiers.consumer;

import com.simplilearn.accessmodifiers.PublicAccessModifierExample;

public class PublicAccessModifierConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//since this method belongs to another package, we have to import the package
		PublicAccessModifierExample constName = new PublicAccessModifierExample();
		constName.multiplyNumbers();
	}

}
