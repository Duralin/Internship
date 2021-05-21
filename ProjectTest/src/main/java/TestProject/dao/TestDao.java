package TestProject.dao;

import TestProject.Models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Test> showQuestions(){
        return jdbcTemplate.query("select * from tests", new Mapper());
    }
}
