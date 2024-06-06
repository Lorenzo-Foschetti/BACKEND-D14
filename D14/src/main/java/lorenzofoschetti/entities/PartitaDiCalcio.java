package lorenzofoschetti.entities;


import jakarta.persistence.Entity;

import javax.xml.stream.Location;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento {

    private String squadraDiCasa;

    private String squadraOspite;

    private String squadraVincente;

    private Integer goalSquadraCasa;

    private Integer goalSquadraOspite;

    public PartitaDiCalcio() {

    }


    public PartitaDiCalcio(String titolo, LocalDate data_evento, String descrizione, Evento evento, int numero_max_partecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, Integer goalSquadraCasa, Integer goalSquadraOspite) {
        super(titolo, data_evento, descrizione, evento, numero_max_partecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.goalSquadraCasa = goalSquadraCasa;
        this.goalSquadraOspite = goalSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public Integer getGoalSquadraCasa() {
        return goalSquadraCasa;
    }

    public void setGoalSquadraCasa(Integer goalSquadraCasa) {
        this.goalSquadraCasa = goalSquadraCasa;
    }

    public Integer getGoalSquadraOspite() {
        return goalSquadraOspite;
    }

    public void setGoalSquadraOspite(Integer goalSquadraOspite) {
        this.goalSquadraOspite = goalSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", goalSquadraCasa=" + goalSquadraCasa +
                ", goalSquadraOspite=" + goalSquadraOspite +
                '}';
    }
}
