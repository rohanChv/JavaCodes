public class Demo {
    public static void main(String[] args) {
        Integer[] inputArray={1,2,3,4,5,6};
        ArrayOps<Integer> firstArray=new ArrayOps<>(inputArray);
        firstArray.printAverage();
        Double[] secondArray={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
        ArrayOps<Double> secondOperation=new ArrayOps<>(secondArray);
        secondOperation.printAverage();
    }
}
