package BaekJoon;

import java.io.*;
import java.util.*;

public class Main {
	// 11 : 10 
	
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		int[] ans = new int[n];
		
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		int index = 0;
		while(que.size() != 0) {
			for(int i = 0; i < k-1; i ++) {
				int num = que.poll();
				que.offer(num);
			}
			
			ans[index] = que.poll();
			index++;

		}
		sb.append('<');
		
		for(int i = 0; i < ans.length - 1; i++) {
			sb.append(ans[i]).append(", ");
		}
		
		sb.append(ans[ans.length-1]).append('>');
		
		System.out.println(sb);
		
		
	}
}