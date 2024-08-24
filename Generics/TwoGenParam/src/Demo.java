public class Demo {
    public static void main(String[] args) {
        TwoGen<Integer,String> firstClass=new TwoGen<>(10,"Hello");
        firstClass.returnData();
    }
}
