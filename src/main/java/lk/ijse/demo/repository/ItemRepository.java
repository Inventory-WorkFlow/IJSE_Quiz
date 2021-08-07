package lk.ijse.demo.repository;

import lk.ijse.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Geeth Malinda
 * Date: 8/07/2021
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

}
