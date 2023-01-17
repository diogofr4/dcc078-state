public class TicketEmProgresso extends TicketEstado{
    private TicketEmProgresso() {
    }
    private static TicketEmProgresso instance = new TicketEmProgresso();
    public static TicketEmProgresso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ticket em Progresso";
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
