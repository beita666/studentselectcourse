package select.course.domain;

public class Teacher {
    private Integer id;//主键
    private String teacherNum;//教师号
    private String passWord;//密码
    private String name;//姓名
    private Integer sex;//性别0是男1是女
    private String sexStr;//
    private Integer department;//系别10是信息系11是文法系
    private String departmentStr;
    private Integer jobTitle;//职称0是10是教授11是副教授12是老师
    private String jobTitleStr;
    private String phoneNumber;//手机号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSexStr() {
        //性别0是男1是女
        if(sex==0){
            sexStr="男";
        }else if (sex==1){
            sexStr="女";
        }
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
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

    public Integer getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Integer jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitleStr() {
        //职称10是教授11是副教授12是老师
        if (jobTitle==10){
            jobTitleStr="教授";
        }else if (jobTitle==11){
            jobTitleStr="副教授";
        }else if (jobTitle==12){
            jobTitleStr="老师";
        }
        return jobTitleStr;
    }

    public void setJobTitleStr(String jobTitleStr) {
        this.jobTitleStr = jobTitleStr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
