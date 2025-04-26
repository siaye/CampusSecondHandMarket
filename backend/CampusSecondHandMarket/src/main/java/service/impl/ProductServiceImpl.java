package service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Product;
import mapper.ProductMapper;
import service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}