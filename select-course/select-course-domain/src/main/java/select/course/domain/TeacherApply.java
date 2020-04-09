package select.course.domain;

public class TeacherApply {
    private Integer id;//主键
    private String applyNum;//申请号
    private String courseName;//课程名称
    private String introduct;//简介
    private Double credit;//学分
    private Double period;//学时
    private Integer department;//系别10是信息系11是文法系
    private String departmentStr;
    private Integer courseType;//课程类型0是考查课1是考试课
    private String courseTypeStr;
    private Integer typeNum;//状态号，，，，
    private String  typeNumStr;
    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIntroduct() {
        return introduct;
    }

    public void setIntroduct(String introduct) {
        this.introduct = introduct;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getPeriod() {
        return period;
    }

    public void setPeriod(Double period) {
        this.period = period;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentStr() {
        //系别10是信息系11是文法系
        if (department==10){
            departmentStr="信息系";
        }else if (department==11){
            departmentStr="文法系";
        }
        return departmentStr;
    }

    public void setDepartmentStr(String departmentStr) {
        this.departmentStr = departmentStr;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getCourseTypeStr() {
        //课程类型0是考查课1是考试课
        if (courseType==0){
            courseTypeStr="考查课";
        }else if (courseType==1){
            courseTypeStr="考试课";
        }
        return courseTypeStr;
    }

    public void setCourseTypeStr(String courseTypeStr) {
        this.courseTypeStr = courseTypeStr;
    }

    public Integer getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(Integer typeNum) {
        this.typeNum = typeNum;
    }

    public String getTypeNumStr() {
        return typeNumStr;
    }

    public void setTypeNumStr(String typeNumStr) {
        this.typeNumStr = typeNumStr;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
