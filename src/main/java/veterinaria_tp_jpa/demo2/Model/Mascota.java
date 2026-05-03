package veterinaria_tp_jpa.demo2.Model;

import jakarta.persistence.*;

@Entity //declara la clase como identidad de la bdd a mapear
@Table(name="mascota")
public class Mascota {
    @Id //para declarar id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para usar de auto_increment
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    @ManyToOne //especifica el tipo de relacion, en este caso muchos a uno
    @JoinColumn(name = "id_cliente") // identifica la columna de la FK
    private Cliente mascota_cliente;

    public Mascota(int id_mascota, String nombre, String especie, String raza, int edad, double peso, Cliente mascota_cliente) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.mascota_cliente=mascota_cliente;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
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

    public double getPeso() {
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
