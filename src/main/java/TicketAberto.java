public class TicketAberto extends TicketEstado{
    private TicketAberto() {
    }
    private static TicketAberto instance = new TicketAberto();
    public static TicketAberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ticket Aberto";
    }

    @Override
    public boolean analisar(Ticket ticket) {
        ticket.setEstado(TicketAnalisado.getInstance());
        return true;
    }

    @Override
    public boolean concluir(Ticket ticket) {
        ticket.setEstado(TicketConcluido.getInstance());
        return true;
    }

    @Override
    public boolean recusar(Ticket ticket) {
        ticket.setEstado(TicketRecusado.getInstance());
        return true;
    }
}
