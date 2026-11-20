import java.util.Scanner;
public class Q4printindicesoftarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int [] arr = new int[n];
        boolean found = false;
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                found = true;
                System.out.println("The target is at index : " + i);
            }
        }
        if(!found){
            System.out.println("target ot found");
        }
    }
}
