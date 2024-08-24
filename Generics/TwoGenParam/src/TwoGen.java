public class TwoGen <T,V>{
    T objectOne;
    V objectTwo;
    TwoGen(T objectOne,V objectTwo){
        this.objectTwo=objectTwo;
        this.objectOne=objectOne;
    }
    public void returnData(){
        System.out.println("data in First Object is "+objectOne+". Data type is "+objectOne.getClass());
        System.out.println("data in Second Object is "+objectTwo+". Data type is "+objectTwo.getClass());
    }
}
