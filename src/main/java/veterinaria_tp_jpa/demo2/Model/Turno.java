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
    private Cliente cliente;

    @ManyToOne
    @JoinColumn (name="id_veterinario")
    private Veterinario veterinario;

    @OneToOne
    @JoinColumn (name="id_mascota")
    private Mascota mascota;

    public Turno(LocalDate fecha, Time hora, String motivo, estado estado, Cliente cliente, Veterinario veterinario, Mascota mascota) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.cliente = cliente;
        this.veterinario = veterinario;
        this.mascota = mascota;
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


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
