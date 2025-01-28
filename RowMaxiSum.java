import java.util.Scanner;
public class RowMaxiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of col: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] sum = new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i] = sum[i]+arr[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        int ind = Integer.MIN_VALUE ;

        for(int i = 0;i<row;i++){
            if(sum[i]>max){
                max = sum[i];
                ind = i;
            }
        }

        System.out.println("Row with the maximum sum: "+ind+1);
        System.out.println("Maximun sum: "+max);
    }
}
