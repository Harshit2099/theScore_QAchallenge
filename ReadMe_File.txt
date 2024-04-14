

--------------------------------------------------------------------------------------------------------------------------------------
-----Updating Main.js

under the file location .\\Score_appium_java_eclipse\theScore_Assignment\src\main\java\org\Appium_Utilities\Common_Utilities.java

in the AppiumDriverLocalService Start_Appium_Server()

update the path of main.js in the following place
service = C:\\Users\\<username>\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js

--------------------------------------------------------------------------------------------------------------------------------------
---- Test case location with Page object model implementation 

Test case is located in .\\Score_appium_java_eclipse\theScore_Assignment\src\test\java\org\Appium_POM\TA_20_theScore_assignment.java

--------------------------------------------------------------------------------------------------------------------------------------
---- Update Appium Ip_address, port, Device name, app parh

go to the path .\\Score_appium_java_eclipse\theScore_Assignment\src\main\java\org\Appium_POM\Resources\Data.properties
and 
go to the path .\\Score_appium_java_eclipse\theScore_Assignment\target\classes\org\Appium_POM\Resources\Data.properties

open Data.properties
update the following as neaded
	ip_Address = 127.0.0.1
	Port = 4723
	DeviceName = Pixel 7 API 28
	App_Path_General_Store = "C:\\Score_appium_java_eclipse\\theScore_Assignment\\src\\main\\java\\org\\Appium_POM\\ResourcesGeneral-Store.apk"

--------------------------------------------------------------------------------------------------------------------------------------
----- Update apk file path in Android_BaseTest.Java

open the file Score_appium_java_eclipse\theScore_Assignment\src\test\java\org\Test_Base_Configs\Android_BaseTest.Java

update the following

options.setApp("C:\\Score_appium_java_eclipse\\theScore_Assignment\\src\\main\\java\\org\\Appium_POM\\ResourcesGeneral-Store.apk");

--------------------------------------------------------------------------------------------------------------------------------------

Java Client version in POM file is =  8.6.0
testNG version in POM file is = is 7.9.0
selenium-java version in POM file is = is 4.15.0

check the pom file for more details
Score_appium_java_eclipse\theScore_Assignment\POM.xml