import java.util.Arrays;

public class Expert {

    public static void inputBackwards(){

    }

    public static int[] numbersBackwards(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void stringSeperatedByCommas(){

    }

    public static void numInputChecksum(){

    }

    public static void romanNumerals(){

    }

    public static void main(String[] args) {
        int [] arr = {6, 2, 8, 3, 9, 6};

        inputBackwards();
        //numbersBackwards();
        System.out.println(Arrays.toString(numbersBackwards(arr)));
        stringSeperatedByCommas();
        numInputChecksum();
        romanNumerals();
    }
}
