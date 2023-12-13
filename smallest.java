import java.util.Scanner;

class programe1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int[] arra1=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("enter the element of array");
            arra1[i]=sc.nextInt();
        }
        int sm=arra1[0];
        for(int i=1;i<a;i++){
            if(arra1[i]<sm){
                sm=arra1[i];
            }
        }
        System.out.println("Smallest number ="+sm);


        
    }
}