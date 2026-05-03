package veterinaria_tp_jpa.demo2.Model;

import jakarta.persistence.*;

@Entity //declara la clase como identidad de la bdd a mapear
@Table(name="mascota")
public class Mascota {
    @Id //para declarar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para usar de auto_increment
    @Column(name="id_mascota")
    private Integer idMascota;

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Double peso;
    @ManyToOne //especifica el tipo de relacion, en este caso muchos a uno
    @JoinColumn (name = "id_cliente") // identifica la columna de la FK
    private Cliente mascota_cliente;

    public Mascota( String nombre, String especie, String raza, int edad, Double peso, Cliente mascota_cliente) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.mascota_cliente=mascota_cliente;
    }
    public Mascota() {
    }

    public int getId_mascota() {
        return idMascota;
    }

    public void setId_mascota(Integer id_mascota) {
        this.idMascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cliente getCliente() {
        return mascota_cliente;
    }

    public void setCliente(Cliente cliente) {
        this.mascota_cliente = cliente;
    }
}
