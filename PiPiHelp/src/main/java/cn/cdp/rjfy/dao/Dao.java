package cn.cdp.rjfy.dao;

import cn.cdp.rjfy.entity.Admin;

public interface Dao {
    /***
     * 获取管理员信息
     * @param account
     * @param password
     * @return
     */
    Admin getAdmin(String account,String password);
}
