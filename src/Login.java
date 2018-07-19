import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.*;
public class Login
{
	public static void main(String[] args)
	{
		final JFrame login=new JFrame("Login");
		JPanel panel=new JPanel();
		JTextField loginName=new JTextField(20);
		JButton enter=new JButton("Login");
		panel.add(loginName);
		panel.add(enter);
		login.setSize(300,100);
		login.add(panel);
		login.setVisible(true);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					ChatClient client=new ChatClient(loginName.getText());
					login.setVisible(false);
					login.dispose();
				}
				catch(UnknownHostException e1)
				{
					e1.printStackTrace();
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
			}	
		});
		loginName.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					try
					{
						ChatClient client=new ChatClient(loginName.getText());
						login.setVisible(false);
						login.dispose();
					}
					catch(UnknownHostException e1)
					{
						e1.printStackTrace();
					}
					catch(IOException e1)
					{
						e1.printStackTrace();
					}
				}
			}
			public void keyReleased(KeyEvent e)
			{	
			}
			public void keyTyped(KeyEvent e)
			{	
			}
		});
	}
}