package q101Unique;
import java.io.*;
public class URLify {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyBoard;
		keyBoard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string within space:  ");
		System.out.flush();
		String inputString;
		inputString = keyBoard.readLine();
		
		char[] val = new char[inputString.length()];
		for (int i = 0; i <inputString.length();i++){
			val[i] = inputString.charAt(i);
			if (val[i] == ' '){
				System.out.print("20%");
			}
			System.out.print(val[i]);
			
		}
	
	}
		

	
	

}
