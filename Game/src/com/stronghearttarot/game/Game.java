package com.stronghearttarot.game;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class Game {
	
	public static void main(String[] args)
	{
	}
	
	public void initDisplay()
	{
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Whut");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	public void initGL()
	{
	}
	
	public void gameLoop()
	{
		while (!Display.isCloseRequested())
		{
			
		}
	}

}
