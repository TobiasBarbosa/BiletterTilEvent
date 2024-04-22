import java.util.ArrayList;

public class soldTickets {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    ArrayList<Ticket> soldTicketsList;

    private int doorTicketCount;
    private int preSaleTicketCount;
    private int preSaleStudentDiscountTicketCount;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public soldTickets() {
        this.soldTicketsList = new ArrayList<>();
        doorTicketCount = 0;
        preSaleTicketCount = 0;
        preSaleStudentDiscountTicketCount = 0;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public void addSoldTickets(Ticket ticket) {
        soldTicketsList.add(ticket);

        // Increment counters based on ticket type
        switch (ticket.getType()) {
            case TICKET_DOOR:
                doorTicketCount++;
                break;
            case TICKET_PRESALE:
                preSaleTicketCount++;
                break;
            case TICKET_PRESALE_STUDENT_DISCOUNT:
                preSaleStudentDiscountTicketCount++;
                break;
            default:
                break;
        }
    }

    public void PrintAllTickets(){
        System.out.println(soldTicketsList);
    }

    public void printTicketCounts() {
        System.out.println("TICKET COUNT:");
        System.out.println("TICKET FROM DOOR: " + doorTicketCount);
        System.out.println("TICKET FROM PRESALE: " + preSaleTicketCount);
        System.out.println("TICKET FROM PRESALE WITH STUDENT DISCOUNT: " + preSaleStudentDiscountTicketCount);
    }

    public String getAllStudentCardId(){
        return "hej";
    }


    @Override
    public String toString() {
        return "soldTickets{" +
                "soldTicketsList=" + soldTicketsList +
                '}';
    }
}
