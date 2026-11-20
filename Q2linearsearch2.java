import java.util.Scanner;
public class Q2linearsearch2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //print last occured index of the number;
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int index = -1;
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                index = i;
            }
        }
        System.out.println("The target is at index : " + index);
    }
}
