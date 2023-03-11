# Appium Futter Finder Java
Flutter appium driver is automation tool with java implemantation.

# maven-plugin

## Setup
Add maven dependency to pom.xml

```xml
<dependency>
    <groupId>io.github.ashwithpoojary98</groupId>
    <artifactId>appium_flutterfinder_java</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

```java

import io.appium.java_client.AppiumDriver;

public class FlutterFinderExampleTest {
    RemoteWebDriver driver;

    @BeforeMethod
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("app", "");
        capabilities.setCapability("automationName", "Flutter");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void appiumFlutterTest() {
        FlutterFinder finder = new FlutterFinder(driver);
        WebElement element = finder.byValueKey("increment");
        element.click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
```        

### list of finder
1. byValueKey(String key)
2. byValueKey(int key)
3. byToolTip(String toolTipText)
4. byType(String type)
5. byText(String input)
6. byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly)
7. byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly)
8. bySemanticsLabel(String label)
9. bySemanticsLabel(Pattern label)


### Flutter Common Finders
https://api.flutter.dev/flutter/flutter_test/CommonFinders-class.html

### More about flutter finder
https://github.com/appium-userland/appium-flutter-driver
