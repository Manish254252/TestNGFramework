package com.automation;

import com.automation.test.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener extends BaseTest implements ITestListener {
    private static ExtentReports extent;
    private static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("ExtentReports/ExtentReport.html");
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("TestNG Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShot();
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip(result.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}

