package lorenzofoschetti.entities;

import jakarta.persistence.*;

import javax.xml.stream.Location;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "evento")

public abstract class Evento {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String titolo;
    @Column(name = "data_evento")
    private LocalDate data_evento;
    @Column(name = "descrizione")
    private String descrizione;
    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private Evento evento;
    @Column(name = "numero_max_partecipanti")
    private int numero_max_partecipanti;


    @ManyToOne
    @JoinColumn(name = "location_id", unique = true)
    private Location location;
    @OneToMany(mappedBy = "evento")
    private List<Partecipazioni> partecipazioniList;


    public Evento() {

    }

    public Evento(String titolo, LocalDate data_evento, String descrizione, Evento evento, int numero_max_partecipanti, Location location) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.evento = evento;
        this.numero_max_partecipanti = numero_max_partecipanti;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEventoType(Evento evento) {
        this.evento = evento;
    }

    public int getNumero_max_partecipanti() {
        return numero_max_partecipanti;
    }

    public void setNumero_max_partecipanti(int numero_max_partecipanti) {
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", eventoType=" + evento +
                ", numero_max_partecipanti=" + numero_max_partecipanti +
                '}';
    }
}
