package kerbin.world;
//Тайл,  создается в TileFactory

import kerbin.items.Item;

import java.awt.*;
import java.io.Serializable;

public class Tile implements Serializable {
    private char glyph;

    public char glyph() {
        return glyph;
    }

    private Color color;

    public Color color() {
        return color;
    }

    // Проверка на то, является ли телепортом/лестницей
    public boolean isUtil;
    //Проверка на проходимость
    private boolean isGround;

    public boolean isGround() {
        return isGround;
    }

    //Предмет на клетке, при отсутствии == null
    public Item item;

    Tile(char glyph, Color color, boolean isGround, boolean isUtil) {
        this.glyph = glyph;
        this.color = color;
        this.item = null;
        this.isGround = isGround;
        this.isUtil = isUtil;
    }
}