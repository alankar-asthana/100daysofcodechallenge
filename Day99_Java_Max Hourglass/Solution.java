import java.util.*;
 
class solution {
      
  static int findMaxSum(int [][]mat)
  {
      int max_sum = Integer.MIN_VALUE;
      for (int i = 0; i < R - 2; i++)
      {
          for (int j = 0; j < C - 2; j++)
          {

              int sum = (mat[i][j] + mat[i][j + 1] +
                         mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                         (mat[i + 2][j] + mat[i + 2][j + 1] +
                         mat[i + 2][j + 2]);

              max_sum = Math.max(max_sum, sum);
          }
      }
      return max_sum;
  }
  static public void main (String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int R=sc.nextInt();
      int C=sc.nextInt();
      if(R<3 || C<3)
         System.out.println("Size of row and column should be 3 or more than 3");
      else{
        int mat[] = new int[R][C];
        System.out.println("Enter the value of matrix");
        for(int i=0;i<R;i++){
          for(int j=0;j<C;j++){
            mat[i][j] = sc.nextInt();
          }
        }
        int res = findMaxSum(mat);
        System.out.println("Maximum sum of hour glass = "+ res);
      }
  }
     
}
