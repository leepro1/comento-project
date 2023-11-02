package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BoardDAO;
import com.project.dto.BoardDTO;
import com.project.mapper.BoardMapper;

@Service
public class BoardService {

	private final BoardMapper boardMapper;

	@Autowired
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public List<BoardDTO> findAll() {
		List<BoardDAO> boardDAOList = boardMapper.findAll();
		
		List<BoardDTO> boardDTOList = new ArrayList<BoardDTO>();
		for (BoardDAO boardDAO : boardDAOList) {
			BoardDTO boardDTO = BoardDTO.toBoardDTO(boardDAO);
			boardDTOList.add(boardDTO);
		}

		return boardDTOList;
	}

	public BoardDTO findById(Long id) {
		BoardDTO boardDTO = BoardDTO.toBoardDTO(boardMapper.findById(id));

		return boardDTO;
	}

	public void save(BoardDTO boardDTO) {
		boardMapper.save(BoardDAO.toSaveBoardDAO(boardDTO));
	}

	public BoardDTO edit(BoardDTO boardDTO) {
		boardMapper.update(BoardDAO.toUpdateBoardDAO(boardDTO));
		
		return boardDTO;
	}

	public void deleteById(Long id) {
		boardMapper.delete(id);
	}

}
