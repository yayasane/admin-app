package sn.isi.adminapp.mapping;

import org.mapstruct.Mapper;
import sn.isi.adminapp.dto.Product;
import sn.isi.adminapp.entities.ProductEntity;

@Mapper
public interface ProductMapper {
    Product toProduct(ProductEntity productEntity);
    ProductEntity fromProduct(Product product);
}
