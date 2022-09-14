package javabook2.ch10.sec05;

public class TryWithResourceExample {
	// 파일입력스트림 예외처리 필수적
	// 파일입력스트림 후 사용한 자원에 대한 반환이 필요 : close()
	public static void main(String[] args) {

//		FileInputStream fis = null;
		try(FileInputStream fis = new FileInputStream("file.txt");) {
			fis.read();
			System.out.println("예외 발생 이전 코드 실행");
			throw new Exception();	// 강제적으로 예외 발생
//			System.out.println("예외 발생 이후 코드 실행");
		} catch (Exception e) {
			System.out.println("예외 발생!!");
		} finally {
			System.out.println("예외 처리 완료");
		}
	}

}
