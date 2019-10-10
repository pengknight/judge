package cn.pengknight.judge.entity;

import java.util.List;

public class QueryResultEntity {
    private int errcode;
    private String errmsg;
    private List<Station> stations;

    public static class Station {
        int stationCode;
        private float score;
        int score1;
        int score2;
        int score3;
        int score4;
        int score5;

        public int getStationCode() {
            return stationCode;
        }

        public void setStationCode(int stationCode) {
            this.stationCode = stationCode;
        }

        public float getScore() {
            return score;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public int getScore1() {
            return score1;
        }

        public void setScore1(int score1) {
            this.score1 = score1;
        }

        public int getScore2() {
            return score2;
        }

        public void setScore2(int score2) {
            this.score2 = score2;
        }

        public int getScore3() {
            return score3;
        }

        public void setScore3(int score3) {
            this.score3 = score3;
        }

        public int getScore4() {
            return score4;
        }

        public void setScore4(int score4) {
            this.score4 = score4;
        }

        public int getScore5() {
            return score5;
        }

        public void setScore5(int score5) {
            this.score5 = score5;
        }
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
