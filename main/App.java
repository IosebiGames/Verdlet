package main;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import operations.FileMoveOut;

public class App {
   private JFrame window = new JFrame("Verdlet");
   private JLabel InstLabel = DefaultComponentFactory.getInstance().createLabel("Verdlet");
   private JLabel authorText = new JLabel("Made by IosebiGames | 29.06.2026");
   private JLabel selectText = new JLabel("Choose version below:");
   private JLabel installerText = new JLabel("The GreenPack Installer");
   private FileMoveOut fmo;
   private JButton getButton;
   public JComboBox<?> versionBox;
   private ImageIcon icon;
   private String[] versions =  new String[] {"GreenPack v.1.1 Release (1.19.4)", "GreenPack(1.19.3)", "GreenPack Classic v1.0 (1.19.4)"};
   private int[] getButtonBounds = new int[] {104, 254, 158, 30};
   private int[] versionBoxBounds = new int[] {78, 203, 218, 30};
   private int[] InstLabelBounds = new int[] {125, 41, 291, 42};
   private int[] authorTextBounds = new int[] {45, 326, 301, 42};
   private int[] selectTextBounds = new int[] {90, 166, 291, 42};
   private int[] installerTextBounds = new int[] {102, 65, 291, 42};
   
   public App() {
      this.getButton = new JButton("Download GreenPack");
      this.icon = new ImageIcon(getClass().getResource("/icons/logo.png"));
      this.versionBox = new JComboBox<>(versions);
      this.fmo = new FileMoveOut();
      
      window.setResizable(false);
      window.setLayout(null);
      window.setDefaultCloseOperation(3);
      window.setPreferredSize(new Dimension(400, 400));
      window.pack();
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      window.getContentPane().setBackground(new Color(119, 221, 119));
      window.setIconImage(icon.getImage());
      
      InstLabel.setFocusable(false);
      InstLabel.setFont(new Font("Verdana", 1, 24));
      InstLabel.setBounds(InstLabelBounds[0], InstLabelBounds[1], InstLabelBounds[2], InstLabelBounds[3]);
      InstLabel.setForeground(Color.black);
      
      getButton.setBounds(getButtonBounds[0], getButtonBounds[1], getButtonBounds[2], getButtonBounds[3]);
      getButton.setFocusable(false);
      getButton.setForeground(Color.black);
      getButton.setBackground(Color.white);
      getButton.addActionListener(e -> { 
    	  if(e.getSource()==getButton) {
    		  switch(versionBox.getSelectedIndex()) { 
    		  case 0: fmo.moveOut(System.getProperty("user.dir"), "GreenPack v1.1 Release (1.19.4).zip"); 
    		       break;
    		  case 1: fmo.moveOut(System.getProperty("user.dir"), "GreenPack(1.19.3).zip"); 
		           break;
    		  case 2: fmo.moveOut(System.getProperty("user.dir"), "GreenPack Classic v1.0 (1.19.4).zip"); 
		           break;
		     }
    	  }
      });
      authorText.setFocusable(false);
      authorText.setFont(new Font("Verdana", 1, 14));
      authorText.setBounds(authorTextBounds[0], authorTextBounds[1], authorTextBounds[2], authorTextBounds[3]);
      authorText.setForeground(Color.black);
      
      selectText.setFocusable(false);
      selectText.setFont(new Font("Verdana", 1, 14));
      selectText.setBounds(selectTextBounds[0], selectTextBounds[1], selectTextBounds[2], selectTextBounds[3]);
      selectText.setForeground(Color.black);
   
      installerText.setFocusable(false);
      installerText.setFont(new Font("Segoe UI", 1, 14));
      installerText.setBounds(installerTextBounds[0], installerTextBounds[1], installerTextBounds[2], installerTextBounds[3]);
      installerText.setForeground(Color.black);
      
      versionBox.setBounds(versionBoxBounds[0], versionBoxBounds[1], versionBoxBounds[2], versionBoxBounds[3]);
      versionBox.setFocusable(false);
      versionBox.setBackground(Color.white);
      versionBox.setVisible(true);
     
      window.getContentPane().add(versionBox);
      window.getContentPane().add(InstLabel);
      window.getContentPane().add(getButton);
      window.getContentPane().add(authorText);
      window.getContentPane().add(selectText);
      window.getContentPane().add(installerText);
   }
   public static void main(String[] args) {
	  SwingUtilities.invokeLater(App :: new);
   }
}