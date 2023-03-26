package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Ordencompras;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedor, String> tipoDocumento;
    public static volatile SingularAttribute<Proveedor, Date> createdAt;
    public static volatile SingularAttribute<Proveedor, Integer> idprov;
    public static volatile ListAttribute<Proveedor, Ordencompras> ordencomprasList;
    public static volatile SingularAttribute<Proveedor, Long> numDocProv;
    public static volatile SingularAttribute<Proveedor, String> emailProveedor;
    public static volatile SingularAttribute<Proveedor, String> telProveedor;
    public static volatile SingularAttribute<Proveedor, Date> updatedAt;

}