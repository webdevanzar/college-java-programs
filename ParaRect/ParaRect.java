import java.awt.*;
import java.applet.*;

public class ParaRect extends Applet {

    public void paint(Graphics g) {

        int x = Integer.parseInt(getParameter("x"));
        int y = Integer.parseInt(getParameter("y"));
        String colorStr = getParameter("color");

        Color col = new Color(Integer.parseInt(colorStr, 16));
        g.setColor(col);

        g.drawRect(x, y, 150, 100);
    }
}