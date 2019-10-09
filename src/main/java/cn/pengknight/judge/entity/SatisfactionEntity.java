package cn.pengknight.judge.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SatisfactionEntity {

    @Id
    @GeneratedValue
    private int id;
    private int station;
    private int score;
    @CreatedDate
    private Date createAt;

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getCreateAt() {
        return createAt;
    }

}
