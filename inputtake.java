import java.util.*;
class inputtake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter 5 numebrs");
        for(int i = 0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

}