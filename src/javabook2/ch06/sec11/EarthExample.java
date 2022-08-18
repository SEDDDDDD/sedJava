package javabook2.ch06.sec11;

public class EarthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("RADIUS : "+ Earth.EARTH_RADIUS+"km");
		System.out.println("SURFACE : "+ Earth.EARTH_SURFACE_AREA+"km^2");
		
		
		// 생성자이용하여 표현은 가능하나 바람직하지 못한 표현방식 
//		Earth earth = new Earth();
//		System.out.println(earth.EARTH_RADIUS); 
	}

}
