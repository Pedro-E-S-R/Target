public class questaoquatro {
    public static void main(String[] args) {

        System.out.println("Sequência a):");
        int[] sequenceA = {1, 3, 5, 7};
        int nextA = sequenceA[sequenceA.length - 1] + 2;
        System.out.println("Próximo elemento: " + nextA);


        System.out.println("\nSequência b):");
        int[] sequenceB = {2, 4, 8, 16, 32, 64};
        int nextB = sequenceB[sequenceB.length - 1] * 2;
        System.out.println("Próximo elemento: " + nextB);


        System.out.println("\nSequência c):");
        int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
        int n = sequenceC.length;
        int nextC = n * n;
        System.out.println("Próximo elemento: " + nextC);

        System.out.println("\nSequência d):");
        int[] sequenceD = {4, 16, 36, 64};
        int nextD = (int) Math.pow(Math.sqrt(sequenceD[sequenceD.length - 1]) + 1, 2);
        System.out.println("Próximo elemento: " + nextD);


        System.out.println("\nSequência e):");
        int[] sequenceE = {1, 1, 2, 3, 5, 8};
        int nextE = sequenceE[sequenceE.length - 1] + sequenceE[sequenceE.length - 2];
        System.out.println("Próximo elemento: " + nextE);


        System.out.println("\nSequência f):");
        int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = sequenceF[sequenceF.length - 1] + 1;
        System.out.println("Próximo elemento: " + nextF);
    }
}
