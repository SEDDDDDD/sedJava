package javabook2.ch05;

public class ArrayInArray {

	public static void main(String[] args) {
		
		// 데이터타입[] 변수명 = new 데이터타입[배열크기];
		
		int[][] intArr1 = new int[2][]; // 2개의 공간
		
		intArr1[0] = new int[2];
		intArr1[1] = new int[3];
		
		
		
		// 2차원 // 데이터타입[][] 변수명 = new 데이터타입[배열크기][배열크기];
		
		int[][] intArr2 = new int[2][3]; // 6개의 공간
		
		intArr2[0][0] = 1;
		intArr2[0][1] = 2;
		intArr2[0][2] = 3;
		
		intArr2[1][0] = 4;
		intArr2[1][1] = 5;
		intArr2[1][2] = 6;
		
		for (int i=0; i < intArr2.length; i++) {
			for (int j=0; j < intArr2[i].length; j++) {
				System.out.println("("+i+","+j+")");
				System.out.println(intArr2[i][j]);
			}
		}
		

	}

}
