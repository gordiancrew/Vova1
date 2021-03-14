package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("aa");
	list.add("bb");
	list.add("cc");
        System.out.println(list.indexOf("bb"));
        System.out.println(list.indexOf("dd"));
    }
}
