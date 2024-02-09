import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.sound.midi.ShortMessage.*;

class MyDrawPanel extends JPanel implements ControllerEventListener{

private Random random = new Random();

private boolean msg = false;

public void controlChange(ShortMessage event){

msg = true;

repaint();

}

public void paintComponent(Graphics g){

if(msg){

int r = random.nextInt(250);

int gr = random.nextInt(250);

int b = random.nextInt(250);

g.setColor(new Color(r,gr,b));

int height = random.nextInt(120) + 10;

int width = random.nextInt(120) + 10;

int xPos = random.nextInt(40) + 10;

int yPos = random.nextInt(40) + 10;

g.fillRect(xPos,yPos,width,height);

msg = false;

}

}

}
