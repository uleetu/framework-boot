package org.ko.prototype.data.master.domain;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_user")
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.nick_name
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.birthday
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.wechat_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String wechatId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.qq_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String qqId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.weibo_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String weiboId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.sina
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private String sina;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.role_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.money_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Long moneyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.del_status
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Short delStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Long createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.update_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Long updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.update_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.nick_name
     *
     * @return the value of t_user.nick_name
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.nick_name
     *
     * @param nickName the value for t_user.nick_name
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.birthday
     *
     * @return the value of t_user.birthday
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.birthday
     *
     * @param birthday the value for t_user.birthday
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.wechat_id
     *
     * @return the value of t_user.wechat_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.wechat_id
     *
     * @param wechatId the value for t_user.wechat_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.qq_id
     *
     * @return the value of t_user.qq_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getQqId() {
        return qqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.qq_id
     *
     * @param qqId the value for t_user.qq_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setQqId(String qqId) {
        this.qqId = qqId == null ? null : qqId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.weibo_id
     *
     * @return the value of t_user.weibo_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getWeiboId() {
        return weiboId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.weibo_id
     *
     * @param weiboId the value for t_user.weibo_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId == null ? null : weiboId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.sina
     *
     * @return the value of t_user.sina
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public String getSina() {
        return sina;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.sina
     *
     * @param sina the value for t_user.sina
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setSina(String sina) {
        this.sina = sina == null ? null : sina.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.role_id
     *
     * @return the value of t_user.role_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.role_id
     *
     * @param roleId the value for t_user.role_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.money_id
     *
     * @return the value of t_user.money_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Long getMoneyId() {
        return moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.money_id
     *
     * @param moneyId the value for t_user.money_id
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setMoneyId(Long moneyId) {
        this.moneyId = moneyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.del_status
     *
     * @return the value of t_user.del_status
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Short getDelStatus() {
        return delStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.del_status
     *
     * @param delStatus the value for t_user.del_status
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setDelStatus(Short delStatus) {
        this.delStatus = delStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_user
     *
     * @return the value of t_user.create_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_user
     *
     * @param createUser the value for t_user.create_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_date
     *
     * @return the value of t_user.create_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_date
     *
     * @param createDate the value for t_user.create_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.update_user
     *
     * @return the value of t_user.update_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.update_user
     *
     * @param updateUser the value for t_user.update_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.update_date
     *
     * @return the value of t_user.update_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.update_date
     *
     * @param updateDate the value for t_user.update_date
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", age=").append(age);
        sb.append(", birthday=").append(birthday);
        sb.append(", email=").append(email);
        sb.append(", wechatId=").append(wechatId);
        sb.append(", qqId=").append(qqId);
        sb.append(", weiboId=").append(weiboId);
        sb.append(", sina=").append(sina);
        sb.append(", roleId=").append(roleId);
        sb.append(", moneyId=").append(moneyId);
        sb.append(", delStatus=").append(delStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getWechatId() == null ? other.getWechatId() == null : this.getWechatId().equals(other.getWechatId()))
            && (this.getQqId() == null ? other.getQqId() == null : this.getQqId().equals(other.getQqId()))
            && (this.getWeiboId() == null ? other.getWeiboId() == null : this.getWeiboId().equals(other.getWeiboId()))
            && (this.getSina() == null ? other.getSina() == null : this.getSina().equals(other.getSina()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMoneyId() == null ? other.getMoneyId() == null : this.getMoneyId().equals(other.getMoneyId()))
            && (this.getDelStatus() == null ? other.getDelStatus() == null : this.getDelStatus().equals(other.getDelStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Mon Apr 08 22:49:35 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getWechatId() == null) ? 0 : getWechatId().hashCode());
        result = prime * result + ((getQqId() == null) ? 0 : getQqId().hashCode());
        result = prime * result + ((getWeiboId() == null) ? 0 : getWeiboId().hashCode());
        result = prime * result + ((getSina() == null) ? 0 : getSina().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMoneyId() == null) ? 0 : getMoneyId().hashCode());
        result = prime * result + ((getDelStatus() == null) ? 0 : getDelStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}