package ligaw;

import java.util.Scanner;
public class Zoro {

public static void main(String[] args) {
//input scanner
Scanner scanner = new Scanner(System.in);

//Declaring Input
System.out.print("Enter the first number: ");
int n = scanner.nextInt();

System.out.print("Enter the second number: ");
int m = scanner.nextInt();

//Print the firts two terms of fibonacci
System.out.print(n + " " + m + " ");
PrintmoFibiko(n, m, 2);
}
// Etoh na ung recursion
public static void PrintmoFibiko(int m, int n, int count) {
if (count == 15) {
return;
}
int next = n + m;
System.out.print(next + " ");
PrintmoFibiko(n, next, count + 1);   
	}
}
