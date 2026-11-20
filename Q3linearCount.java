import java.util.Scanner;
public class Q3linearCount {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int count = 0;
        int [] arr = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The target ocuured  : " + count);
    }
}
