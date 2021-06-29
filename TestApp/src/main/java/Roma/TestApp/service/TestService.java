package Roma.TestApp.service;

import Roma.TestApp.domain.Test;
import Roma.TestApp.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private TestRepo testRepo;

    @Autowired
    public TestService(TestRepo testRepository) {
        this.testRepo = testRepository;
    }

    public List<Test> findAll() {
        return this.testRepo.findAll();
    }
}
