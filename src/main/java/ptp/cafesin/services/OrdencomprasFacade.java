/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ptp.cafesin.entitys.Ordencompras;

/**
 *
 * @author Primero tu Pais
 */
@Stateless
public class OrdencomprasFacade extends AbstractFacade<Ordencompras> {

    @PersistenceContext(unitName = "perscafesin")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdencomprasFacade() {
        super(Ordencompras.class);
    }
    
}
