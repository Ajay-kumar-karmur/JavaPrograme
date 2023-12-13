import java.util.Scanner;

public class RotateElementByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int[] array1=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("enter the element of array");
            array1[i]=sc.nextInt();
        } 
        System.out.println("enter the element");
        int b=sc.nextInt();
        System.out.println("enter place of element");
        int c=sc.nextInt();
        array1[c]=b;
         for(int i=0;i<a;i++){
            System.out.println("aray after the change of element array= "+array1[i]);
        }
    }
}
