public enum Vehicle {
    CAR(10.0),MOTORCYCLE(5.0),TRCUK(15.0),BUS(20.0);
    double toll;
    Vehicle(double toll){
        this.toll=toll;
    }

    public double getToll() {
        return toll;
    }
}
