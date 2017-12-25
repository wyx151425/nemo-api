package com.rumofuture.nemo.model.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2016/12/24.
 */

public class User implements Serializable {

    private Integer id;  // 主键

    private String token;

    public interface Register {
    }

    public interface Login {
    }

    @NotBlank(groups = {User.Register.class})
    @Length(min = 2, max = 3)
    private String name;  // 姓名
    @NotBlank(groups = {User.Register.class, User.Login.class})
    @Length(min = 11, max = 11)
    @Pattern(regexp = "((13\\d)|(15\\d)|(17\\d)|(18\\d))\\d{8}")
    private String mobilePhoneNumber;  // 手机号
    @NotBlank(groups = {User.Register.class, User.Login.class})
    @Length(min = 6, max = 32)
    private String password;  // 密码

    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private String email;  // 邮箱
    private String motto;  // 座右铭
    private String profile;  // 简介
    private String profession;  // 职业
    private String location;  // 所在地

    private String gender;  // 性别
    private String birthday;  // 生日

    private Integer age;  // 年龄
    private Integer followTotal;  // 关注作家数
    private Integer followerTotal;  // 粉丝数
    private Integer favoriteTotal; // 收藏漫画册数
    private Integer bookTotal;  // 漫画册数量

    private String avatarUrl;  // 头像
    private String portraitUrl;  // 个人肖像

    private Boolean authorize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getAuthorize() {
        return authorize;
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

    public Integer getFollowTotal() {
        return followTotal;
    }

    public void setFollowTotal(Integer followTotal) {
        this.followTotal = followTotal;
    }

    public Integer getFollowerTotal() {
        return followerTotal;
    }

    public void setFollowerTotal(Integer followerTotal) {
        this.followerTotal = followerTotal;
    }

    public Integer getFavoriteTotal() {
        return favoriteTotal;
    }

    public void setFavoriteTotal(Integer favoriteTotal) {
        this.favoriteTotal = favoriteTotal;
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public Boolean isAuthorize() {
        return authorize;
    }

    public void setAuthorize(Boolean authorize) {
        this.authorize = authorize;
    }
}
