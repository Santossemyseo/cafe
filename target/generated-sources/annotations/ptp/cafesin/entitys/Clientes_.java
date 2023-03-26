package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Venta;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> emailCliente;
    public static volatile SingularAttribute<Clientes, Date> createdAt;
    public static volatile SingularAttribute<Clientes, String> nombreCliente;
    public static volatile SingularAttribute<Clientes, String> apellidosCliente;
    public static volatile SingularAttribute<Clientes, String> tipoDocumentoCliente;
    public static volatile SingularAttribute<Clientes, String> telCliente;
    public static volatile ListAttribute<Clientes, Venta> ventaList;
    public static volatile SingularAttribute<Clientes, Long> numDocumentoCliente;
    public static volatile SingularAttribute<Clientes, Integer> idcliente;
    public static volatile SingularAttribute<Clientes, Date> updatedAt;

}