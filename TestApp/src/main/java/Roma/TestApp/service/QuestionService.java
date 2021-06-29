package Roma.TestApp.service;

import Roma.TestApp.domain.Question;
import Roma.TestApp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo){
        this.questionRepo = questionRepo;
    }

    public List<Question> findAll(){
        return this.questionRepo.findAll();
    }
}
