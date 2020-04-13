package select.course.domain;

import java.util.List;

public class SelectCourse {
    private Integer id;//主键
    private String selectNum;//选课号
    private Double score;//成绩
    private String studentNum;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(String selectNum) {
        this.selectNum = selectNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


}
