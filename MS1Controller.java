package soa.controller;
import soa.service.MS1Service;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/ms1")
public class MS1Controller {
    private final MS1Service service;
    public MS1Controller(MS1Service service) {
        this.service = service;
    }
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS1 - Addition = " + service.add(a, b);
    }
}
