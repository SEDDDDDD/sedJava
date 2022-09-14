package javabook2.ch10.sec05;

// try-with-resources 사용을 위해서 만족해야할 조건
// 1. java.lang.AutoCloseable 인터페이스 구현
// 2.

//구현클래스
public class FileInputStream implements AutoCloseable {
	// 필드
	private String file;

	// 생성자
	public FileInputStream(String file) {
		this.file = file;
	}

	// 메소드
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + " 닫습니다.");
	}

}
