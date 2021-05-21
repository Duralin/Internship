package TestProject.controller;

import TestProject.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    private TestDao testDao;
    @Autowired
    public TestController(TestDao testDao){
        this.testDao = testDao;
    }
    @GetMapping("Homepage")
    public String mainTestController(Model model){
        model.addAttribute("tests", testDao.showQuestions());
        return "test/Homepage";
    }
}
