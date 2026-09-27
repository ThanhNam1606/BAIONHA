public class Main {
    public static int[][] spiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int number =1;
        while (top <= bottom && left <= right){
            for (int j = left; j <= right; j++) {

                matrix[top][j] = number++;
            }
            top++;
            for (int i=top; i<=bottom; i++){
                matrix[i][right] = number++;
            }
            right--;
            if (top <= bottom){
                for (int j = right ; j >= left ;j--){
                    matrix[bottom][j] = number++;
                }
                bottom--;
            }
            if (left <= right){
                for (int i =bottom; i>=top;i--){
                    matrix[i][left] = number++;
                }
                left++;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
            int n=5;
            int[][] spiralMatrix = spiralMatrix(n);
            for (int i=0; i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(spiralMatrix[i][j]+" ");
                }
                System.out.println();
            }
    }
}