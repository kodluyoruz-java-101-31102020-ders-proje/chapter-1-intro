package com.chapter1.main.ip.validator;

public class Ip4Validator {

	private static String ipPrefix = "11.122.10.";
	
	public static String validate(String ip) {
		
		if(!ip.startsWith(ipPrefix)) {
			return "Geçersiz IP";
		}
		
		String[] ipSegments = ip.split("\\.");
		String lastSegmentAsText = ipSegments[ipSegments.length - 1];
		
		if(ipSegments.length != 4) {
			return "Geçersiz IP";
		}
		
		int lastSegment = extractLastSegment(lastSegmentAsText);
		
		if(lastSegment >= 19 && lastSegment <=50) {
			
			String message = "Developer IP: " + ip;
			return message;
		}
		
		return "Sistem Yöneticinize Başvurunuz!";
	}
	
	private static int extractLastSegment(String lastSegmentAsText) {
		
		try {
			return Integer.valueOf(lastSegmentAsText);
		}
		catch (Exception e) {
			return -1;
		}
	}
	
}
