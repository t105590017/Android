package tw.edu.ntut.csie.app01_105590017;

public class Method {

    public String letterGrade(int score){
        String s = "等第:";

        if (score > 100 || score < 0) s+="輸入分數應介於[0..100]";
        else if (score >= 90 && score <= 100) s+="A";
        else if (score >= 80 && score <= 89) s+="B";
        else if (score >= 70 && score <= 79) s+="C";
        else if (score >= 60 && score <= 69) s+="D";
        else if (score >= 0 && score <= 59) s+="F";
        return s;
    }
}
