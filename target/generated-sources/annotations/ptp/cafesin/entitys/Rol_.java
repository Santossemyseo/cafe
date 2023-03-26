package ptp.cafesin.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Colaboradores;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, Integer> idrol;
    public static volatile SingularAttribute<Rol, String> descripcionRol;
    public static volatile ListAttribute<Rol, Colaboradores> colaboradoresList;

}