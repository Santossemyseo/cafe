package ptp.cafesin.entitys;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ptp.cafesin.entitys.Insumos;
import ptp.cafesin.entitys.Producto;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-25T18:11:49")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile ListAttribute<Categoria, Insumos> insumosList;
    public static volatile ListAttribute<Categoria, Producto> productoList;
    public static volatile SingularAttribute<Categoria, Integer> idcategoria;
    public static volatile SingularAttribute<Categoria, String> nomCategoria;

}