package com.좌표정렬_compareTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	public int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point p) {
		if(this.x==p.x) return this.y-p.y;
		else return this.x-p.x;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for (Point p : arr) {
			System.out.println(p.x+" "+p.y);
		}
	}
}
