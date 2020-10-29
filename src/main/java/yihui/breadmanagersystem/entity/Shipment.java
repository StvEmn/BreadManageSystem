package yihui.breadmanagersystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

// 出货表
@Entity
public class Shipment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;                 //商品id
    private String goods_name;      //商品名
    private int quantity;           //数量
    private BigDecimal unit_price;  //单价
    private BigDecimal total_price;  //总价
    private String specification;   //规格
    private Date production_time;   //生产时间
    private Date delivery_time;     //出货时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public BigDecimal getTotal_price() {
        return total_price;
    }

    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getProduction_time() {
        return production_time;
    }

    public void setProduction_time(Date production_time) {
        this.production_time = production_time;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }
}
