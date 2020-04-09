package com.ken.tutorial.twitterclone.domain.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class HelloRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findOne(Integer employeeId) {
        String query = "SELECT" +
                "employee_id" +
                "employee_name" +
                "employee_age" +
                "FROM employee" +
                "WHERE employee_id=?";

        return jdbcTemplate.queryForMap(query, employeeId);
    }
}
