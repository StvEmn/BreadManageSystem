package yihui.breadmanagersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.dao.ShipmentRepository;
import yihui.breadmanagersystem.entity.Purchase;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Transactional
@Service
public class ShipmentService {
    @Autowired
    private ShipmentRepository repository;

    // 查询所有进货商品信息
    public List<Purchase> findAll() {
        return repository.findAll();
    }

    //通过id查询
    public List<Purchase> findAllById(int id) {
        return repository.findAllById(id);
    }

    //通过商品名称查询
    public List<Purchase> findAllByGoods_name(String goods_name) {
        return repository.findAllByGoods_name(goods_name);
    }

    //添加进货商品信息
    public int Add(String goods_name, int quantity, BigDecimal unit_price, BigDecimal total_price,
                   String specification, Date production_time, Date delivery_time) {
        return repository.Add(goods_name, quantity, unit_price, total_price,
                specification, production_time, delivery_time);
    }

    //更新进货商品信息
    public int modify(int id, String goods_name, int quantity, BigDecimal unit_price, BigDecimal total_price,
                      String specification, Date production_time, Date delivery_time) {
        return repository.modify(id, goods_name, quantity, unit_price, total_price,
                specification, production_time, delivery_time);
    }

    //删除进货商品信息
    public int deleteById(int id) {
        return repository.deleteById(id);
    }

}
