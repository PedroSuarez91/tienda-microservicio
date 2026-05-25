package ecoMarket.tienda_microservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecoMarket.tienda_microservicio.model.Tienda;
import ecoMarket.tienda_microservicio.repository.TiendaRepository;


import java.util.ArrayList;


@Service
public class TiendaService {

    @Autowired
    private TiendaRepository tiendaRepository;

    public Tienda asignarHorarioEmpleado(Long idTienda, String empleado, String horario) {
        Tienda tienda = tiendaRepository.findById(idTienda).orElse(null);

        if (tienda != null) {
            List<String> empleados = tienda.getNominaEmpleados();

            if (empleados == null) {
                empleados = new ArrayList<>();
            }

            empleados.add(empleado + " - " + horario);
            tienda.setNominaEmpleados(empleados);

            return tiendaRepository.save(tienda);
        }

        return null;
    }

    public List<String> listarNormas(Long idTienda) {
        Tienda tienda = tiendaRepository.findById(idTienda).orElse(null);

        if (tienda != null) {
            return tienda.getNormas();
        }

        return new ArrayList<>();
    }

    public List<String> listarEmpleados(Long idTienda) {
        Tienda tienda = tiendaRepository.findById(idTienda).orElse(null);

        if (tienda != null) {
            return tienda.getNominaEmpleados();
        }

        return new ArrayList<>();
    }

    public Tienda crearTienda(Tienda tienda) {
    return tiendaRepository.save(tienda);
    }
    
    public List<Tienda> listarTiendas() {
        return tiendaRepository.findAll();
    }
    public Tienda modificarTienda(Long idTienda, Tienda tiendaActualizada) {

    Tienda tiendaExistente = tiendaRepository.findById(idTienda).orElse(null);

    if (tiendaExistente != null) {

        tiendaExistente.setNombre(tiendaActualizada.getNombre());
        tiendaExistente.setUbicacion(tiendaActualizada.getUbicacion());
        tiendaExistente.setNominaEmpleados(tiendaActualizada.getNominaEmpleados());
        tiendaExistente.setNormas(tiendaActualizada.getNormas());
        tiendaExistente.setHorarioTienda(tiendaActualizada.getHorarioTienda());

        return tiendaRepository.save(tiendaExistente);
        }

    return null;
    }
}