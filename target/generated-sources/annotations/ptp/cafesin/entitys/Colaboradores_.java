package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Rol;
import ptp.cafesin.entitys.Turnos;
import ptp.cafesin.entitys.Venta;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Colaboradores.class)
public class Colaboradores_ { 

    public static volatile SingularAttribute<Colaboradores, Rol> usRolId;
    public static volatile SingularAttribute<Colaboradores, String> nombreColaborador;
    public static volatile SingularAttribute<Colaboradores, Turnos> usTurnId;
    public static volatile SingularAttribute<Colaboradores, Long> numDoc;
    public static volatile SingularAttribute<Colaboradores, String> confirmarPassword;
    public static volatile SingularAttribute<Colaboradores, Date> fechaTurno;
    public static volatile SingularAttribute<Colaboradores, String> telefonoColaborador;
    public static volatile SingularAttribute<Colaboradores, Date> createdAt;
    public static volatile SingularAttribute<Colaboradores, String> password;
    public static volatile SingularAttribute<Colaboradores, Integer> idcol;
    public static volatile ListAttribute<Colaboradores, Venta> ventaList;
    public static volatile SingularAttribute<Colaboradores, String> tipoDoc;
    public static volatile SingularAttribute<Colaboradores, String> emailColaborador;
    public static volatile SingularAttribute<Colaboradores, String> apellidoColaborador;
    public static volatile SingularAttribute<Colaboradores, Date> updatedAt;

}