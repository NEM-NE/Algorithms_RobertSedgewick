package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 4 : 33

	static int[] ary;
	static boolean[] visited;
	static int cnt;
	
	static void countNum(int index, int findNum) {
		int max = index;
		int min = 0;

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		ary = new int[20000001];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());;
			ary[10000000 + num] += 1; 
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int findNum = Integer.parseInt(st.nextToken());

			sb.append(ary[10000000 + findNum] + " ");
		}
		
		System.out.println(sb);
		
	}

}