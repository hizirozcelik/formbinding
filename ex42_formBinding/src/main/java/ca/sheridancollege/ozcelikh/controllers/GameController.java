package ca.sheridancollege.ozcelikh.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.ozcelikh.beans.Game;



@Controller
public class GameController {
	
	private List<Game> gameList = new CopyOnWriteArrayList<Game>();
	private static final AtomicInteger count = new AtomicInteger(0); 
	
			
		
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("game", new Game());		
		model.addAttribute("gameList", gameList);
		
		return "index";
	}
	
	@PostMapping("/addGame")
	public String addGame(Model model, @ModelAttribute Game game) {
		
		game.setId(count.incrementAndGet());
		gameList.add(game);
		model.addAttribute("game", new Game());
		model.addAttribute("gameList", gameList);
		
		return "index";
	}
	

}
