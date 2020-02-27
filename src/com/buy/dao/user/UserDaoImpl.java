package com.buy.dao.user;

import com.buy.entity.User;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.EmptyUtils;
import com.buy.utils.SecurityUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用户dao
 */
public class UserDaoImpl extends DataSourceUtil implements IUser {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;

	public User tableToClass(ResultSet rs) throws Exception {
		User user = new User();
		user.setLoginName(rs.getString("loginName"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setSex(rs.getInt("sex"));
		user.setIdentityCode(rs.getString("identityCode"));
		user.setEmail(rs.getString("email"));
		user.setMobile(rs.getString("mobile"));
		user.setType(rs.getInt("type"));
		user.setId(rs.getInt("id"));
		return user;
	}
    /**
     * 保存用户
     *
     * @param user
     * @throws SQLException
     */
    public int add(User user){//新增用户信息
    	Integer id=0;
    		String sql="INSERT into easybuy_user(loginName,userName,password,sex,identityCode,email,mobile) values(?,?,?,?,?,?,?) ";
            try {
                Object param[]={user.getLoginName(),user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile()};
				//获取连接
				conn= DataSourceUtil.getConn();
//     		   pstmt=conn.prepareStatement(sql);
//     			for(int i = 0; i < param.length; i++){
//     				pstmt.setObject(i+1, param[i]);
//     			};
//     		id=pstmt.executeUpdate();
			id=this.executeInsert(sql,param);
                user.setId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return id;
    }


	@Override
	public User getUser(String loginName)  {
		User user = null;
		StringBuffer sql =new StringBuffer("SELECT * FROM `easybuy_user` WHERE 1=1");
		conn = DataSourceUtil.getConn();
		if(!EmptyUtils.isEmpty(loginName)){
			sql.append(" and loginName=? ");
		}
		try {
		//执行Sql
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setObject(1,loginName);
			rs=pstmt.executeQuery();
		   //rs=this.executeQuery(sql.toString(),loginName);
			while (rs.next()) {
				user = tableToClass(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
