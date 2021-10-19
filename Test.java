import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 String str = scanner.next();
		 int n = str.length();
		 int count = 0;
		 int[] dp = new int[n];
		 for(int i = 0; i< n; i++) {
			 if(str.charAt(i) == 49 && i+1 < n) {
				 dp[count] = (str.charAt(i) - 48) *10 + str.charAt(i+1) - 48;
				 count++;
				 i = i+2;
			 }
			 if(str.charAt(i) == 50 && i+1 < n && str.charAt(i+1) <= 54) {
				 dp[count] = (str.charAt(i) - 48) *10 + str.charAt(i+1) - 48;
				 count++;
				 i =i+1;
			 } else {
				 dp[count] = str.charAt(i) - 48;
				 count++;
			 }
		 }
		 for(int i = 0;i<count;i++) {
			 System.out.println(dp[i]);
		 }
	}
}