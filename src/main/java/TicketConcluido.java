public class TicketConcluido extends TicketEstado{
    private TicketConcluido() {
    }
    private static TicketConcluido instance = new TicketConcluido();
    public static TicketConcluido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ticket Concluido";
    }
}
