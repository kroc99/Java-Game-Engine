import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Material {
    Color fill, border;
    int borderWidth;
    boolean isShape = true;
    BufferedImage img;

    Material() {
        this.fill = Color.BLACK;
        this.border = Color.BLACK;
        this.borderWidth = 0;
    }


    //TODO: set the fields
    public Material(Color fill, Color border, int borderWidth) {
        this.fill = fill;
        this.border = border;
        this.borderWidth = borderWidth;
    }

    public Material(String path) {
        setImg(path);
        this.isShape = false;
    }

    //Getters and Setters, done for you!
    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

    public Color getBorder() {
        return border;
    }

    public void setBorder(Color border) {
        this.border = border;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int stroke_width) {
        this.borderWidth = stroke_width;
    }

    public BufferedImage getImg(){return img;}

    //TODO: write this part, load the image and set it
    public void setImg(String path) {
        try {
            this.img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            this.img = null;
        }
    }

    public void setImg(BufferedImage img){this.img=img;}

    public boolean hasImage() {
        return img != null;
    }

    public BufferedImage getImage() {
        return img;
    }

    public boolean hasBorder() {
        return borderWidth > 0;
    }
}
