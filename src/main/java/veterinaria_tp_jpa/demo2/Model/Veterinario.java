package veterinaria_tp_jpa.demo2.Model;

import jakarta.persistence.*;

@Entity
@Table(name="veterinario")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_veterinario")
    private Integer idVeterinario;
    private String nombre;
    private String apellido;
    private String matricula;
    private String especialidad;
    private String telefono;
    private String email;

    public Veterinario( String nombre, String apellido, String matricula, String especialidad, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
    }

    public Veterinario() {
    }

    public Integer getId_veterinario() {
        return idVeterinario;
    }

    public void setId_veterinario(Integer id_veterinario) {
        this.idVeterinario = id_veterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
