package ptp.cafesin.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Producto;
import ptp.cafesin.entitys.Venta;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Ventahasproducto.class)
public class Ventahasproducto_ { 

    public static volatile SingularAttribute<Ventahasproducto, Integer> idvhp;
    public static volatile SingularAttribute<Ventahasproducto, Venta> ventaId;
    public static volatile SingularAttribute<Ventahasproducto, Long> cantidad;
    public static volatile SingularAttribute<Ventahasproducto, Producto> producId;

}