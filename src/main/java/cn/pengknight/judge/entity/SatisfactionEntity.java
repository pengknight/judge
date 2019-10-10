package cn.pengknight.judge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class SatisfactionEntity {

    @Id
    @GeneratedValue
    private int id;
    private int station;
    private float score;
    @CreatedDate
    private long createAt;

    public int getId() {
        return id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getCreateAt() {
        return createAt;
    }

    public int getStation() {
        return station;
    }
}
