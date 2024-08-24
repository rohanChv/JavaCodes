import java.util.Arrays;

public class ArrayOps <T extends Number>{
    T[] inputArray;
    double sum=0;
    ArrayOps(T[] inputArray){
        this.inputArray=inputArray;
    }
    public void printAverage(){
        System.out.println("Array is :"+ Arrays.toString(inputArray));
        for(int i=0;i<inputArray.length;i++){
            sum+=inputArray[i].doubleValue();
        }
        System.out.println("Average is "+(sum/inputArray.length));
    }
}
