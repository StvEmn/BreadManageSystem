package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.Impl.ShipmentServiceImpl;
import yihui.breadmanagersystem.entity.Shipment;

import java.util.List;

//出货
@RestController
public class ShipmentController {
    @Autowired
    ShipmentServiceImpl service;

    //查询所有进货信息
    @GetMapping("/shipment/all")
    private List<Shipment> purchaseList() {
        return service.selectAll();
    }

    //根据id查询
    @GetMapping("/shipment?id={id}")
    public List<Shipment> findById(@PathVariable("id") int id) {
        return service.selectById(id);
    }

    //根据goods_name查询
    @GetMapping("/shipment?GoodsName={GoodsName}")
    public List<Shipment> findById(@PathVariable("GoodsName") String GoodsName) {
        return service.selectByGoods_name(GoodsName);
    }

    //添加进货商品信息
    @PostMapping("/shipment/add")
    public boolean addUser(Shipment shipment) {
        return service.add(shipment);
    }

    //更新商品信息
    @PostMapping("/shipment/modify")
    public boolean modify(Shipment shipment) {
        return service.update(shipment);
    }


    //删除进货商品信息
    @DeleteMapping(value = "/shipment/delete?id={id}")
    public void deleteByUsername(@PathVariable("id") Integer id) {
        service.selectById(id);
    }
}
