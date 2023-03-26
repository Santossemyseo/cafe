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
import ptp.cafesin.entitys.Colaboradores;

/**
 *
 * @author Primero tu Pais
 */
@Stateless
public class ColaboradoresFacade extends AbstractFacade<Colaboradores> {

    @PersistenceContext(unitName = "perscafesin")
    private EntityManager em;
    private Query qr;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColaboradoresFacade() {
        super(Colaboradores.class);
    }
    public List<Colaboradores> login (String correo, String pass) {
        qr = em.createQuery("SELECT cb FROM Colaboradores cb WHERE cb.emailColaborador = :emailColaborador AND cb.password = :password");
        qr.setParameter("emailColaborador", correo);
        qr.setParameter("password", pass);
        return qr.getResultList();
    }
    
}
