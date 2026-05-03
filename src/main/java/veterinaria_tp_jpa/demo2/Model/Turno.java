package veterinaria_tp_jpa.demo2.Model;

import jakarta.persistence.*;
import veterinaria_tp_jpa.demo2.Enums.Eestado;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="turno")
public class Turno {
    @Id //para declarar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para usar de auto_increment
    private int id_turno;
    private LocalDate fecha;
    private Time hora;
    private String motivo;
    private Eestado estado;
    @ManyToOne
    @JoinColumn (name="id_cliente")
    private int id_cliente;

    @ManyToOne
    @JoinColumn (name="id_veterinario")
    private int id_veterinario;

    @OneToOne
    @JoinColumn (name="id_mascota")
    private int id_mascota;

    public Turno(int id_turno, LocalDate fecha, Time hora, String motivo, Eestado estado, int id_cliente, int id_veterinario, int id_mascota) {
        this.id_turno = id_turno;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.id_cliente = id_cliente;
        this.id_veterinario = id_veterinario;
        this.id_mascota = id_mascota;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Eestado getEstado() {
        return estado;
    }

    public void setEstado(Eestado estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }
}
