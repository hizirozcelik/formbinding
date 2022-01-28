package ca.sheridancollege.ozcelikh.beans;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
	
	private final String[] platforms = {"PS5", "Xbox", "Nintendo"};
	
	private int id;
	private String title;
	private String publisher;
	private String platform;
	private BigDecimal price;

}
