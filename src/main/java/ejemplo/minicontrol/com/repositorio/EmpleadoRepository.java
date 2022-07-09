/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.minicontrol.com.repositorio;

import ejemplo.minicontrol.com.entidades.Empleado;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author byroncarpio
 */
public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long> {
    
}
