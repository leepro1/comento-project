package com.project.dto;

import java.util.Date;

import com.project.dao.BoardDAO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardDTO {
	private Long id;
	private String boardWriter;
	private String boardTitle;
	private String boardPassword;
	private String boardContents;
	private Date createdTime = new Date();

	public static BoardDTO toBoardDTO(BoardDAO boardDAO) {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId(boardDAO.getId());
		boardDTO.setBoardWriter(boardDAO.getWriter());
		boardDTO.setBoardPassword(boardDAO.getPassword());
		boardDTO.setBoardTitle(boardDAO.getTitle());
		boardDTO.setBoardContents(boardDAO.getContents());
		boardDTO.setCreatedTime(boardDAO.getCreatedTime());

		return boardDTO;
	}
}
