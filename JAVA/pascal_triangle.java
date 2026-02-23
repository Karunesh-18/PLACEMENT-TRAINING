import java.util.Scanner;

public class pascal_triangle {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int k = 0; k <= i; k++){
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}