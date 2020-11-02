package yihui.breadmanagersystem.entity;

import java.sql.Date;

public class Shipment {
    private int Id;                 //商品id
    private String GoodsName;      //商品名
    private int Quantity;           //数量
    private double Unitprice;  //单价
    private double TotalPrice;  //总价
    private String Specification;   //规格
    private Date ProductionTime;   //生产时间
    private Date DeliveryTime;     //出货时间

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getUnitprice() {
        return Unitprice;
    }

    public void setUnitprice(double unitprice) {
        Unitprice = unitprice;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public Date getProductionTime() {
        return ProductionTime;
    }

    public void setProductionTime(Date productionTime) {
        ProductionTime = productionTime;
    }

    public Date getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        DeliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "Id=" + Id +
                ", GoodsName='" + GoodsName + '\'' +
                ", Quantity=" + Quantity +
                ", Unitprice=" + Unitprice +
                ", TotalPrice=" + TotalPrice +
                ", Specification='" + Specification + '\'' +
                ", ProductionTime=" + ProductionTime +
                ", DeliveryTime=" + DeliveryTime +
                '}';
    }
}
