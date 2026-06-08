import java.util.*;

public class Functions {
    public static void printName(String name){
    System.out.println(name);
    return;
    }
    public static int addElements(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static int mulElements(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        printName(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addElements(a,b);
        System.out.println("The Sum is: " + sum);
        int mul = mulElements(a,b);
        System.out.println("The multiplication is: " + mul);
        
    }
}
