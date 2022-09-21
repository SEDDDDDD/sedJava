package javabook2.ch11.sec07;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
			
		for(int i=0;i<bytes1.length; i++) {
			System.out.print(bytes1[i]+ " ");
			
		}
		System.out.println();
		
		String str1 = new String(bytes1);
		System.out.print("byte1 => String : ");
		System.out.println(str1);
	
		System.out.println("========================");
		
		try{
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			
			for(int i=0;i<bytes2.length; i++) {
				System.out.print(bytes2[i]+ " ");
				
			}
			System.out.println();
			
			String str2 = new String(bytes2, "EUC-KR");
			System.out.print("byte2 => String : ");
			System.out.println(str2);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		// UTF-8  이용하여 인코딩 및 디코딩
		
		
		
	}
	
	

}
