package org.thematics.frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import org.thematics.io.FilesManager;
import org.thematics.player.Player;
import org.thematics.player.mage.Mage;
import org.thematics.player.melee.Soldier;
import org.thematics.player.range.Archer;

/**
*
* @author Guillaume
*/
public class MenuFrame extends JFrame {

	private static final long serialVersionUID = -1120439526456885524L;
	
	private JFrame frame;
	private JButton jButton1;
	private JComboBox jComboBox1;
	private JTextField jTextField1;
	private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JButton jButton2;
	
	private Player player;
	private LoginFrame loginFrame;

	public MenuFrame() {
		initComponents();
	}

   private void initComponents() {
	   jButton1 = new JButton();
	   jComboBox1 = new JComboBox();
	   jTextField1 = new JTextField();
	   jLabel1 = new JLabel();
	   jLabel2 = new JLabel();
	   jScrollPane1 = new JScrollPane();
	   jTextArea1 = new JTextArea();
	   jButton2 = new JButton();
	   
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       jComboBox1.setFont(new Font("Tahoma", 0, 14));
       jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Soldier", "Archer", "Mage" }));

       jLabel1.setFont(new Font("Tahoma", 0, 14));
       jLabel1.setText("Please choose your character : ");

       jLabel2.setFont(new Font("Tahoma", 0, 14));
       jLabel2.setText("Enter the name of your character :");

       jTextArea1.setColumns(20);
       jTextArea1.setRows(5);
       jTextArea1.setFont(new Font("Tahoma", 0, 14));
       jTextArea1.setText(" Please fill the information to \n continue to the game and \n " +
       		"start enjoying! You first have \n to choose your character, \n then his name and you're set!");
       jTextArea1.setEditable(false);
       jScrollPane1.setViewportView(jTextArea1);

       jButton1.setText("Go!");
       jButton1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               jButton1ActionPerformed(player, loginFrame);
           }
       });

       jButton2.setText("Cancel");
       jButton2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               jButton2ActionPerformed();
           }
       });

       GroupLayout layout = new GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                           .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
                       .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))
                   .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
               .addContainerGap())
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(37, 37, 37)
               .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                   .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabel1)
                       .addGap(18, 18, 18)
                       .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                       .addGap(36, 36, 36)
                       .addComponent(jLabel2)
                       .addGap(18, 18, 18)
                       .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                       .addGap(30, 30, 30)
                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                           .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                           .addComponent(jButton2))))
               .addContainerGap(15, Short.MAX_VALUE))
       );
       setLocationRelativeTo(null);
       pack();
   }
   
   /**
    * The "Go!" button. This will instantiate the new character
    * and change its caracteristics depending on the Combo Box choice.
    * @param player
    */
   private void jButton1ActionPerformed(Player player, LoginFrame frame) {
	   switch(jComboBox1.getModel().getSelectedItem().toString()) {
	   case "Soldier":
		   player = new Soldier();
		   break;
	   case "Archer":
		   player = new Archer();
		   break;
	   case "Mage":
		   player = new Mage();
		   break;
	   }
	   
	   player.setUsername(frame.getUsername());
	   player.setPassword(frame.getPassword());
	   
	   if (!player.hasProperUsername(jTextField1.getText())) {
			JOptionPane.showMessageDialog(frame, 
					"Your character name may only contain letters and numbers.",
					"Wrong username.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
	   
	   player.setCharacterName(jTextField1.getText());
	   FilesManager.writeToFile(player, new File("data/characters/" + frame.getUsername() + ".ser"));
	   player.start();
	   dispose();
   }

   /**
    * The cancel button.
    */
   private void jButton2ActionPerformed() {
	   int option = JOptionPane.showConfirmDialog(frame,
               "Are you sure you want to leave?",
               "Warning!",
               JOptionPane.YES_NO_OPTION);
	   
	   if (option == JOptionPane.YES_OPTION)
		   System.exit(0);
   }
   
   public void setInstances(Player player, LoginFrame loginFrame) {
	   this.player = player;
	   this.loginFrame = loginFrame;
   }
}