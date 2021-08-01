import java.util.ArrayList;


public class BasicJava{
    
    public void printTo255(){
        for(int i = 1; i<=255;i++){
            System.out.println(i);
        }
    }

    public void oddsTo255(){
        for(int i=1; i <=255; i+=2){
            System.out.println(i);
        }
    }

    public void sumTo255(){
        int sum=0;
        for(int i =0; i <=255; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public void iterateThroughArray(int[] arr){
        for(int value : arr){
            System.out.println(value);
        }
    }

    public void printMax(int[] arr){
        int max= arr[0];
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public ArrayList<Integer> oddNumbers(){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2){
            odds.add(i);
        }
        return odds;
    }

    public double average(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return (double) sum /arr.length;
    }

    public int greaterThan(int[] arr, int y){
        int greaterThanY = 0;
        for(double num : arr){
            if(num > y){
                greaterThanY++;
            }
        }
        return greaterThanY;
    }

    public int[] square(int[] arr){
        for (int i=0; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }

    public int[] noNegatives(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        return arr;
    }

    public double[] maxMinAvg(int[] arr){
        int max= arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            else if (min > arr[i]){
                min = arr[i];
            }
            sum+=arr[i];
        }
        double[] array = {max, min, (double) sum/arr.length};
        return array;
    }

    public int[] shift(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] =0;
        return arr;
    }

}