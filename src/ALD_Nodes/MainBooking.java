package ALD_Nodes;

public class MainBooking {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        Booking b1 = new Booking();
        b1.setAmount(100.00);
        b1.setDescription("Miete");
//
//        dll.addBookingToLastPos(b1);
//        System.out.println("Last: " + dll.getLast().getBooking().getDescription());
//
//        Booking b2 = new Booking();
//        b2.setAmount(200.00);
//        b2.setDescription("Einkauf");
//
//        dll.addBookingToLastPos(b2);
//        System.out.println("Last: " + dll.getLast().getBooking().getDescription());

        dll.addBookingAtIndex(0, b1);
        System.out.println("Erste Stelle 0");
        System.out.println(dll.getFirst().getBooking().getDescription());

        Booking b2 = new Booking();
        b2.setAmount(200.00);
        b2.setDescription("Auto");

        dll.addBookingAtIndex(0, b2);
        System.out.println("Erste Stelle 0 das jetzt Auto ist und dann erst Miete");
        System.out.println(dll.getFirst().getBooking().getDescription());
        System.out.println(dll.getLast().getBooking().getDescription());


        Booking b3 = new Booking();
        b3.setAmount(300.00);
        b3.setDescription("Ausflug");

        dll.addBookingAtIndex(1,b3);
        System.out.println("Das erste sollte jetzt trotzdem Auto sein und das letzte Miete");
        System.out.println(dll.getFirst().getBooking().getDescription());
        System.out.println(dll.getLast().getBooking().getDescription());

        Booking b4 = new Booking();
        b4.setAmount(400.00);
        b4.setDescription("Reperatur");

        dll.addBookingAtIndex(9,b3);
        System.out.println("Reparatur sollte an letzter stelle sein und das erste Auto");
        System.out.println(dll.getFirst().getBooking().getDescription());
        System.out.println(dll.getLast().getBooking().getDescription());
    }
}
