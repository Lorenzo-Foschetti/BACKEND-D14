package lorenzofoschetti.entities;

import jakarta.persistence.*;
import lorenzofoschetti.enums.Stato;

@Entity
@Table(name = "partecipazioni")

public class Partecipazioni {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Persona partecipazioni;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private Stato stato;


    public Partecipazioni() {

    }

    public Partecipazioni(Persona persona, Evento evento, Stato stato) {
        this.partecipazioni = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public Persona getPersonaList() {
        return partecipazioni;
    }

    public void setPersonaList(Persona persona) {
        this.partecipazioni = persona;
    }

    public Persona getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(Persona partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStatoType(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazioni{" +
                "id=" + id +
                ", evento=" + evento +
                ", statoType=" + stato +
                '}';
    }
}