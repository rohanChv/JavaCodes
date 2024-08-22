public class DemoClass {
    public static void main(String[] args) {
        SuperClass classOne=new SuperClass();
        classOne.i=2;
        classOne.j=3;
        classOne.showij();
        SubClass classTwo=new SubClass();
        classTwo.i=3;
        classTwo.j=4;
        classTwo.k=5;
        classTwo.showContents();

    }
}
