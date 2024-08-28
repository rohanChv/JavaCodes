public class Demo {
    public static void main(String[] args) {

        for(Vehicle vehicle : Vehicle.values()){
            System.out.println(vehicle+"->"+vehicle.getToll());
        }
    }
}
