public class Main {

    public static void main(String[] args) {
        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator("disabled",200,30000,"Промінь");
        Elevator elevator3 = new Elevator("enabled",300,
                10000,"Mitsubishi",
                "RAGNAROK 2000","Passenger elevator", "factory new");
        Elevator.getNumberOfCompleteElevators();
        Elevator.printStaticField();
        elevator1.printField();
        System.out.println(elevator1.toString());
        System.out.println(elevator2.toString());
        System.out.println(elevator3.toString());
    }
}
