package dev.practice.order.view.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping(value = "/view/v1/items/all")
    public String main() {
        return "order/items/all";
    }

    @GetMapping(value = "/view/v1/items/{itemToken}")
    public String main(@PathVariable("itemToken") String itemToken) {
        return "order/items/item-token";
    }
}