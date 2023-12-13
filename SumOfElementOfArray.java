import java.util.Scanner;

class SumOfElementOfArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int[] arra1=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("enter the element of array");
            arra1[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a;i++){
            sum=sum+arra1[i];
        }
        System.out.println("sum of number ="+sum);
    }
}