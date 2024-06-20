import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
	public static void main (String[] args) {
		try {
			FileWriter fW = new FileWriter("xxx.txt");
			Writer.write("hello");
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		}
	}
}
