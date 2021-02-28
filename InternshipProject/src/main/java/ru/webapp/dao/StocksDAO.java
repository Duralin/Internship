package ru.webapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.webapp.Models.Stock;

import java.util.List;

@Component
public class StocksDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StocksDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Stock> showStocks() {
        return jdbcTemplate.query("SELECT * FROM stocks", new BeanPropertyRowMapper<>(Stock.class));
    }

    public Stock show(String company) {
        return jdbcTemplate.query("SELECT * FROM stocks WHERE company=?", new Object[]{company}, new BeanPropertyRowMapper<>(Stock.class))
                .stream().findAny().orElse(null);
    }

    public void save(Stock stock) {
        jdbcTemplate.update("INSERT INTO stocks VALUES( ?, ?, ?)", stock.getDate(), stock.getCompany(),
                stock.getPrice());
    }

    public void update(String name, Stock stock) {
        jdbcTemplate.update("UPDATE stocks SET date=?, company=?, price=? WHERE company=?", stock.getDate(),
                stock.getCompany(), stock.getPrice(), name);
    }

    public void delete(String company) {
        jdbcTemplate.update("DELETE FROM stocks WHERE company=?", company);
    }
}