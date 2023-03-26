/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ptp.cafesin.entitys.Producto;

/**
 *
 * @author Primero tu Pais
 */
@Stateless
public class ProductoFacade extends AbstractFacade<Producto> {

    @PersistenceContext(unitName = "perscafesin")
    private EntityManager em;
    private Query qr;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoFacade() {
        super(Producto.class);
    }
    
    public List<Producto> fndbynm(String nm){
        qr = em.createQuery("SELECT p FROM Producto p WHERE p.nombreProducto = :nm ");
        qr.setParameter("nm", nm);
        return qr.getResultList();
    }
    
}
