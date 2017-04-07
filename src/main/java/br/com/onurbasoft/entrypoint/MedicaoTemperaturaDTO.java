package br.com.onurbasoft.entrypoint;

import br.com.onurbasoft.domain.MedicaoTemperatura;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class MedicaoTemperaturaDTO {
    private Integer id;
    private double temperatura;
    private Instant instante;

    @JsonCreator
    public MedicaoTemperaturaDTO(
            @JsonProperty("id") Integer id,
            @JsonProperty("temperatura") double temperatura,
            @JsonProperty("instante") Instant instante
    ) {
        this.id = id;
        this.temperatura = temperatura;
        this.instante = instante;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Integer getId() {
        return id;
    }

    public Instant getInstante() {
        return instante;
    }

    public MedicaoTemperatura toMedicaoTemperatura(){
        return  new MedicaoTemperatura(this.getTemperatura(), this.getInstante());
    }

}

