public abstract class TicketEstado {
    public abstract String getEstado();
    public boolean abrir(Ticket ticket){
        return false;
    }
    public boolean analisar(Ticket ticket){
        return false;
    }
    public boolean concluir(Ticket ticket){
        return false;
    }
    public boolean executar(Ticket ticket){
        return false;
    }
    public boolean recusar(Ticket ticket){
        return false;
    }
}
