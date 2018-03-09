package com.rumofuture.nemo.model.domain;

import com.rumofuture.nemo.model.entity.NemoEntity;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author 王振琦 2016/12/24
 */
public class User extends NemoEntity {
    /**
     * 注册验证接口
     */
    public interface Register {
    }
    /**
     * 登录验证接口
     */
    public interface Login {
    }

    /**
     * 姓名
     */
    @NotBlank(groups = {User.Register.class})
    @Length(min = 2, max = 3)
    private String name;
    /**
     * 手机号
     */
    @NotBlank(groups = {User.Register.class, User.Login.class})
    @Length(min = 11, max = 11)
    @Pattern(regexp = "((13\\d)|(15\\d)|(17\\d)|(18\\d))\\d{8}")
    private String mobilePhoneNumber;
    /**
     * 密码
     */
    @NotBlank(groups = {User.Register.class, User.Login.class})
    @Length(min = 6, max = 32)
    private String password;
    /**
     * 权限令牌
     */
    private String token;
    /**
     * 状态：0-禁用用户/1-普通用户/2-普通可发布漫画用户
     * private Integer status;
     */
    /**
     * 邮箱
     */
    private String email;
    /**
     * 座右铭
     */
    private String motto;
    /**
     * 简介
     */
    private String profile;
    /**
     * 职业
     */
    private String profession;
    /**
     * 所在地
     */
    private String location;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 关注作家数
     */
    private Integer follow;
    /**
     * 粉丝数
     */
    private Integer follower;
    /**
     * 收藏漫画册数
     */
    private Integer favorite;
    /**
     * 漫画册数量
     */
    private Integer book;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 个人肖像
     */
    private String portrait;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public Integer getBook() {
        return book;
    }

    public void setBook(Integer book) {
        this.book = book;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
