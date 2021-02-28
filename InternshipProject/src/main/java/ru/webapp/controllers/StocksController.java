package ru.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.webapp.Models.Stock;
import ru.webapp.dao.StocksDAO;

@Controller
@RequestMapping("/stocks")
public class StocksController {
    private StocksDAO stocksDAO;

    @Autowired
    public StocksController(StocksDAO stocksDAO) {
        this.stocksDAO = stocksDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("stocks", stocksDAO.showStocks());
        return "stocks/index";
    }

    @GetMapping("/new")
    public String newStock(Model model) {
        model.addAttribute("stock", new Stock());
        return "stocks/new";
    }

    @PostMapping()
    public String addStock(@ModelAttribute("stock") Stock stock) {
        stocksDAO.save(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/stock/{company}")
    public String edit(@PathVariable("company") String company, Model model) {
        model.addAttribute("stock", stocksDAO.show(company));
        return "stocks/stock";
    }

    @PatchMapping("/edit/{company}")
    public String update(@ModelAttribute("stock") Stock stock, @PathVariable("company") String company) {
        stocksDAO.update(company, stock);
        return "redirect:/stocks";
    }

    @DeleteMapping("/delete/{company}")
    public String delete(@PathVariable("company") String company) {
        stocksDAO.delete(company);
        return "redirect:/stocks";
    }
}