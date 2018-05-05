package main;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

import graphicalUserInterface.GUIBoard;

public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
		try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		UIManager.LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();

		JFrame frame=new JFrame("Simulator");
		frame.setLayout(new BorderLayout());
	    frame.setLocation(250, 50);
	    //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Icon/new.gif"));

		GUIBoard newBoard=new GUIBoard(frame);
		newBoard.setVisible(true);
		newBoard.setLayout(new GridLayout());
		
		frame.getContentPane().add(newBoard);
		frame.pack();
	    frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Start();


	}

}
