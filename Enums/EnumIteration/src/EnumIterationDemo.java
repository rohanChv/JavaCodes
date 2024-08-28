
enum Cars{
    BMW(100),FERRARI(200),MERCEDES(300),AUDI(400);
    int price;
    Cars(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
public class EnumIterationDemo {
    public static void main(String[] args) {
        Cars car;
        for(Cars c :Cars.values() ){
            System.out.println(c+" has a price Tag of $"+c.getPrice()+"K");
        }
    }
}
