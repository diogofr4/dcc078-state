public class TicketAnalisado extends TicketEstado{
    private TicketAnalisado() {
    }
    private static TicketAnalisado instance = new TicketAnalisado();
    public static TicketAnalisado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ticket Analisado";
    }

    @Override
    public boolean executar(Ticket ticket) {
        ticket.setEstado(TicketEmProgresso.getInstance());
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
