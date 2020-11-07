package com.chapter1.main.stringbuilder;

public class Application {

	public static void main(String[] args) {
		
		String nativeText = "Ali" + " " + "ata" + " " + "bak.";
		System.out.println(nativeText);
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("Ali");
		builder.append(" ");
		builder.append("ata");
		builder.append(" ");
		builder.append("bak.");
		
		String fulltext = builder.toString();
		System.out.println(fulltext);
	}

}
