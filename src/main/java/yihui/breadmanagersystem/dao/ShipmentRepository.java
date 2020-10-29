package yihui.breadmanagersystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yihui.breadmanagersystem.entity.Purchase;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
//出货查询接口
@Repository
public interface ShipmentRepository extends JpaRepository<Purchase, Integer> {
    // =================================查询===================================
    //查询所有进货信息
    @Query(value = "select * from Shipment s", nativeQuery = true)
    public List<Purchase> findAll();

    //通过商品id查询
    @Query(value = "select * from Shipment s where p.id= :id", nativeQuery = true)
    public List<Purchase> findAllById(int id);

    // 通过商品名称查询
    @Query(value = "select * from Shipment s where p.goods_name= :goods_name", nativeQuery = true)
    public List<Purchase> findAllByGoods_name(String goods_name);
    // =================================查询===================================


    // =================================添加===================================
    @Query(value = "insert into Shipment(goods_name,quantity,unit_price,total_price,specification,production_time,delivery_time) value(?1,?2,?3,?4,?5,?6,?7)", nativeQuery = true)
    public int Add(String goods_name, int quantity,
                   BigDecimal unit_price, BigDecimal total_price,
                   String specification, Date production_time,
                   Date delivery_time);
    // =================================添加===================================


    // =================================更新===================================
    @Query(value = "update Shipment set goods_name=?2,quantity=?3,unit_price=?4,total_price=?5,specification=?6,production_time=?7,delivery_time=?8 where id=?1", nativeQuery = true)
    public int modify(int id,String goods_name,
                      int quantity, BigDecimal unit_price,
                      BigDecimal total_price, String specification,
                      Date production_time, Date delivery_time);

    // =================================更新===================================

    // =================================删除===================================
    @Query(value = "delete from Shipment s where s.id= :id")
    public int deleteById(int id);
    // =================================删除===================================
}
