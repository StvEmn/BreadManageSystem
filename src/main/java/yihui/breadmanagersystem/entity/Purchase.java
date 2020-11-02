package yihui.breadmanagersystem.entity;

import java.sql.Date;

//进货表实实体
public class Purchase {
    private int Id;  //商品id
    private String GoodsName;  //商品名
    private int Quantity;   //商品数量
    private double UnitPrice;  //单价
    private double TotalPrice;  //总价
    private String Specification;   //规格
    private Date ProductionTime;   //生产时间
    private Date PurchaseTime;   //进货时间
    private String Supplier;    //供应商
    private String Address; //地址
    private String Tel; //电话
    private String CertificateNumber;  //合格证号

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

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
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

    public Date getPurchaseTime() {
        return PurchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        PurchaseTime = purchaseTime;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getCertificateNumber() {
        return CertificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        CertificateNumber = certificateNumber;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "Id=" + Id +
                ", GoodsName='" + GoodsName + '\'' +
                ", Quantity=" + Quantity +
                ", UnitPrice=" + UnitPrice +
                ", TotalPrice=" + TotalPrice +
                ", Specification='" + Specification + '\'' +
                ", ProductionTime=" + ProductionTime +
                ", PurchaseTime=" + PurchaseTime +
                ", Supplier='" + Supplier + '\'' +
                ", Address='" + Address + '\'' +
                ", Tel='" + Tel + '\'' +
                ", CertificateNumber='" + CertificateNumber + '\'' +
                '}';
    }
}
