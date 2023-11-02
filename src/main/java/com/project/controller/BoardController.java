package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.dto.BoardDTO;
import com.project.service.BoardService;

@Controller
public class BoardController {

	private final BoardService boardService;

	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<BoardDTO> boards = boardService.findAll();
		model.addAttribute("boards", boards);
		return "index";
	}

	 @GetMapping("/{id}")
	    public String findById(@PathVariable Long id, Model model) {
	        BoardDTO boardDTO = boardService.findById(id);
	        model.addAttribute("board", boardDTO);
	        return "detail";
	    }
	
	@GetMapping("/save")
	public String saveForm(Model model) {
		return "save";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute BoardDTO boardDto) {
		boardService.save(boardDto);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model,@PathVariable Long id) {
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "edit";
	}

	@PostMapping("/edit")
    public String edit(@ModelAttribute BoardDTO boardDTO, Model model) {
        BoardDTO updatedBoard = boardService.edit(boardDTO);
        model.addAttribute("board", updatedBoard);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        boardService.deleteById(id);
        return "redirect:/";
    }
}
