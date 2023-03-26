package ptp.cafesin.entitys;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Categoria;
import ptp.cafesin.entitys.Insumoshasproductos;
import ptp.cafesin.entitys.Ordencompras;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Insumos.class)
public class Insumos_ { 

    public static volatile SingularAttribute<Insumos, Categoria> insCatCod;
    public static volatile SingularAttribute<Insumos, Date> createdAt;
    public static volatile SingularAttribute<Insumos, String> nombreInsumo;
    public static volatile SingularAttribute<Insumos, Long> valorInsumo;
    public static volatile ListAttribute<Insumos, Insumoshasproductos> insumoshasproductosList;
    public static volatile SingularAttribute<Insumos, Integer> codInsumos;
    public static volatile SingularAttribute<Insumos, Ordencompras> insOrdcom;
    public static volatile SingularAttribute<Insumos, Long> cantidadstock;
    public static volatile SingularAttribute<Insumos, Integer> idinsumo;
    public static volatile SingularAttribute<Insumos, Date> updatedAt;

}