package dev.practice.order.view.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String main() {
        return "order/items/all";
    }

    @GetMapping(value = "/view/v1/items/all")
    public String orderItemsAll() {
        return "order/items/all";
    }

    @GetMapping(value = "/view/v1/items/{itemToken}")
    public String orderItemsItemtoken(@PathVariable("itemToken") String itemToken) {
        return "order/items/item-token";
    }
}