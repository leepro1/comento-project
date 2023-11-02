package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.project.dao.BoardDAO;

@Mapper
public interface BoardMapper {

	@Select("SELECT * FROM BOARD")
	List<BoardDAO> findAll();

	@Select("SELECT * FROM BOARD WHERE id=#{id}")
	BoardDAO findById(Long id);

	@Insert("INSERT INTO board (writer, title, password, contents, createdTime) VALUES (#{writer}, #{title}, #{password}, #{contents}, #{createdTime})") 
	@Options(useGeneratedKeys=true, keyProperty="id") 
	void save(BoardDAO boardDAO);

	@Update("UPDATE board SET title= #{title}, contents = #{contents} WHERE id = #{id}") 
	void update(BoardDAO boardDAO);

	@Delete("DELETE FROM board WHERE id = #{id}")
	void delete(Long id);
}
