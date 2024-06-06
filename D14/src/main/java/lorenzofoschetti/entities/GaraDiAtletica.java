package lorenzofoschetti.entities;


import javax.xml.stream.Location;
import java.time.LocalDate;
import java.util.List;

public class GaraDiAtletica extends Evento {

    private List<Persona> atleti;

    private Persona vincitore;

    public GaraDiAtletica() {

    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, Evento evento, int numero_max_partecipanti, Location location, List<Persona> atleti, Persona vincitore) {
        super(titolo, data_evento, descrizione, evento, numero_max_partecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public List<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(List<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
