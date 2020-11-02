package yihui.breadmanagersystem.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.entity.Purchase;
import yihui.breadmanagersystem.mapper.PurchaseMapper;

import javax.transaction.Transactional;
import java.util.List;

//进货商品信息
@Transactional
@Service
public class PurchaseServiceImpl implements PurchaseMapper {
    @Autowired
    PurchaseMapper purchaseMapper;

    // 增
    @Override
    public boolean add(Purchase purchase) {
        return purchaseMapper.add(purchase);
    }

    // 删
    @Override
    public boolean delete(Integer id) {
        return purchaseMapper.delete(id);
    }

    // 改
    @Override
    public boolean update(Purchase purchase) {
        return purchaseMapper.update(purchase);
    }

    @Override
    public List<Purchase> selectById(Integer id) {
        return purchaseMapper.selectById(id);
    }

    @Override
    public List<Purchase> selectAll() {
        System.out.println("Impl"+purchaseMapper.selectAll());
        return purchaseMapper.selectAll();
    }
}
