package br.com.emmanuelneri;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Map<Long, String> PRODUCTS = ImmutableMap.of(
            1L, "Product 1",
            2L, "Product 2",
            3L, "Product 3",
            4L, "Product 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(PRODUCTS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return PRODUCTS.get(id);
    }

}
