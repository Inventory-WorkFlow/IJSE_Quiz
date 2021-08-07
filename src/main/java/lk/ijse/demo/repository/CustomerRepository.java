package lk.ijse.demo.repository;

import com.jamith.absd.posangularspringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
