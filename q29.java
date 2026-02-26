import java.util.Scanner;
public class q29{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter password: ");
String pass = sc.nextLine();
if(pass.length() >= 8 &&
pass.matches(".*[A-Z].*") &&
pass.matches(".*[a-z].*") &&
pass.matches(".*[0-9].*"))
System.out.println("Strong Password");
else
System.out.println("Weak Password");
}
}


 class q291{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter password: ");
String pass = sc.nextLine();
if(pass.length() >= 8 &&
pass.matches(".*[A-Z].*") &&
pass.matches(".*[a-z].*") &&
pass.matches(".*[0-9].*"))
System.out.println("Strong Password");
else
System.out.println("Weak Password");
}
}


class q292 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter password: ");
String pass = sc.nextLine();
if(pass.length() >= 8 &&
pass.matches(".*[A-Z].*") &&
pass.matches(".*[a-z].*") &&
pass.matches(".*[0-9].*"))
System.out.println("Strong Password");
else
System.out.println("Weak Password");
}
}

