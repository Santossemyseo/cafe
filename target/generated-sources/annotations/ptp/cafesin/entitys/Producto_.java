package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Categoria;
import ptp.cafesin.entitys.Insumoshasproductos;
import ptp.cafesin.entitys.Ventahasproducto;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> idprod;
    public static volatile SingularAttribute<Producto, Date> createdAt;
    public static volatile SingularAttribute<Producto, Integer> codProducto;
    public static volatile ListAttribute<Producto, Ventahasproducto> ventahasproductoList;
    public static volatile SingularAttribute<Producto, Long> valorProducto;
    public static volatile SingularAttribute<Producto, Categoria> prodCatId;
    public static volatile SingularAttribute<Producto, String> descripcionProducto;
    public static volatile ListAttribute<Producto, Insumoshasproductos> insumoshasproductosList;
    public static volatile SingularAttribute<Producto, Long> cantidad;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Date> updatedAt;

}