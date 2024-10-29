package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductNotFoundException;
import com.example.demo.service.ProductService;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    private Product product;


    @BeforeEach
    public void setUp() {
        product = new Product();
        product.setId(1L);
        product.setName("Product 1");
        product.setPrice(100.0);
        product.setQuantity(10);
    }

    @Test
    public void testCreateProduct() {
        when(productRepository.save(any(Product.class))).thenReturn(product);
        Product savedProduct = productService.createProduct(product);
        assertNotNull(savedProduct);
        assertEquals("Product 1", savedProduct.getName());
    }
    @Test
    public void testGetProductNotFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(ProductNotFoundException.class, () -> productService.getProduct(1L));
    }
}
