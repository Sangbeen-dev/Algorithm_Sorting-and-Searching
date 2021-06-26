package com.뮤직비디오_결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int count(int[] arr, int capacity) {
		int cnt = 1, sum=0;
		for(int x: arr) {
			if(sum+x>capacity) {
				cnt++;
				sum=x;
			}else sum+=x;
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			for (int x : arr) {
				int mid = (lt+rt)/2;
				if(count(arr, mid)<=m) {
					answer = mid;
					rt = mid-1;
				}else lt = mid+1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(t.solution(n, m, arr));
		kb.close();
	}
}
