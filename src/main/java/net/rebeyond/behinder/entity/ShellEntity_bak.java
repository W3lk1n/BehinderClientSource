// 
// Decompiled by Procyon v0.5.36
// 

package net.rebeyond.behinder.entity;

import java.sql.Timestamp;

public class ShellEntity_bak
{
    private String id;
    private String catagory;
    private String url;
    private String ip;
    private String password;
    private String type;
    private String headers;
    private String os;
    private String comment;
    private String memo;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Timestamp accessTime;
    
    public String getId() {
        return this.id;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public String getCatagory() {
        return this.catagory;
    }
    
    public void setCatagory(final String catagory) {
        this.catagory = catagory;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public String getHeaders() {
        return this.headers;
    }
    
    public void setHeaders(final String headers) {
        this.headers = headers;
    }
    
    public String getOs() {
        return this.os;
    }
    
    public void setOs(final String os) {
        this.os = os;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(final String comment) {
        this.comment = comment;
    }
    
    public String getMemo() {
        return this.memo;
    }
    
    public void setMemo(final String memo) {
        this.memo = memo;
    }
    
    public Timestamp getAddTime() {
        return this.addTime;
    }
    
    public void setAddTime(final Timestamp addTime) {
        this.addTime = addTime;
    }
    
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(final Timestamp updateTime) {
        this.updateTime = updateTime;
    }
    
    public Timestamp getAccessTime() {
        return this.accessTime;
    }
    
    public void setAccessTime(final Timestamp accessTime) {
        this.accessTime = accessTime;
    }
    
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(final String ip) {
        this.ip = ip;
    }
}
