package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.Impl.PurchaseServiceImpl;
import yihui.breadmanagersystem.entity.Purchase;

import java.util.List;

//进货
@RestController
public class PurchaseController {
    @Autowired
    PurchaseServiceImpl purchaseService;

    //查询所有进货信息
    @GetMapping("/purchase/allInfo")
    public List<Purchase> select() {
        return purchaseService.selectAll();
    }

    //根据id查询
    @GetMapping("/purchase/id/{id}")
    public List<Purchase> selectById(@PathVariable("id") Integer id) {
        return purchaseService.selectById(id);
    }
    //根据goods_name查询


    //添加进货商品信息
    @PostMapping("/purchase/add")
    public boolean add(Purchase purchase) {
        return purchaseService.add(purchase);
    }

    //更新商品信息
    @PostMapping("/purchase/modify")
    public boolean update(Purchase purchase) {
        return purchaseService.update(purchase);
    }


    //删除进货商品信息
    @DeleteMapping(value = "/purchase/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return purchaseService.delete(id);
    }
}
