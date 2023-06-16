
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//        int age = sc.nextInt();

//        if(age > 18){
//         System.out.println("Adult");
//        } else {
//         System.out.println("Child");
//        }

//     }
// }







// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//        int x = sc.nextInt();
//        if(x % 2 == 0){
//         System.out.println("Even");
//        }else{
//         System.out.println("Odd");
//        }

       

//     }
// }



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//        int x = sc.nextInt();
//        int y = sc.nextInt();

//        if(x==y){
//         System.out.println("equal");
//        }else{
//          if(x>y){
//             System.out.println("x is greater ");
//          }else{
//             System.out.println("y is greater");
//          }
//        }
       

//     }
// }



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button == 1){
//             System.out.println("Hello");
//         }else if(button == 2){
//             System.out.println("Namaste"); 
//         }else if(button == 3){
//             System.out.println("Bonjour");
//         }else{
//             System.out.println("Invalid Button");
//         }
      
       
       

//     }
// }








// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//        switch(button){
//         case 1 : System.out.println("Hello");
//         break;
       
//         case 2 : System.out.println("Namaste");
//         break;
      
//         case 3 : System.out.println("Bonjour");
//         break;
//         default : System.out.println("Invalid Button");
//        }
      
       
       

//     }
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//         System.out.println("Select an operation:");
//         System.out.println("1 : + (Addition)");
//         System.out.println("2 : - (Subtraction)");
//         System.out.println("3 : * (Multiplication)");
//         System.out.println("4 : / (Division)");
//         System.out.println("5 : % (Modulo or remainder)");
//      int operation = scanner.nextInt();
//         double result;

//         switch (operation) {
//             case 1:
//                 result = a + b;
//                 System.out.println("Result: " + result);
//                 break;
//             case 2:
//                 result = a - b;
//                 System.out.println("Result: " + result);
//                 break;
//             case 3:
//                 result = a * b;
//                 System.out.println("Result: " + result);
//                 break;
//             case 4:
//                 result = a / b;
//                 System.out.println("Result: " + result);
//                 break;
//             case 5:
//                 result = a % b;
//                 System.out.println("Result: " + result);
//                 break;
//             default:
//                 System.out.println("Invalid operation");
//                 break;
//     }    
// }    
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        int operation = scanner.nextInt();
        double result;

        if (operation == 1) {
            result = a + b;
            System.out.println("Result: " + result);
        } else if (operation == 2) {
            result = a - b;
            System.out.println("Result: " + result);
        } else if (operation == 3) {
            result = a * b;
            System.out.println("Result: " + result);
        } else if (operation == 4) {
            result = a / b;
            System.out.println("Result: " + result);
        } else if (operation == 5) {
            result = a % b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operation");
        }
    }
}
