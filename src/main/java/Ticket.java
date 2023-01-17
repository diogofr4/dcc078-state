import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String titulo;
    private String descricao;
    private TicketEstado estado;

    public Ticket() {
        this.estado = TicketAberto.getInstance();
    }

    public TicketEstado getEstado() {
        return estado;
    }

    public void setEstado(TicketEstado estado) {
        this.estado = estado;
    }

    public boolean abrir(){
        return estado.abrir(this);
    }
    public boolean analisar(){
        return estado.analisar(this);
    }
    public boolean concluir(){
        return estado.concluir(this);
    }
    public boolean executar(){
        return estado.executar(this);
    }
    public boolean recusar(){
        return estado.recusar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
