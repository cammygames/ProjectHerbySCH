package co.uk.windsorsixth.rastank.gui;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

import co.uk.windsorsixth.rastank.KeyHandler;
/**
 * 
 * @author cammygames
 *
 */
public class AppGui extends JFrame
{
	
	 private JPanel window;
	 private JButton moveBack;
	 private JButton moveForward;
	 private JButton moveLeft;
	 private JButton moveRight;
	 private JCheckBox mstrCtrl;
	 private KeyHandler key;
	 
	/**
     * Creates new form APPGui
     */
    public AppGui() 
    {
        initComponents();
    }
       
  	private void initComponents()
  	{

            moveForward = new JButton();
            moveBack = new JButton();
            moveLeft = new JButton();
            moveRight = new JButton();
            window = new JPanel();
            mstrCtrl = new JCheckBox();
     
            window.addKeyListener(new KeyHandler());
            window.setFocusable(true);
            window.requestFocusInWindow();
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            moveForward.setText("Forward");

            moveBack.setText("Backward");

            moveLeft.setText("Left");

            moveRight.setText("Right");

            window.setBorder(BorderFactory.createEtchedBorder());

            GroupLayout windowLayout = new GroupLayout(window);
            window.setLayout(windowLayout);
            windowLayout.setHorizontalGroup(
                windowLayout.createParallelGroup(Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            windowLayout.setVerticalGroup(
                windowLayout.createParallelGroup(Alignment.LEADING)
                .addGap(0, 346, Short.MAX_VALUE)
            );

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mstrCtrl)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(window,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 145, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(moveForward, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
                                    .addGap(391, 391, 391))
                                .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(moveLeft, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(moveBack, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(moveRight, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
                                    .addGap(121, 121, 121))))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(window, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                    .addComponent(moveForward, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(moveBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(moveLeft, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(moveRight, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(mstrCtrl)
                    .addContainerGap())
            );

            pack();
        }                      
}
