package com.testingshastra.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

import com.Designkeyword.UIKeywords;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListeners implements ITestListener {
private static final Logger log = Logger.getLogger(TestListeners.class);
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		log.info("test case is failed.take screenshot");
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(200));
		Screenshot sc = ashot.takeScreenshot(UIKeywords.getInstance().driver);
		BufferedImage img = sc.getImage();
		String dir = System.getProperty("user.dir");
		
		try {
			
			ImageIO.write(img, "png", new File(dir+"/Screenshots/"+result.getName()+".png"));
		log.info("screenshot is saved successfully");
		} catch (IOException e) {
			log.error("unable to take screenshot");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
