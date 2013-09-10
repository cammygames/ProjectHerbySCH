package co.uk.windsorsixth.rastank;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * 
 * @author cammygames
 *
 */
public class KeyHandler implements KeyListener
{
	private boolean moveForward;
	
	private boolean moveBack;
	
	private boolean moveLeft;
	
	private boolean moveRight;
	
		
	public KeyHandler(){}
	
	@Override
	public void keyTyped(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		System.out.println(e.getKeyCode());
		
		/**
		 * FORWARD
		 * KEY : W
		 */
		if(e.getKeyCode() == 87)
		{
			moveForward = true;
			
			while (moveForward == true)
			{	
				try { Action.moveForward(); } catch (InterruptedException e1) { e1.printStackTrace(); }
				break;
			}
		}
		/**
		 * EMERCENCY STOP
		 * KEY : E
		 */
		if(e.getKeyCode() == 69)
		{	
			try { Action.eStop(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		}	
		/**
		 * BACK
		 * KEY : S
		 */
		if (e.getKeyCode() == 83)
		{
			try { Action.moveBack(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		}
		/**
		 * LEFT
		 * KEY : A
		 */
		if (e.getKeyCode() == 65)
		{
			try { Action.moveLeft(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		}
		/**
		 * Right
		 * KEY : D
		 */
		if (e.getKeyCode() == 68)
		{
			try { Action.moveRight(); } catch (InterruptedException e1) { e1.printStackTrace(); }
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode() == 87)
		{
			moveForward = false;
		}
	}	
}