package yihui.breadmanagersystem.mapper;

import org.apache.ibatis.annotations.*;
import yihui.breadmanagersystem.entity.Shipment;

import java.util.List;

@Mapper
public interface ShipmentMapper {
    //增
    @Insert("insert into shipment(goods_name,quantity,unit_price,total_price,specification,production_time,delivery_time) values(#{goods_name},#{quantity},#{unit_price},#{total_price},#{specification},#{production_time},#{delivery_time})")
    boolean add(Shipment shipment);

    //删
    @Delete("delete from shipment where id=#{id}")
    boolean delete(Integer id);

    //改
    @Update("update shipment set goods_name=#{goods_name}, quantity=#{quantity}, unit_price=#{unit_price},total_price=#{total_price},specification=#{specification},production_time=#{production_time}, delivery_time=#{delivery_time} where id=#{id}")
    boolean update(Shipment shipment);

    //查
    @Select("select * from shipment where id=#{id}")
    List<Shipment> selectById(Integer id);

    //查(所有)
    @Select("select * from shipment")
    List<Shipment>  selectAll();

    //查(byGoods-NAME)
    @Select("select * from shipment where goods_name=#{goods_name}")
    List<Shipment>  selectByGoods_name(String goods_name);
}
