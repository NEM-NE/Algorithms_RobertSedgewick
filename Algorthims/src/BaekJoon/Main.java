package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 12 : 01
	
	static int[] dp = new int[1001];
	
	public static void main(String[] args) throws IOException {		
		Scanner scanner = new Scanner(System.in);

		int tc = scanner.nextInt();
		
		int[] ary = new int[tc+1];
		for(int i = 1; i < tc+1; i++) {
			ary[i] = scanner.nextInt();
		}
		
		dp[1] = ary[1];
		
		for(int i = 1; i < tc+1; i++) {
			for(int j = 1; j <= i; j++) {
				
			}
		}
		
	}
}