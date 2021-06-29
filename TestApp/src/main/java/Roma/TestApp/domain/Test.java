package Roma.TestApp.domain;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int testId;
    private String titleTest;

    public Test(int id_test, String titleTest) {
        this.testId = id_test;
        this.titleTest = titleTest;
    }

    public Test() {
    }

    public int getId_test() {
        return testId;
    }

    public void setId_test(int id_test) {
        this.testId = id_test;
    }

    public String getTitleTest() {
        return titleTest;
    }

    public void setTitleTest(String titleTest) {
        this.titleTest = titleTest;
    }
}