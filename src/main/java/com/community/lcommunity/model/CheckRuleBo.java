package com.community.lcommunity.model;

import java.util.List;

public class CheckRuleBo {

    private String id;
    private String checkRuleKey;
    private String checkRuleValue;
    private String checkRuleDesc;
    private String remark;
    private String targetHandler;
    private boolean state;
    private List<UserBo> userBoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheckRuleKey() {
        return checkRuleKey;
    }

    public void setCheckRuleKey(String checkRuleKey) {
        this.checkRuleKey = checkRuleKey;
    }

    public String getCheckRuleValue() {
        return checkRuleValue;
    }

    public void setCheckRuleValue(String checkRuleValue) {
        this.checkRuleValue = checkRuleValue;
    }

    public String getCheckRuleDesc() {
        return checkRuleDesc;
    }

    public void setCheckRuleDesc(String checkRuleDesc) {
        this.checkRuleDesc = checkRuleDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTargetHandler() {
        return targetHandler;
    }

    public void setTargetHandler(String targetHandler) {
        this.targetHandler = targetHandler;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setUserBoList(List<UserBo> userBoList) {
        this.userBoList = userBoList;
    }

    public List<UserBo> getUserBoList() {
        return userBoList;
    }
}
