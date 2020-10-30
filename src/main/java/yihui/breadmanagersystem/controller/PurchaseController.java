package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.entity.Purchase;
import yihui.breadmanagersystem.service.PurchaseService;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

//进货
@RestController
public class PurchaseController {
    final
    PurchaseService service;

    public PurchaseController(PurchaseService service) {
        this.service = service;
    }

    //查询所有进货信息
    @GetMapping("/purchase/allInfo")
    private List<Purchase> purchaseList() {
        return service.findAll();
    }

    //根据id查询
    @GetMapping("/purchase/id/{id}")
    public List<Purchase> findById(@PathVariable("id") int id) {
        return service.findAllById(id);
    }

    //根据goods_name查询
    @GetMapping("/purchase/name/{name}")
    public List<Purchase> findById(@PathVariable("name") String goods_name) {
        return service.findAllByGoods_name(goods_name);
    }

    //添加进货商品信息
    @PostMapping("/purchase/add")
    public int addUser(@RequestParam("goods_name") String goods_name,
                       @RequestParam("quantity") int quantity,
                       @RequestParam("unit_price") BigDecimal unit_price,
                       @RequestParam("total_price") BigDecimal total_price,
                       @RequestParam("specification") String specification,
                       @RequestParam("production_time") Date production_time,
                       @RequestParam("purchase_time") Date purchase_time,
                       @RequestParam("supplier") String supplier,
                       @RequestParam("address") String address,
                       @RequestParam("tel") String tel,
                       @RequestParam("certificate_number") String certificate_number) {
        return service.Add(goods_name, quantity, unit_price, total_price,
                specification, production_time, purchase_time,
                supplier, address, tel, certificate_number);
    }

    //更新商品信息
    @PostMapping("/purchase/modify")
    public int modify(@RequestParam("id") int id,
                      @RequestParam("goods_name") String goods_name,
                      @RequestParam("quantity") int quantity,
                      @RequestParam("unit_price") BigDecimal unit_price,
                      @RequestParam("total_price") BigDecimal total_price,
                      @RequestParam("specification") String specification,
                      @RequestParam("production_time") Date production_time,
                      @RequestParam("purchase_time") Date purchase_time,
                      @RequestParam("supplier") String supplier,
                      @RequestParam("address") String address,
                      @RequestParam("tel") String tel,
                      @RequestParam("certificate_number") String certificate_number) {
        return service.modify(id, goods_name, quantity, unit_price, total_price,
                specification, production_time, purchase_time,
                supplier, address, tel, certificate_number);
    }


    //删除进货商品信息
    @DeleteMapping(value = "/purchase/delete/{id}")
    public void deleteByUsername(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
