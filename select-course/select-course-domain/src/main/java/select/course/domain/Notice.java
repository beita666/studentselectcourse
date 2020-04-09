package select.course.domain;

import select.course.utils.DateUtils;

import java.util.Date;

public class Notice {
    private Integer id;//主键
    private String noticeNum;//发布号
    private String content;//内容
    private Date notime;//时间
    private String notimeStr;
    private String name;//发布人的单位
    private Admin admin;//


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(String noticeNum) {
        this.noticeNum = noticeNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getNotime() {
        return notime;
    }

    public void setNotime(Date notime) {
        this.notime = notime;
    }

    public String getNotimeStr() {
        if (notime!=null){
           notimeStr= DateUtils.dateToString(notime,"yyyy-MM-dd HH:mm");
        }
        return notimeStr;
    }

    public void setNotimeStr(String notimeStr) {
        this.notimeStr = notimeStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
