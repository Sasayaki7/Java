public class BasicJavaTest{
    public static void main(String[] args) {
        BasicJava basic13 = new BasicJava();

        int[] testArr = {12, 5, 2, 7};
        int[] negatives = {14, 5, -7, 12};
        basic13.iterateThroughArray(testArr);
        basic13.printMax(testArr);
        System.out.println(basic13.oddNumbers());
        System.out.println(basic13.average(testArr));
        System.out.println(basic13.greaterThan(testArr, 3));
        int[] squaredtest = basic13.square(testArr);
        for (int squared: squaredtest){
            System.out.println(squared);
        }
        int[] nonegative = basic13.noNegatives(negatives);
        for (int positive: nonegative){
            System.out.println(positive);
        }
        double[] minmaxavg = basic13.maxMinAvg(nonegative);
        for (double value: minmaxavg){
            System.out.println(value);
        }
        int[] shiftednonegative = basic13.shift(nonegative);
        for (int value: shiftednonegative){
            System.out.println(value);
        }

    }
}