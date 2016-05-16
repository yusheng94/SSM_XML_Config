package com.xwdc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;

import com.xwdc.domain.UserInfo;

public interface UserInfoMapper {
	@Select("select * from USER_INFO where id = #{id}")
	@Results(value={
		@Result(id = true, property = "id", column = "ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),  
		@Result(property = "userName", column = "USER_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
		@Result(property = "userName", column = "USER_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR), 
		@Result(property = "userName", column = "USER_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR)})
	public UserInfo getUserInfo(@Param("id") String id);

	@Insert("INSERT INTO USER_INFO(ID,USER_NAME, USER_AGE, USER_ADD) "
			+ "VALUES (#{id}, #{userName}, #{userAge}, #{userAdd})")
	@SelectKey(keyProperty="id",resultType=java.lang.String.class,before=true,statement="SELECT TEST_USER_INCREASE.NEXTVAL AS id from dual")
	public void insertUserInfo(UserInfo user);
}
