import java.util.Scanner;

public class Matrix {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m = 5;
        int n = 2;
        int[][] a = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = (int) ((Math.random()*100)+10);
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        findMin(a);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if (a[i][j] % 3 == 0){
                    System.out.println("The number divisible by 3 is :"+a[i][j]);
                }else{
                    System.out.println("The number not divisible by 3 is :"+a[i][j]);
                }
            }
            System.out.println();
        }

    }

    public static void findMin(int[][] arr){
        int now_i = 0,now_j = 0;
        int min = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    now_i = i+1;
                    now_j = j+1;
                }
            }
        }

        System.out.println("Row："+now_i);
        System.out.println("Column："+now_j);
        System.out.println("Min："+min);

    }
}