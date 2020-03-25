
import java.util.Scanner;
public class leap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("년도입력. : ");
		int y =input.nextInt();
		if(y % 4 == 0 && y % 100!=0 || y % 400 == 0) { 
			System.out.println(y + "년, 윤년");
		}
		else {
			System.out.println(y + "년, 평년");
		} 
		}
	}
