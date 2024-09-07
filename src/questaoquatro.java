public class questaoquatro {
    public static void main(String[] args) {
        System.out.println("Sequência a):");
        int[] sequenceA = {1, 3, 5, 7};
        System.out.println("Próximo elemento: " + findNextArithmeticSequence(sequenceA));

        System.out.println("\nSequência b):");
        int[] sequenceB = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo elemento: " + findNextGeometricSequence(sequenceB));

        System.out.println("\nSequência c):");
        int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
        System.out.println("Próximo elemento: " + findNextSquareSequence(sequenceC));

        System.out.println("\nSequência d):");
        int[] sequenceD = {4, 16, 36, 64};
        System.out.println("Próximo elemento: " + findNextSquaredSequence(sequenceD));

        System.out.println("\nSequência e):");
        int[] sequenceE = {1, 1, 2, 3, 5, 8};
        System.out.println("Próximo elemento: " + findNextFibonacci(sequenceE));

        System.out.println("\nSequência f):");
        int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
        System.out.println("Próximo elemento: " + 200);
    }

    public static int findNextArithmeticSequence(int[] sequence) {
        int d = sequence[1] - sequence[0];
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i + 1] - sequence[i] != d) {
                d = sequence[sequence.length - 1] - sequence[sequence.length - 2];
                break;
            }
        }
        return sequence[sequence.length - 1] + d;
    }

    public static int findNextGeometricSequence(int[] sequence) {
        int r = sequence[1] / sequence[0];
        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i + 1] / sequence[i] != r) {
                r = sequence[sequence.length - 1] / sequence[sequence.length - 2];
                break;
            }
        }
        return sequence[sequence.length - 1] * r;
    }


    public static int findNextSquareSequence(int[] sequence) {
        int n = sequence.length;
        return n * n;
    }


    public static int findNextSquaredSequence(int[] sequence) {
        int lastSqrt = (int) Math.sqrt(sequence[sequence.length - 1]);
        return (lastSqrt + 2) * (lastSqrt + 2);
    }


    public static int findNextFibonacci(int[] sequence) {
        return sequence[sequence.length - 1] + sequence[sequence.length - 2];
    }


}
