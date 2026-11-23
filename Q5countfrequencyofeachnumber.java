import java.util.Scanner;
public class Q5countfrequencyofeachnumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            count = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[i] == arr[j]){
                 count++;
                }
            }
            System.out.println("frequesncy of " + arr[i] + "is" + count);
        }
    }
}
