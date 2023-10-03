public class Opgaveark2 {

    public static void main(String[] args) {
        int [][] tabel=new int[3][4];
        inputData(tabel);
        udskrivData(tabel);
        int sum=sumTabel(tabel);
        int raekkeMedMindsteSum=raekkeMinSum(tabel);
        int raekkeMedStorsteSum=raekkeMaxSum(tabel);
        System.out.println("Summen er: "+sum);
        System.out.println("Rækken med den mindste sum er: "+raekkeMedMindsteSum);
        System.out.println("Rækken med den største sum er: "+raekkeMedStorsteSum);

        int [] tabelMedRaekkeSum=raekkeSum(tabel);
        //Indsæt statements til at udskrive værdieren i tabelMedRaekkeSum
    }


    //Funktionen skal indlæse 12 integers i det 2-dimensionale arrayet a med 4 rækker og 3 kolonner
    public static void inputData(int [][] a){
        //Indsæt statements
    }

    //Funktionen skal udskrive værdierne i arrayet a
    public static void udskrivData(int [][] a){
        //Indsæt statements
    }

    //Funktionen skal returnere summen af værdierne i arrayet a
    public static int sumTabel(int [][] a){
        int sum=0;
        //Indsæt statements

        return sum;
    }

    //Funktionen skal returnere rækkenummeret på rækken med mindste sum
    public static int raekkeMinSum(int [][] a){
        int minRaekke=0;
        //Indsæt statements

        return minRaekke;
    }

    //Funktionen skal returnere rækkenummeret på rækken med største sum
    public static int raekkeMaxSum(int [][] a){
        int maxRaekke=0;
        //Indsæt statements

        return maxRaekke;
    }

    public static int [] raekkeSum(int [][] a){
        int [] rSum=new int[a.length];
        //Indsæt statements

        return rSum;
    }

}