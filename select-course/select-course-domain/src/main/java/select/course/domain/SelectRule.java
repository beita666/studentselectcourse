package select.course.domain;

import java.util.Date;

public class SelectRule {
    private Integer id;//主键
    private String ruleNum;//规则号
    private Date startTime;//开始时间
    private String startTimeStr;
    private Date endTime;//结束时间

    private Integer peopleConstraint;//人数约束
    private Integer timeConstraint;//时间约束
    private Admin admin;
}
