package javabook2.ch02;

import java.util.ArrayList;
import java.util.List;

public class ByteExample {

	public static void main(String[] args) {
		String id = "흐하흐하";
		
		List<String> idList = new ArrayList<String>();
		idList.add(id);
		
		System.out.println(idList.contains(id));
		
		
		

	}

}
