import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Ticket ticket1 = new Ticket("Distortion","Copenhagen", TicketType.TICKET_DOOR, LocalDate.of(2024, 11, 11), LocalDate.now());
        Ticket ticket2 = new Ticket("Coachella","LA", TicketType.TICKET_PRESALE, LocalDate.of(2024, 11, 11), LocalDate.now());

        System.out.println(ticket1);
        System.out.println(ticket2);

    }
}