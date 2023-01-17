import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    Ticket ticket;

    @BeforeEach
    public void setUp(){
        ticket = new Ticket();
    }

    @Test
    public void naoDeveAbrirTicketAberto() {
        ticket.setEstado(TicketAberto.getInstance());
        assertFalse(ticket.abrir());
    }

    @Test
    public void deveConcluirTicketAberto() {
        ticket.setEstado(TicketAberto.getInstance());
        assertTrue(ticket.concluir());
        assertEquals(TicketConcluido.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveAnalisarTicketAberto() {
        ticket.setEstado(TicketAberto.getInstance());
        assertTrue(ticket.analisar());
        assertEquals(TicketAnalisado.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveRecusarTicketAberto() {
        ticket.setEstado(TicketAberto.getInstance());
        assertTrue(ticket.recusar());
        assertEquals(TicketRecusado.getInstance(), ticket.getEstado());
    }

    // Ticket analisado
    @Test
    public void naoDeveAnalisarTicketAnalisado() {
        ticket.setEstado(TicketAnalisado.getInstance());
        assertFalse(ticket.analisar());
    }

    @Test
    public void naoDeveAbrirTicketAnalisado() {
        ticket.setEstado(TicketAnalisado.getInstance());
        assertFalse(ticket.abrir());
    }

    @Test
    public void deveConcluirTicketAnalisado() {
        ticket.setEstado(TicketAnalisado.getInstance());
        assertTrue(ticket.concluir());
        assertEquals(TicketConcluido.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveExecutarTicketAnalisado() {
        ticket.setEstado(TicketAnalisado.getInstance());
        assertTrue(ticket.executar());
        assertEquals(TicketEmProgresso.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveRecusarTicketAnalisado() {
        ticket.setEstado(TicketAnalisado.getInstance());
        assertTrue(ticket.recusar());
        assertEquals(TicketRecusado.getInstance(), ticket.getEstado());
    }

    // Ticket concluido
    @Test
    public void naoDeveConcluirTicketConcluido() {
        ticket.setEstado(TicketConcluido.getInstance());
        assertFalse(ticket.concluir());
    }

    @Test
    public void naoDeveAnalisarTicketConcluido() {
        ticket.setEstado(TicketConcluido.getInstance());
        assertFalse(ticket.analisar());
    }

    @Test
    public void naoDeveAbrirTicketConcluido() {
        ticket.setEstado(TicketConcluido.getInstance());
        assertFalse(ticket.abrir());
    }

    @Test
    public void naoDeveExecutarTicketConcluido() {
        ticket.setEstado(TicketConcluido.getInstance());
        assertFalse(ticket.executar());
    }

    @Test
    public void naoDeveRecusarTicketConcluido() {
        ticket.setEstado(TicketConcluido.getInstance());
        assertFalse(ticket.recusar());
    }

    // Ticket em progresso
    @Test
    public void naoDeveExecutarTicketEmProgresso() {
        ticket.setEstado(TicketEmProgresso.getInstance());
        assertFalse(ticket.executar());
    }

    @Test
    public void naoDeveAbrirTicketEmProgresso() {
        ticket.setEstado(TicketEmProgresso.getInstance());
        assertFalse(ticket.abrir());
    }

    @Test
    public void naoDeveAnalisarTicketEmProgresso() {
        ticket.setEstado(TicketEmProgresso.getInstance());
        assertFalse(ticket.analisar());
    }

    @Test
    public void deveConcluirTicketEmProgresso() {
        ticket.setEstado(TicketEmProgresso.getInstance());
        assertTrue(ticket.concluir());
        assertEquals(TicketConcluido.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveRecusarTicketEmProgresso() {
        ticket.setEstado(TicketEmProgresso.getInstance());
        assertTrue(ticket.recusar());
        assertEquals(TicketRecusado.getInstance(), ticket.getEstado());
    }

    // Ticket Recusado
    @Test
    public void naoDeveRecusarTicketRecusado() {
        ticket.setEstado(TicketRecusado.getInstance());
        assertFalse(ticket.recusar());
    }

    @Test
    public void naoDeveAbrirTicketRecusado() {
        ticket.setEstado(TicketRecusado.getInstance());
        assertFalse(ticket.abrir());
    }

    @Test
    public void naoDeveConcluirTicketRecusado() {
        ticket.setEstado(TicketRecusado.getInstance());
        assertFalse(ticket.concluir());
    }

    @Test
    public void naoDeveExecutarTicketRecusado() {
        ticket.setEstado(TicketRecusado.getInstance());
        assertFalse(ticket.executar());
    }

    @Test
    public void deveAnalisarTicketRecusado() {
        ticket.setEstado(TicketRecusado.getInstance());
        assertTrue(ticket.analisar());
        assertEquals(TicketAnalisado.getInstance(), ticket.getEstado());
    }

}
