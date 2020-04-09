package select.course.domain;

import select.course.utils.DateUtils;

import java.util.Date;

public class Student {
    private Integer id;//主键
    private String studentNum;//学号
    private String password;//密码
    private String name;//姓名
    private Integer sex;//状态0是男1是女
    private String sexStr;
    private Integer department;//状态10是信息系11是文法系
    private String departmentStr;
    private Integer profession;//状态20是计算计科学与技术专业30是汉语言专业
    private String professionStr;
    private Date enterTime;//入学时间
    private String enterTimeStr;
    private Integer type;//0是普通学生1是学生会
    private String typeStr;
    private String phoneNumber;//电话号
    private StudentClass studentClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        //状态0是男1是女
        if(sex==0){
            sexStr="男";
        }else if(sex==1){
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
        //状态10是信息系11是文法系
        if(department==10){
            departmentStr="信息系";
        }else if(department==11){
            departmentStr="文法系";
        }
        return departmentStr;
    }

    public void setDepartmentStr(String departmentStr) {
        this.departmentStr = departmentStr;
    }

    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    public String getProfessionStr() {
        //状态20是计算计科学与技术专业30是汉语言专业
        if(profession==20){
            professionStr="计算机科学与技术";
        }else if(profession==30){
            professionStr="汉语言";
        }
        return professionStr;
    }

    public void setProfessionStr(String professionStr) {
        this.professionStr = professionStr;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public String getEnterTimeStr() {
        if(enterTime!=null){
            enterTimeStr=DateUtils.dateToString(enterTime,"yyyy-MM-dd HH:mm");
        }
        return enterTimeStr;
    }

    public void setEnterTimeStr(String enterTimeStr) {
        this.enterTimeStr = enterTimeStr;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeStr() {
        //0是普通学生1是学生会
        if(type==0){
            typeStr="普通";
        }else if(type==1){
            typeStr="学生会";
        }
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
}
