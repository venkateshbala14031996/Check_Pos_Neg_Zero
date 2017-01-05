import java.io.*;
import java.util.Scanner;
public class CheckNumber {
public static void main (String args[]) {
int number;
Scanner in=new Scanner(System.in);
number = in.nextInt();
if(number == 0) {
 System.out.println("Zero");
 }
else if (number >0) {
   System.out.println("Positive");
 }
 else {
   System.out.println("Negative");
   }
 }
}
