/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ptp.cafesin.entitys.Turnos;

/**
 *
 * @author Primero tu Pais
 */
@Stateless
public class TurnosFacade extends AbstractFacade<Turnos> {

    @PersistenceContext(unitName = "perscafesin")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TurnosFacade() {
        super(Turnos.class);
    }
    
}
