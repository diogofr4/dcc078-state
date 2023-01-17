public class TicketRecusado extends TicketEstado{
    private TicketRecusado() {
    }
    private static TicketRecusado instance = new TicketRecusado();
    public static TicketRecusado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ticket Recusado";
    }

    @Override
    public boolean analisar(Ticket ticket) {
        ticket.setEstado(TicketAnalisado.getInstance());
        return true;
    }
}
