package tetris;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;


    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;

        // ustalanie koloru kamieni
        switch (name) {
            case "j" -> color = Color.rgb(165,93,4);
            case "l" -> color = Color.rgb(89,53,9);
            case "o" -> color = Color.rgb(214,121,44);
            case "s" -> color = Color.rgb(131,80,20);
            case "t" -> color = Color.rgb(237,207,180);
            case "z" -> color = Color.rgb(179,147,117);
            case "i" -> color = Color.rgb(88,51,5);
        }
        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }

    // getter

    public String getName() {
        return name;
    }

    public void changeForm() {
        if(form != 4) {
            form++;
        } else {
            form = 1;
        }
    }
}
