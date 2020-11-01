package yihui.breadmanagersystem.mapper;

import org.apache.ibatis.annotations.*;
import yihui.breadmanagersystem.entity.Purchase;

import java.util.List;

/*
进货表
 */
@Mapper
public interface PurchaseMapper {
    //增
    @Insert("insert into purchase(goods_name,quantity,unit_price,total_price,specification,production_time,purchase_time,supplier,address,tel,certificate_number) values(#{goods_name},#{quantity},#{unit_price},#{total_price},#{specification},#{production_time},#{purchase_time},#{supplier},#{address},#{tel},#{certificate_number})")
    boolean add(Purchase purchase);

    //删
    @Delete("delete from purchase where id=#{id}")
    boolean delete(Integer id);

    //改
    @Update("update purchase set goods_name=#{goods_name}, quantity=#{quantity}, unit_price=#{unit_price},total_price=#{total_price},specification=#{specification},production_time=#{production_time}, purchase_time=#{production_time}, supplier=#{supplier}, address=#{address}, tel=#{tel},certificate_number=#{certificate_number} where id=#{id}")
    boolean update(Purchase purchase);

    //查(id)
    @Select("select * from purchase where id=#{id}")
    List<Purchase> selectById(Integer id);

    //查询所有
    @Select("select * from purchase")
    List<Purchase> selectAll();
}
