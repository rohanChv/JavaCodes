
enum Cars{
    BMW,Audi,Ferrari,Porsche,Mercedes
}
public class EnumDemo {
    public static void main(String[] args) {
        Cars car;//Declare Enum type variable no need to Use New Operator
        car=Cars.Ferrari;
        switch (car){
            case Ferrari:
                System.out.println("Its a Ferrari");
        }
    }
}
