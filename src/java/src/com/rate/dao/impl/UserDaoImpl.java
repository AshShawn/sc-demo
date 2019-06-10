package src.com.rate.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import src.com.rate.dao.UserDao;
import src.com.rate.model.User;
import src.com.rate.util.DatabaseUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public int insert(User user) {
		int i = 0;
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String uName = user.getUName();
        String uPwd = user.getUPwd();
        String uContact = user.getUContact();
        
        try {
            con = DatabaseUtil.getConnection();
            String sql = "insert into User (UNmae,Uwd,UContact) values (?,?,?)";
            ps = con.prepareCall(sql);
            ps.setString(1,uName);
            ps.setString(2,uPwd);
            ps.setString(3,uContact);
			i = ps.executeUpdate();
			ps.close();
			con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DatabaseUtil.close(rs, ps, con);
        }
		return i;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String uName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getOneByName(String uName) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public User showuserByIdAndPwd(String uName, String uPwd) {
		User user = null;
		
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = DatabaseUtil.getConnection();
            String sql = "select * from user where UName=? and UPwd=?";
            ps = con.prepareCall(sql);
            ps.setString(1,uName);
            ps.setString(2,uPwd);
            rs = ps.executeQuery();
            while(rs.next()){
            	user = new User();
            	user.setUBirthday(rs.getString("UBirthday"));
            	user.setUCity(rs.getString("UCity"));
            	user.setUContact(rs.getString("UContact"));
            	user.setUEmail(rs.getString("UEmail"));
            	user.setUGender(rs.getString("UGender"));
            	user.setUName(rs.getString("UName"));
            	user.setUPic(rs.getString("UPic"));
            	user.setUProvince(rs.getString("UProvince"));
            	user.setUPwd(rs.getString("UPwd"));
			}
			ps.close();
			con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DatabaseUtil.close(rs, ps, con);
        }
		return user;
	}

}
