package veterinaria_tp_jpa.demo2.Model;

import jakarta.persistence.*;
import veterinaria_tp_jpa.demo2.Enums.estado;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="turno")
public class Turno {
    @Id //para declarar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para usar de auto_increment
    @Column(name="id_turno")
    private Integer idTurno;
    private LocalDate fecha;
    private Time hora;
    private String motivo;
    @Enumerated(EnumType.STRING)
    private estado estado;

    @ManyToOne
    @JoinColumn (name="id_cliente")
    private Integer id_cliente;

    @ManyToOne
    @JoinColumn (name="id_veterinario")
    private Integer id_veterinario;

    @OneToOne
    @JoinColumn (name="id_mascota")
    private Integer id_mascota;

    public Turno(LocalDate fecha, Time hora, String motivo, estado estado, int id_cliente, int id_veterinario, int id_mascota) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.id_cliente = id_cliente;
        this.id_veterinario = id_veterinario;
        this.id_mascota = id_mascota;
    }

    public Turno() {
    }

    public Integer getId_turno() {
        return idTurno;
    }

    public void setId_turno(Integer id_turno) {
        this.idTurno = id_turno;
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

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
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
