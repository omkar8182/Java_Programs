/*
<applet code="Refer" width=100 height=100></applet>
*/	
import java.applet.*;
import java.awt.Graphics;
class Refer extends Applet{
	public void paint(Graphics g) {
		g.drawString("hello",10,10);
		g.drawRoundRect(100,100,100,100,100,100);

	}
	
}