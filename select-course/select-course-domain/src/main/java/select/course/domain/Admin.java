package select.course.domain;

public class Admin {
    private Integer id;//主键
    private String adminNum;//系管理员号
    private String passWord;//密码
    private String name;//姓名
    private String duty;//职称
    private Integer department;//系别10是信息系11是文法系
    private String departmentStr;//
    private BigAdmin bigAdmin;//院管理号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminNum() {
        return adminNum;
    }

    public void setAdminNum(String adminNum) {
        this.adminNum = adminNum;
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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentStr() {
        //系别10是信息系11是文法系
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

    public BigAdmin getBigAdmin() {
        return bigAdmin;
    }

    public void setBigAdmin(BigAdmin bigAdmin) {
        this.bigAdmin = bigAdmin;
    }
}
