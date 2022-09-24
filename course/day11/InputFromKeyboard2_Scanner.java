package course.day11;

// In JDK 1.5: java.util.Scanner
import java.util.Scanner;

public class InputFromKeyboard2_Scanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("請輸入你的資料> ");

			String data = scanner.nextLine();

			if ("exit".equals(data)) {
				System.out.println("已結束輸入!");
				break;
			}

			System.out.println("你剛輸入的資料:" + "[" + data + "]\n");
		
		}

		scanner.close();

	}

}