import java.util.Scanner;

public class array_concat {
    public static void main(String[] args) {
        int arr[]=new int[3];
        int ar[]=new int[3];
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<3;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+ "  ");
        }
        for(int i=0;i<3;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.print(ar[i]+ "  ");
        }
        int len1,len2;
        len1= arr.length;
        len2= ar.length;
        int len3=len1+len2;
        int a[]=new int[6];
        System.out.println();
        for(int i=0;i< 3;i++){
            a[i]=arr[i];
        }

        for(int i=0;i<3;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=3;i<6;i++){
            a[i]=ar[i];
        }
        for(int i=3;i<6;i++){
            System.out.print(a[i]+" ");
        }


    }
}
