package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.metamodel.SingularAttribute;

@Entity
public class Equipo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_equipo;
    private String tipoEquipo;
    private String marcaEquipo;
    private String modeloEquipo;
    private String serieEquipo;

    public Equipo() {
    }

    public Equipo(int id_equipo, String tipoEquipo, String marcaEquipo, String modeloEquipo, String serieEquipo) {
        this.id_equipo = id_equipo;
        this.tipoEquipo = tipoEquipo;
        this.marcaEquipo = marcaEquipo;
        this.modeloEquipo = modeloEquipo;
        this.serieEquipo = serieEquipo;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

    public String getModeloEquipo() {
        return modeloEquipo;
    }

    public void setModeloEquipo(String modeloEquipo) {
        this.modeloEquipo = modeloEquipo;
    }

    public String getSerieEquipo() {
        return serieEquipo;
    }

    public void setSerieEquipo(String serieEquipo) {
        this.serieEquipo = serieEquipo;
    }

}