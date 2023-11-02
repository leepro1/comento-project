package com.project.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.project.dto.BoardDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class BoardDAO {
	private Long id;
	private String writer;
	private String title;
	private String password;
	private String contents;
	private Date createdTime;
	
	public static BoardDAO toSaveBoardDAO(BoardDTO boardDTO) {
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.setWriter(boardDTO.getBoardWriter());
		boardDAO.setPassword(boardDTO.getBoardPassword());
		boardDAO.setTitle(boardDTO.getBoardTitle());
		boardDAO.setContents(boardDTO.getBoardContents());
		boardDAO.setCreatedTime(boardDTO.getCreatedTime());

        return boardDAO;
    }
	
	public static BoardDAO toUpdateBoardDAO(BoardDTO boardDTO) {
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.setId(boardDTO.getId());
		boardDAO.setWriter(boardDTO.getBoardWriter());
		boardDAO.setPassword(boardDTO.getBoardPassword());
		boardDAO.setTitle(boardDTO.getBoardTitle());
		boardDAO.setContents(boardDTO.getBoardContents());

        return boardDAO;
    }
}
