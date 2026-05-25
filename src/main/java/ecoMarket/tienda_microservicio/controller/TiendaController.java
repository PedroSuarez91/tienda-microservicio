package ecoMarket.tienda_microservicio.controller;

import ecoMarket.tienda_microservicio.model.Tienda;
import ecoMarket.tienda_microservicio.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tiendas")
public class TiendaController {

    @Autowired
    private TiendaService tiendaService;

    @PostMapping("/{idTienda}/asignar-horario")
    public Tienda asignarHorarioEmpleado(
            @PathVariable Long idTienda,
            @RequestParam String empleado,
            @RequestParam String horario
    ) {
        return tiendaService.asignarHorarioEmpleado(idTienda, empleado, horario);
    }

    @GetMapping("/{idTienda}/normas")
    public List<String> listarNormas(@PathVariable Long idTienda) {
        return tiendaService.listarNormas(idTienda);
    }

    @GetMapping("/{idTienda}/empleados")
    public List<String> listarEmpleados(@PathVariable Long idTienda) {
        return tiendaService.listarEmpleados(idTienda);
    }

    @GetMapping
    public List<Tienda> listarTiendas() {
        return tiendaService.listarTiendas();
    }

    @PostMapping
    public Tienda crearTienda(@RequestBody Tienda tienda) {
        return tiendaService.crearTienda(tienda);
    }
    @PutMapping("/{idTienda}")
    public Tienda modificarTienda(
        @PathVariable Long idTienda,
        @RequestBody Tienda tiendaActualizada
    ) {
    return tiendaService.modificarTienda(idTienda, tiendaActualizada);
    }
}
