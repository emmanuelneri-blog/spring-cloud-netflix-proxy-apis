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
@RequestMapping("/customers")
public class CustomerController {

    private static final Map<Long, String> CUSTOMERS = ImmutableMap.of(
            1L, "Customer 1",
            2L, "Customer 2",
            3L, "Customer 3",
            4L, "Customer 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(CUSTOMERS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return CUSTOMERS.get(id);
    }

}
