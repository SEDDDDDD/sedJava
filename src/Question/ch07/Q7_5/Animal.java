package Question.ch07.Q7_5;
//개와 고양이 클래스를 생성하세요
//모두 동물 클래스인 Animal 파생하여 생성할것
//동물의 이름 필드 생성(생성자 값 초기화)
//이름 getter 생성
//메서드 생성할 것.(각각 동물 기능, 동작)
//개의 종류를 나타내는 문자열 필드를 Dog 클래스에 추가하고
//나이를 나타내는 정수형 필드를 Cat 클래스에 추가하시오
//(모두 생성자에서 값 초기화 할것.)
public abstract class Animal {
private String name;


public void setName(String name) {
	this.name = name;
}



public String getName() {
	return name;
}




public abstract void sound();

}
