package application;

import java.util.Scanner;

import entities.structural;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		structural Structural = new structural();
		System.out.println("Enter rectangle width and height: ");
		Structural.width = sc.nextDouble();
		Structural.height = sc.nextDouble();
		System.out.println(Structural);
		sc.close();

	}

}
