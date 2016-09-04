*
        Swap Numbers Java Example
        This Swap Numbers Java Example shows how to
        swap value of two numbers using java.
*/

package sup.num; 
public class SwapElementsExample {
 
        public static void main(String[] args) {
               
                int num1 = 10;
                int num2 = 20;
                int num3 = 30;
                int num4 = 40;
                int num5 = 50;
                int num6 = 60;
                int num7 = 70;
                int num8 = 80;
                int num9 = 90;
                int num10 = 100;
                int num11 = 110;
                int num12 = 120;
               
                System.out.println("Before Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" +num2);
               
                swap the value
                swap(num1, num2);
        }
 
        private static void swap(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,int num9, int num10, int num11,int num12) {
               
                int temp = num1;
                num1 = num2;
                num2 = temp;
               
                System.out.println("After Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" +num2);
               
        }
}
 
/*
Output of Swap Numbers example would be
Before Swapping
Value of num1 is :10
Value of num2 is :20
After Swapping
Value of num1 is :20
Value of num2 is :10
*/
