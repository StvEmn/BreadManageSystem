package yihui.breadmanagersystem.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.entity.Shipment;
import yihui.breadmanagersystem.mapper.ShipmentMapper;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentMapper {
    @Autowired
    ShipmentMapper shipmentMapper;

    // 增
    @Override
    public boolean add(Shipment shipment) {
        return shipmentMapper.add(shipment);
    }

    // 删
    @Override
    public boolean delete(Integer id) {
        return shipmentMapper.delete(id);
    }

    // 改
    @Override
    public boolean update(Shipment shipment) {
        return shipmentMapper.update(shipment);
    }

    @Override
    public List<Shipment> selectById(Integer id) {
        return shipmentMapper.selectById(id);
    }

    @Override
    public List<Shipment>  selectAll() {
        return shipmentMapper.selectAll();
    }

    @Override
    public List<Shipment>  selectByGoods_name(String goods_name) {
        return shipmentMapper.selectByGoods_name(goods_name);
    }

    // 查

}
