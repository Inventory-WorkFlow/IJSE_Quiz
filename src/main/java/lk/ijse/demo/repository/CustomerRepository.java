package lk.ijse.demo.repository;

import com.jamith.absd.posangularspringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Geeth Malinda
 * Date: 8/07/2021
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
