package com.company;

public class Main {

    public static void main(String[] args) {
	int num1=1,num2=1;
        System.out.println(num1);
    while(num2<50){
        num2 = num1+num2;
        num1=num2-num1;
        System.out.println(num1);
        }
    }
}
