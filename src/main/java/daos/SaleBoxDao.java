package daos;

import models.SaleBox;
import models.SaleBoxId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleBoxDao extends CrudRepository<SaleBoxId, SaleBox> {
}
