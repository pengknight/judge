package cn.pengknight.judge.controller;


import cn.pengknight.judge.entity.MyResponseEntity;
import cn.pengknight.judge.entity.QueryResultEntity;
import cn.pengknight.judge.entity.SatisfactionEntity;
import cn.pengknight.judge.entity.ScoreEntity;
import cn.pengknight.judge.repository.SatisfactionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SatisfactionController {

    @Resource
    SatisfactionRepository satisfactionRepository;

    @PostMapping("/judge")
    public MyResponseEntity judge(@RequestBody SatisfactionEntity satisfactionEntity){
        MyResponseEntity myResponseEntity=new MyResponseEntity();
        //检查数据是否合法
        if (satisfactionEntity!=null){
            satisfactionRepository.save(satisfactionEntity);
            myResponseEntity.setErrcode(0);
            myResponseEntity.setErrmsg("ok");
        }else {
            myResponseEntity.setErrcode(1);
            myResponseEntity.setErrmsg("error");
        }
        return myResponseEntity;
    }

    @GetMapping("/getScore")
    public ScoreEntity getScore(){
        ScoreEntity score=new ScoreEntity();
        int all_score=0;
        List<SatisfactionEntity> all = satisfactionRepository.findAll();
        for (SatisfactionEntity entity : all) {
            all_score+=entity.getScore();
        }
        score.setScore((float)all_score/all.size());
        return score;
    }

    @GetMapping("/getQuery")
    public QueryResultEntity getQuery(){
        QueryResultEntity queryResultEntity=new QueryResultEntity();
        List<SatisfactionEntity> all = satisfactionRepository.findAll();
        float all_score=0;
        int score1=0;
        int score2=0;
        int score3=0;
        int score4=0;
        int score5=0;
        for (SatisfactionEntity entity : all) {
            float score = entity.getScore();
            all_score+=score;
            int i=(int) (score+0.5);
            switch (i){
                case 1:
                    score1++;
                    break;
                case 2:
                    score2++;
                    break;
                case 3:
                    score3++;
                    break;
                case 4:
                    score4++;
                    break;
                case 5:
                    score5++;
                    break;
                default:
            }
        }
        QueryResultEntity.Station station=new QueryResultEntity.Station();
        station.setStationCode(1);
        station.setScore(all_score /all.size());
        station.setScore1(score1);
        station.setScore2(score2);
        station.setScore3(score3);
        station.setScore4(score4);
        station.setScore5(score5);
        List<QueryResultEntity.Station> stations=new ArrayList<>();
        stations.add(station);
        queryResultEntity.setStations(stations);
        return queryResultEntity;
    }
}