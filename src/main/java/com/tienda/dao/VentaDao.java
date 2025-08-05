
package com.tienda.dao;

import com.tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ridie
 */
public interface VentaDao extends JpaRepository<Venta, Long>{
    
}
