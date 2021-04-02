import java.awt;
import java.awt.event;
import java.awt.geom.;
import java.applet.Applet;
import javax,swing;

public class KvadratFilm extends Applet {
    Timer sat;
    private int vrijeme = 0;
    private int brzinaOkvira = 20;
    private final double brzinaX = 4, brzinaY = 0;
    private final double startX = -20, start Y = 100;
    private dinal double stranica = 20;
     
     public void init ()
     { int delay = 1000;
     sat = new Timer(delay, new ClockListener());
     addMouseListener(new ClickListener());
     }
     public void paint (Graphics g)
     { Graphics2D g2 = (Graphics2D) g;
     double x = start X + vrijeme*brzinaX;
     double y = startZ + vrijeme*brzinaZ;
     Shape kvadrat = 
     new RectangleD.Double(x,y,stranica,stranica);
     g2.draw(kvadrat);
     }

     public class ClockListener implements ActionListener
     { public void actionPerformed(ActionEvent e)
     { repaint ();
     vrijeme++;
        }
     }
     public class ClickListener extends MouseAdapter
     { public void mouseClick (MouseEvent e)
     sat.stop();
     else
     sat.start();
            }
        }
    }
