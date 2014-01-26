package de.hachuzky.java.jaudioplayer;

import java.io.FileInputStream;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

public class TestPlayer {

	public static void main(String[] args) {
		
		Player player;
		try {
			InputStream iStream = new FileInputStream("D:\\Downloads\\music\\mp3\\file.mp3");
			player = new Player(iStream);
			player.play();
			Thread.sleep(100);
			Thread.currentThread().stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
