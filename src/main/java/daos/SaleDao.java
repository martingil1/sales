package daos;

import models.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDao extends CrudRepository<Sale, Long> {
}
