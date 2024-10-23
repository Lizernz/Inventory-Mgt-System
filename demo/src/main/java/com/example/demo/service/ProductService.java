package com.example.demo.service;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product createProduct(product product) {
        return productRepository.save(product);
    }

}

    public Product getProduct(Long id) {
        return ProductRepository.findById().orElseThrow(() -> new ProductNotFoundException("product not found with id: " + id));

    }

    public Product UpdateProduct(Long id, ProductDetails) {
        Product Product = getProduct(id);
        product.setName(productDetails.getName());
        product.getPrice(productDetails.getPrice())
        product.getQuantity(productDetails.getQuantity);
    }

    public void deleteProduct (Lond id) {
        Product product = getProduct(id);
        productRepository.delete(product);
    }

    public List<Product> getAllProducts() {
        return productREpository.findAll();
    }
