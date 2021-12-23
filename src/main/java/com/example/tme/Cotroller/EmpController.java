package com.example.tme.Cotroller;

import com.example.tme.Entity.Employee;
import com.example.tme.Service.EmpService;
import com.example.tme.Service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {
    @Autowired
    EmpServiceImpl service1;

    @PostMapping("/add")
    public void addddetailssss(@RequestBody Employee e)
    {
        service1.add(e);
    }

    @GetMapping("/get/{id}")
    public Employee getdetailsssss(@PathVariable Integer id)
    {
        return service1.get(id);
    }
}
