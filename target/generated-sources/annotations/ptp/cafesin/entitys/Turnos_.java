package ptp.cafesin.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Colaboradores;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Turnos.class)
public class Turnos_ { 

    public static volatile SingularAttribute<Turnos, String> nombreTurno;
    public static volatile SingularAttribute<Turnos, String> descripcionTurno;
    public static volatile ListAttribute<Turnos, Colaboradores> colaboradoresList;
    public static volatile SingularAttribute<Turnos, Integer> idTurno;

}