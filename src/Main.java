public class Main {
    public static void main(String[] args) {

        int x = 1;
        int [][] tabel = new int [3][4];
        for (int i = 0; i<3;i++){
            for (int j =0; j<4;j++){
                tabel [i][j]=x;
                x++;
            }
        }
        udskrivMatrix(tabel,3,4);
        System.out.println("Summen af alle rækker er: " + sum(tabel, 3,4));
        System.out.println("Sum for række er: " + raekkeSum(tabel,4,1));
        System.out.println("Den række med mindst sum er: " +minRaekkeSum(tabel,3,4));
        System.out.println("Den række med max sum er: " + maxRaekkeSum(tabel,3,4));
    }


    public static int kolonneSum(int[][] a, int col, int cnr){
        int csum = 0;
        for (int i = 0; i<col;i++){
            csum+=a[i][cnr];
        }
        return csum;
    }

    public static int raekkeSum(int[][] a, int row, int rnr){
        int rsum = 0;
        for (int i = 0; i<row;i++){
            rsum+=a[rnr][i];
        }
        return rsum;
    }

    public static int minRaekkeSum(int[][] a, int row, int col) {
        int minSum= raekkeSum(a, col,0);
        int minRaekke=0;
        for(int i = 0; i < row; i++){
            int s= raekkeSum(a,col,i);
            if (s<minSum){
                minRaekke = i;
            }
        }
        return minSum;
    }


    public static int maxRaekkeSum(int[][] a, int row, int col) {
        int maxSum = raekkeSum(a, col, 0);
        int maxRaekke = 0;

        for (int i = 1; i < row; i++) {
            int s = raekkeSum(a, col, i);

            if (s > maxSum) {
                maxSum = s;
                maxRaekke = i;
            }
        }

        return maxSum;
    }





    public static int sum(int[][] a, int row, int col){
        int sumIAlt=0;
        for (int i = 0; i <row ; i++){
            for (int j = 0; j < col; j++){
                sumIAlt += a[i][j];
            }
        }
        return sumIAlt;
    }


    public static void udskrivMatrix(int[][] a, int row, int col){
        for (int i=0; i<row;i++){
            for (int j = 0; j<col; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}