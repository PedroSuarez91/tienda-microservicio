package ecoMarket.tienda_microservicio.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ubicacion;

    @ElementCollection
    @CollectionTable(
            name = "tienda_nomina_empleados",
            joinColumns = @JoinColumn(name = "tienda_id")
    )
    @Column(name = "empleado", nullable = false)
    private List<String> nominaEmpleados = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "tienda_normas",
            joinColumns = @JoinColumn(name = "tienda_id")
    )
    @Column(name = "norma", nullable = false)
    private List<String> normas = new ArrayList<>();

    @Column(nullable = false)
    private String horarioTienda;

    public Tienda() {
    }

    public Tienda(Long id, String nombre, String ubicacion, List<String> nominaEmpleados, List<String> normas, String horarioTienda) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nominaEmpleados = nominaEmpleados;
        this.normas = normas;
        this.horarioTienda = horarioTienda;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<String> getNominaEmpleados() {
        return nominaEmpleados;
    }

    public List<String> getNormas() {
        return normas;
    }

    public String getHorarioTienda() {
        return horarioTienda;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNominaEmpleados(List<String> nominaEmpleados) {
        this.nominaEmpleados = nominaEmpleados;
    }

    public void setNormas(List<String> normas) {
        this.normas = normas;
    }

    public void setHorarioTienda(String horarioTienda) {
        this.horarioTienda = horarioTienda;
    }
}
