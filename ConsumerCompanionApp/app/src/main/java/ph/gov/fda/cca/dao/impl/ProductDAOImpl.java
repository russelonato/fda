package ph.gov.fda.cca.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ph.gov.fda.cca.dao.interfce.IProductDAO;
import ph.gov.fda.cca.model.Product;

/**
 * Created by Russel on 17/10/29.
 */

public class ProductDAOImpl implements IProductDAO {
    @Override
    public List<Product> find() {
        List<Product> products = null;

        for(int index = 0; index < 10; index++){
            if(products == null){
                products = new ArrayList<Product>();
            }

            Product product = new Product();
            product.setProductName("Product " + index);
            product.setProductType("Type " + index);
            product.setProductDescription("Sample product");

            products.add(product);
        }

        return products;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
