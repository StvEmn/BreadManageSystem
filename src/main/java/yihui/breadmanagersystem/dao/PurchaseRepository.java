package yihui.breadmanagersystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yihui.breadmanagersystem.entity.Purchase;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

//进货查询接口
@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    // =================================查询===================================
    //查询所有进货信息
    @Query(value = "select * from Purchase p", nativeQuery = true)
    public List<Purchase> findAll();

    //通过商品id查询
    @Query(value = "select * from Purchase p where p.id= :id", nativeQuery = true)
    public List<Purchase> findAllById(int id);

    // 通过商品名称查询
    @Query(value = "select * from Purchase p where p.goods_name= :goods_name", nativeQuery = true)
    public List<Purchase> findAllByGoods_name(String goods_name);
    // =================================查询===================================


    // =================================添加===================================
    @Query(value = "insert into pruchase(goods_name,quantity,unit_price,total_price,specification,production_time,purchase_time,supplier,address,tel,certificate_number) value(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)", nativeQuery = true)
    public int Add(String goods_name, int quantity, BigDecimal unit_price, BigDecimal total_price, String specification, Date production_time, Date purchase_time, String supplier, String address, String tel, String certificate_number);
    // =================================添加===================================


    // =================================更新===================================


    // =================================更新===================================


    // =================================删除===================================

    // =================================删除===================================


}
