package select.course.domain;

public class StudentClass {
    private Integer id;//主键
    private String classNum;//班级号
    private String className;//班级名称
    private Integer department;//系别10是信息11是文法
    private String departmentStr;//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentStr() {
        //系别10是信息11是文法
        if(department==10){
            departmentStr="信息系";
        }else if (department==11){
            departmentStr="文法系";
        }
        return departmentStr;
    }

    public void setDepartmentStr(String departmentStr) {
        this.departmentStr = departmentStr;
    }
}
