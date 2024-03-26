package daos;

import models.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDao extends CrudRepository<Seller, Long> {
}
