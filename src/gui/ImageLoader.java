package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageLoader {

    public static ImageIcon setImage(String filename)
    {
        BufferedImage theImage = null;
        File f = new File("images/" + filename);
        try
        {
            theImage = ImageIO.read(f);
            return new ImageIcon(theImage);
        }
        catch (IOException e1)
        {
            theImage = null;
        }
        return null;
    }
}
