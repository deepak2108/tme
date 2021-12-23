package com.example.tme.Service;

import com.example.tme.Entity.Employee;
import com.example.tme.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmpRepository repo;


    @Override
    public void add(Employee e) {
        repo.save(e);

    }

    @Override
    public Employee get(int id) {
        List<Employee> l;
        l=repo.findAll();
        int i=0;
        while(i<l.size())
        {
            if(l.get(i).getEmpid()==id)
                return l.get(i);
        }

        return null;
    }
}
