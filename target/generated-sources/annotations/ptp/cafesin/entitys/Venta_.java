package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Clientes;
import ptp.cafesin.entitys.Colaboradores;
import ptp.cafesin.entitys.Ventahasproducto;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> createdAt;
    public static volatile SingularAttribute<Venta, Integer> idven;
    public static volatile ListAttribute<Venta, Ventahasproducto> ventahasproductoList;
    public static volatile SingularAttribute<Venta, Clientes> venCliNum;
    public static volatile SingularAttribute<Venta, Colaboradores> venColaNum;
    public static volatile SingularAttribute<Venta, Integer> facturaVenta;
    public static volatile SingularAttribute<Venta, Long> valorTotalVenta;
    public static volatile SingularAttribute<Venta, Date> updatedAt;

}