package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Insumos;
import ptp.cafesin.entitys.Proveedor;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Ordencompras.class)
public class Ordencompras_ { 

    public static volatile SingularAttribute<Ordencompras, Date> createdAt;
    public static volatile SingularAttribute<Ordencompras, Proveedor> ordcomIdprov;
    public static volatile ListAttribute<Ordencompras, Insumos> insumosList;
    public static volatile SingularAttribute<Ordencompras, Long> valorTotal;
    public static volatile SingularAttribute<Ordencompras, Integer> idfact;
    public static volatile SingularAttribute<Ordencompras, Long> cantidad;
    public static volatile SingularAttribute<Ordencompras, Integer> facturaCompra;
    public static volatile SingularAttribute<Ordencompras, Date> updatedAt;

}