import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ticket implements Tickets {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int ticketId;
    private String eventName;
    private String ticketLocation;
    private double price;
    private TicketType type;
    private LocalDate eventDate;
    private LocalDate purchaseDate;
    private String studentId;

    LocalDate currentDate = LocalDate.now();

    private static int nextTicketId = 1;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Ticket(String eventName, String ticketLocation,
                  TicketType type, LocalDate eventDate, LocalDate purchaseDate) {
        this.eventName = eventName;
        this.ticketLocation = ticketLocation;
        this.type = type;
        this.eventDate = eventDate;
        this.purchaseDate = purchaseDate;

        generateTicketId();
        this.price = calculatePrice();


    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public int getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public TicketType getType() {
        return type;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    @Override
    public void generateTicketId(){
    ticketId = nextTicketId++;
    }

    @Override
    public double calculatePrice() {
        switch (type) {
            case TICKET_DOOR:
                price = 150;
                break;
            case TICKET_PRESALE:
                price = 120;
                if (currentDate.until(eventDate, ChronoUnit.DAYS) >= 10) {
                    price -= (price * 0.15); // Apply 15% discount
                }
                break;
            case TICKET_PRESALE_STUDENT_DISCOUNT:
                price = 90;
                if (currentDate.until(eventDate, ChronoUnit.DAYS) >= 10) {
                    price -= (price * 0.15); // Apply 15% discount
                }
                break;
        }
        return price;
    }


    //***TO-STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "******************\n" +
                "\nTicket to " + eventName +
                "\nType: " + type +
                "\nPrice : " + price +
                "\nDate : " + eventDate +
                "\nTicket ID : " + ticketId +
                "\n \nRemember your student ID if you have bought the ticket with student discount!" +
                "\n******************";
    }
    //------------------------------------------------------------------------------------------------------------------
}
