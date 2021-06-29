package Roma.TestApp.domain;

import javax.persistence.*;

@Entity
@Table(name = "quest")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quest_id;

    private String quest;
    private String answer;
    private String wronganswer1;
    private String wronganswer2;
    private String wronganswer3;
    public Question() {
    }

    public Question(String quest, String answer, String wronganswer1, String wronganswer2, String wronganswer3) {
        this.quest = quest;
        this.answer = answer;
        this.wronganswer1 = wronganswer1;
        this.wronganswer2 = wronganswer2;
        this.wronganswer3 = wronganswer3;
    }

    public long getQuest_id() {
        return quest_id;
    }

    public void setQuest_id(long quest_id) {
        this.quest_id = quest_id;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getWronganswer1() {
        return wronganswer1;
    }

    public void setWronganswer1(String wronganswer1) {
        this.wronganswer1 = wronganswer1;
    }

    public String getWronganswer2() {
        return wronganswer2;
    }

    public void setWronganswer2(String wronganswer2) {
        this.wronganswer2 = wronganswer2;
    }

    public String getWronganswer3() {
        return wronganswer3;
    }

    public void setWronganswer3(String wronganswer3) {
        this.wronganswer3 = wronganswer3;
    }

}
