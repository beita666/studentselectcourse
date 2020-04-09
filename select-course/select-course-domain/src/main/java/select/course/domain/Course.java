package select.course.domain;

public class Course {
    private Integer id;//主键
    private String courseNum;//课程号
    private String courseName;//课程名
    private Double credit;//学分
    private Double period;//学时
    private Integer courseType;//课程类型0是考查课1是考试课
    private String courseTypeStr;
    private String term;//学期
    private Integer department;//系别10是信息11是文法
    private String departmentStr;
    private Teacher teacher;
    private StudentRoom studentRoom;
    private TeacherApply teacherApply;
    private Admin admin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentStr() {
        //系别10是信息11是文法
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudentRoom getStudentRoom() {
        return studentRoom;
    }

    public void setStudentRoom(StudentRoom studentRoom) {
        this.studentRoom = studentRoom;
    }

    public TeacherApply getTeacherApply() {
        return teacherApply;
    }

    public void setTeacherApply(TeacherApply teacherApply) {
        this.teacherApply = teacherApply;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
