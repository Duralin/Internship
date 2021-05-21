package TestProject.Models;

public class Test {
    private String question;
    private String typeOfTest;
    private String questNumber;

    private String answer;

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestNumber(String questNumber) {
        this.questNumber = questNumber;
    }

    public void setTypeOfTest(String typeOfTest) {
        this.typeOfTest = typeOfTest;
    }


    public String getQuestion() {
        return question;
    }

    public String getQuestNumber() {
        return questNumber;
    }

    public String getTypeOfTest() {
        return typeOfTest;
    }

    public String getAnswer() {
        return answer;
    }
}
