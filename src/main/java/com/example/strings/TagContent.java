package com.example.strings;

public class TagContent {

	public static void main(String[] args) {

//		String str ="<h2><h1> This is Test </h1><h2>";
		String str ="<>hello</><h>dim</h>";
		//StringBuilder builder = new StringBuilder();
		//builder.append(str);
		
		boolean none =printContent(str);
		if(none) {
			System.out.println("None");
		}
		
	}

	private static boolean printContent(String str) {
		int cur =0;
		int start = 0;
		int end = 0;
		
		boolean none= true;
		
		while(true) {
		start =str.indexOf('<', cur);
		if(start<0) {
			break;
		}
		
		end = str.indexOf('>', start);
		
		if(end<0) {
			break;
		}
		
		String startTag = str.substring(start, end+1);
		String endTag = "</"+startTag.substring(1);
		
		
		
		int closeTagIndex = str.indexOf(endTag);
		if(closeTagIndex<0) {
			break;
		}
		
		if(startTag.length()<=2){
			String leftOverSubstring = str.substring(closeTagIndex+endTag.length());
			if(leftOverSubstring.length()>0){
				none = printContent(leftOverSubstring);
			}
            break;
        }
		
		//System.out.println(builder.indexOf(startTag));
		//System.out.println(builder.indexOf(endTag));
		
		String substr = str.substring(str.indexOf(startTag)+startTag.length(), str.lastIndexOf(endTag));
		
		if(substr.contains("<")) {
			none = printContent(substr);
			break;
		}else {
			/*System.out.println(start);
			System.out.println(end);
			
			System.out.println(startTag);
			System.out.println(endTag);*/
			
			System.out.println(substr);
			none = false;
			return none;
		}
		
		}
		return none;
	}

}
