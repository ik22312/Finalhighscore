import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTest1 extends FSBase{



        @Test
        public void testFSSignIn() throws InterruptedException {
            //fsLogin();
            //Assert.assertEquals(driver.getTitle(), "Message Inbox | Secure Message Center");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("deal of the day");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
            Thread.sleep(5000);
        }


//    @Test
//    public void myTestCase2() {
//
//        // test step 1
//        // test step 2
//        // test step 3
//        // test step 4
//
//    }
//
//    @Test
//    public void myTestCase4() {
//
//        // test step 1
//        // test step 2
//        // test step 3
//        // test step 4
//    }


    }
