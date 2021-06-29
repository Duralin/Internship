package Roma.TestApp.repository;

import Roma.TestApp.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
}
