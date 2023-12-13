import java.util.Scanner;

public class Programe3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        int[] array1=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("enter the element");
            array1[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
           for(int j=i+1;j<a;j++){
                if (array1[i]<array1[j]) {
                    int temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
           }
        }
        for(int i=0;i<a;i++){
            System.out.println("sorted array= "+array1[i]);
        }
    }
}
