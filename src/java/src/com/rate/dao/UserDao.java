/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.rate.dao;

import java.util.List;

import src.com.rate.model.User;

/**
 *
 * @author dell
 */
public interface UserDao {
       /**
     * 插入一条记录到表User中
     *
     * @param user 包含要插入的用户信息的user对象
     * @return 一个整数值，标识是否插入成功，如果数字小于等于0，则表示插入失败，否则表示受影响的行数
     */
    public int insert(User user);
    
    /**
     * 登录功能
     * @param uName账号
     * @param uPwd密码
     * @return 返回用户对象，对象为空则登录失败
     */
    public User showuserByIdAndPwd(String uName, String uPwd);

    /**
     * 更新一个用户信息
     *
     * @param user 包含用户更新后的信息的user对象
     * @return 一个整数值，标识是否更新成功，如果数字小于等于0，则表示更新失败，否则表示受影响的行数
     */
    public int update(User user);

    /**
     * 从User表中删除指定姓名的用户的信息
     *
     * @param uName 要删除的用户的名字
     * @return 一个整数值，标识是否删除成功，若返回值大于0，表示受影响的行数，否则表示未删除任何记录
     */
    public int delete(String uName);

    /**
     * 根据姓名查询单个用户的所有信息
     *
     * @param uName 要查询的用户的姓名
     * @return 包含所查询的用户的所有信息的user对象
     */
    public User getOneByName(String uName);


    /**
     * 查询User表中所有用户的信息
     *
     * @return 包含所有用户信息的列表
     */
    public List<User> getAll();
}
