package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Optional;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks

    private ProductService ProductService;

    private Product product;


    @BeforeEach
    public void setUp() {
        product = new Product();
        product.seatId(1L);
        prouct.setName("Product 1");
        product.setPrice(100.0);
        product.setQuantity(10);
    }

    @Test
    public void testCreateProduct() {
        when(productRepository.save(any(Product.Class))).thenReturn(product);
        Product savedProduct = ProductService.createProduct(product);
        assertNotNull(savedProduct);
        assertEquals("Product 1", savedProduct.getName());
    }
    @Test
    public void testGetProductNotFound() {
        when(ProductRepository.FindById(1L)).thenReturn(Optional.Empty());
        assertThrows(ProductNotFoundException.class, () -> productService.getProduct(1L));
    }
}
