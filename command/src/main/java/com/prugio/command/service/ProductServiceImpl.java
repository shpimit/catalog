package com.prugio.command.service;

import com.prugio.command.exception.ResourceNotFoundException;
import com.prugio.command.model.Product;
import com.prugio.command.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Optional < Product > productDb = this.productRepository.findById(product.getId());

        if (productDb.isPresent()) {
            Product productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setItemNO(product.getItemNO());
            productUpdate.setDescriptionLoc(product.getDescriptionLoc());
            productUpdate.setMaterialClass(product.getMaterialClass());
            productUpdate.setSpecification(product.getSpecification());
            productUpdate.setBasicUnit(product.getBasicUnit());
            productUpdate.setMakerName(product.getMakerName());
            productUpdate.setModelNO(product.getModelNO());
            productUpdate.setOriginCountry(product.getOriginCountry());
            productUpdate.setHsNO(product.getHsNO());
            productUpdate.setAddUserID(product.getAddUserID());
            productRepository.save(productUpdate);
            return productUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + product.getId());
        }
    }

    @Override
    public List< Product > getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {

        Optional< Product > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }

    @Override
    public void deleteProduct(long productId) {
        Optional < Product > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }
}
