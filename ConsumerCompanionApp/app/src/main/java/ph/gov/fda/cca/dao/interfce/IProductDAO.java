package ph.gov.fda.cca.dao.interfce;

import java.util.List;

import ph.gov.fda.cca.model.Product;

/**
 * Created by Russel on 17/10/29.
 */
public interface IProductDAO {
    public List<Product> find();

    public void insert(Product product);

    public void update(Product product);

    public void delete(Product product);
}
