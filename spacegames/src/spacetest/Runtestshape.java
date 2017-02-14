package spacetest;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.testng.annotations.Test;

import spacegame.Twodshapes;
import spacegame.setup;

public class Runtestshape extends setup {

	@Test
	public void run() throws IOException, InterruptedException, HeadlessException, AWTException
	{
		setufiles();
		Twodshapes shapes = new Twodshapes(driver);
		shapes.matching();
		
		
	}
	
}
