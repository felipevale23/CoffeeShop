/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.coffeeshop.app;

import javax.swing.JFrame;
import com.java.coffeeshop.frames.MainFrame;
import com.java.coffeeshop.app.init.Initialize;

/**
 *
 * @author sucrilho boladao
 */
public class App extends Initialize {

	public static void main(String[] args) {

		custumerDbStart();

		MainFrame frame = new MainFrame();

		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}