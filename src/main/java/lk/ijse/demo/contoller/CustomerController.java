package lk.ijse.demo.contoller;

import lk.ijse.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    @ResponseBody
    public boolean saveCustomer(@RequestBody CustomerDTO customerDto) {
        return customerService.saveCustomer(customerDto);
    }

}
