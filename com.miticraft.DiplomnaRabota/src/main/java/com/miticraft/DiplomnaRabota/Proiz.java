package com.miticraft.DiplomnaRabota;

public class Proiz {
public int Shef (int arr[] ) {
	int count =0;
	for(int num:arr) {
		if(num>0) {
			count++;
		}
	}
	System.out.println(count);
	return count;
}
public int Chief(int arr[]) {
	int sum = 1;
	for(int num:arr) {
		sum*=num;
	}
	System.out.println(sum);
	return sum;
}
public int Max(int arr[]) {
	int max = 0;
	for (int i : arr) {
		if (i>max) {
			max = i;
		}
	}
	System.out.println(max);
	return max;
}
public int Uravneniq(int a) {
	int x = a;
	int y;
	if(x>=0) {
		y = (int) x*x*x+7*x-3;
	}else {
		y = x*x-2*x+1;
	}
	System.out.println(y);
	return y;
}
}
