public class GenericClass <T>{

    T inputObject;
    GenericClass(T inputObject){
        this.inputObject=inputObject;
    }
    public  T getInputObject(){
        return inputObject;
    }

}
