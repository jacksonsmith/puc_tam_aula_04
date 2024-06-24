package com.example.myapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiObjectNotFoundException
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

//https://developer.android.com/training/testing/other-components/ui-automator

@RunWith(AndroidJUnit4::class)
class GoogleChromeUIAutomatorTest {
    val mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    @Before
    fun setup(){
        mDevice.pressHome()
        val appDrawer = UiScrollable(UiSelector().scrollable(true))
        appDrawer.scrollForward()
    }

    @Test
    @Throws(UiObjectNotFoundException::class)
    fun testOpenChromeAndNavigate() {
        val chromeApp: UiObject = mDevice.findObject(UiSelector().descriptionContains("Chrome"))
        chromeApp.clickAndWaitForNewWindow()

        val addressBar: UiObject = mDevice.findObject(UiSelector().textContains("Search or type URL"))

        addressBar.click()
        addressBar.setText("https://www.google.com")

        mDevice.pressEnter()

        val pageTitle: UiObject = mDevice.findObject(UiSelector().descriptionContains("Google"))
        pageTitle.waitForExists(3000)

        assert(pageTitle.exists()) { "Test Failed: Não achei o site do Google" }
    }

    @Test
    @Throws(UiObjectNotFoundException::class)
    fun testOpenPucMinasAndNavigate() {
        val chromeApp: UiObject = mDevice.findObject(UiSelector().descriptionContains("Chrome"))
        val website = "https://olympics.com/en/paris-2024"
        val expectedMatchDateTest = "26 de julho"

        chromeApp.clickAndWaitForNewWindow()

        val addressBar: UiObject = mDevice.findObject(UiSelector().text("Search or type URL"))

        addressBar.click()
        addressBar.setText(website)

        mDevice.pressEnter()

        val olympicGames: UiObject = mDevice.findObject(UiSelector().descriptionContains("Google"))

        olympicGames.waitForExists(6000)

        assert(olympicGames.exists()) { "Test Failed: Não achei o texto =(" }
    }
}
