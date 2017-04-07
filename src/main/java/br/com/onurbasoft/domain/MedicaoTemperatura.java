package br.com.onurbasoft.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class MedicaoTemperatura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private Double temperatura;
    private Instant instante;

    public MedicaoTemperatura() {
    }

    public MedicaoTemperatura(Double temperatura, Instant instante) {
        this.temperatura = temperatura;
        this.instante = instante;
    }

    public Integer getId() {
        return id;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Instant getInstante() {
        return instante;
    }
}
