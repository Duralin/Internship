package TestProject.dao;

import TestProject.Models.Test;
import TestProject.Models.TestOption;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mapper implements RowMapper<Test>{
    @Override
        public Test mapRow(ResultSet rs, int rownum) throws SQLException{
        Test test = new Test();
        test.setQuestion("question");
        test.setQuestNumber("id");
        test.setAnswer("Answer");
        return test;
    }
}
