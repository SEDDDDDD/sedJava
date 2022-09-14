package javabook2.ch10.sec05;

public class FileInputStreamWithClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
		} catch (Exception e) {

		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {

			}

		}
	}

}
