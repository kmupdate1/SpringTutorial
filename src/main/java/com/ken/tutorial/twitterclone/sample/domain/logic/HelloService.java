package com.ken.tutorial.twitterclone.sample.domain.logic;

import com.ken.tutorial.twitterclone.sample.domain.repositories.HelloRepository;
import com.ken.tutorial.twitterclone.sample.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public Employee findOne(Integer employeeId) {
        Employee employee = new Employee();
        Map<String, Object> map = helloRepository.findOne(employeeId);

        employee.setEmployeeId((Integer) map.get("employee_id"));
        employee.setEmployeeName((String) map.get("employee_name"));
        employee.setEmployeeAge((Integer) map.get("employee_age"));

        return employee;
    }
}
/*
変数仮置きした方が良いのか，直接スコープした方がいいのか．
JVMの観点から判断したい．
 */
