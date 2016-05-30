package com.demoqa.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.demoqa.selenium.TakeScreenShots;
import com.demoqa.utils.DataUtils;

public class MyWebDriverListerner implements WebDriverEventListener {

  @Override
  public void afterChangeValueOf(final WebElement arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterClickOn(final WebElement arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterFindBy(final By arg0, final WebElement arg1, final WebDriver arg2) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterNavigateBack(final WebDriver arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterNavigateForward(final WebDriver arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterNavigateTo(final String arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterScript(final String arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeChangeValueOf(final WebElement arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeClickOn(final WebElement arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeFindBy(final By arg0, final WebElement arg1, final WebDriver driver) {
    TakeScreenShots.takeChromScreenShot(driver, "fileName");
  }

  @Override
  public void beforeNavigateBack(final WebDriver arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeNavigateForward(final WebDriver arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeNavigateTo(final String arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void beforeScript(final String arg0, final WebDriver arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onException(final Throwable arg0, final WebDriver driver) {
    TakeScreenShots.takeChromScreenShot(driver,
        "exceptionScreenShot" + DataUtils.getRandomNumber() + ".png");

  }

  @Override
  public void beforeNavigateRefresh(final WebDriver driver) {
    // TODO Auto-generated method stub

  }

  @Override
  public void afterNavigateRefresh(final WebDriver driver) {
    // TODO Auto-generated method stub

  }

}
