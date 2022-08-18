package javabook2.ch06.sec12;

//import javabook2.ch06.sec12.car_lib.Engine;
//import javabook2.ch06.sec12.car_lib.SnowTire;

import javabook2.ch06.sec12.car_lib.*;

public class Car {
	// 필드
	Engine eng = new Engine();
	
	SnowTire snow = new SnowTire();
	
	javabook2.ch06.sec12.car_lib.hankook.Tire tire1 = new javabook2.ch06.sec12.car_lib.hankook.Tire();
	javabook2.ch06.sec12.car_lib.kumho.Tire tire2 = new javabook2.ch06.sec12.car_lib.kumho.Tire();
}
