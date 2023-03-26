package ptp.cafesin.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Insumos;
import ptp.cafesin.entitys.Producto;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Insumoshasproductos.class)
public class Insumoshasproductos_ { 

    public static volatile SingularAttribute<Insumoshasproductos, Integer> idinshasprod;
    public static volatile SingularAttribute<Insumoshasproductos, Insumos> ihpIns;
    public static volatile SingularAttribute<Insumoshasproductos, Long> cantidad;
    public static volatile SingularAttribute<Insumoshasproductos, Producto> ihpProd;

}