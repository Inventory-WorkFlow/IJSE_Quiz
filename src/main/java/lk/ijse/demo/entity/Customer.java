package lk.ijse.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Geeth Malinda
 * Date: 8/07/2021
 */

@Entity
@Table(name = "T_CUSTOMER")
public class Customer implements Serializable {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SALARY")
    private Double salary;

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public CustomerDTO getCustomerDto() {
        CustomerDTO customerDto = new CustomerDTO();
        customerDto.setId(this.id);
        customerDto.setName(this.name);
        customerDto.setAddress(this.address);
        customerDto.setSalary(this.salary);
        return customerDto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", order=").append(order);
        sb.append('}');
        return sb.toString();
    }
}
