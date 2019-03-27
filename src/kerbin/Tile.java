package kerbin;

import java.awt.Color;
import asciiPanel.AsciiPanel;
import kerbin.items.Item;

public class Tile {
	//FLOOR((char)250, AsciiPanel.yellow),
	//WALL((char)177, AsciiPanel.yellow),
	//BOUNDS('x', AsciiPanel.brightBlack);
	
	private char glyph;
	public char glyph() { return glyph; }
	
	private Color color;
	public Color color() { return color; }
	private boolean isGround;
	public boolean isGround() { return isGround; }
	public Item item;

	Tile(char glyph, Color color, boolean isGround){
		this.glyph = glyph;
		this.color = color;
		this.item = null;
		this.isGround = isGround;
	}
}
