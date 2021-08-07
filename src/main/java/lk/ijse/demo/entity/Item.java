package lk.ijse.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_ITEM")

/**
 * @author Geeth Malinda
 * Date: 8/07/2021
 */
public class Item {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UNIT_PRICE")
    private Double unitPrice;

    @Column(name = "QTY_ON_HAND")
    private Integer qtyOnHand;

    public Item() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(Integer qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public ItemDTO getItemDTO() {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setCode(this.code);
        itemDTO.setName(this.name);
        ;
        itemDTO.setDescription(this.description);
        itemDTO.setPrice(this.unitPrice);
        itemDTO.setQty(this.qtyOnHand);
        return itemDTO;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", qtyOnHand=").append(qtyOnHand);
        sb.append('}');
        return sb.toString();
    }
}
