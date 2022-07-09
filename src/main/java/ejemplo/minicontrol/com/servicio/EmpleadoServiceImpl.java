/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.minicontrol.com.servicio;

import ejemplo.minicontrol.com.entidades.Empleado;
import ejemplo.minicontrol.com.repositorio.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author byroncarpio
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
	return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Empleado> findAll(Pageable pageable) {
        return empleadoRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findOne(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        empleadoRepository.deleteById(id);  
     }
}
