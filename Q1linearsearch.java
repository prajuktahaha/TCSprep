import java.util.Scanner;
public class linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Target : ");
        int target = sc.nextInt();
        int index = -1;
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target && index == -1){
                index = i;
            }
        }
        System.out.println("The taret was found in index : " + index);
    }
}
