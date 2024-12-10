import org.testng.annotations.*;

public class Demo_Annotations {
    //public static void main(String[] args) {
        @Test
        public void test1(){
            System.out.println("Testone fired");
        }
    @Test
    public void test2(){
        System.out.println("Testtwo fired");
    }

        @BeforeSuite
                void beforesuite(){
            System.out.println("before suite fired..");
        }
        @BeforeClass
                void beforeclass(){
            System.out.println("before class fired");
        }
        @BeforeTest
                void beforetest(){
            System.out.println("before test fired");
        }
        @BeforeMethod
                void b(){
            System.out.println("before method fired2");
        }
        @BeforeMethod
            void c(){
        System.out.println("before method fired3");
        }
        @BeforeMethod
            void d(){
        System.out.println("before method fired4");
        }


    @AfterSuite
    void aftersuite(){
        System.out.println("after suite fired..");
    }
    @AfterClass
    void afterclass(){
        System.out.println("after class fired");
    }
    @AfterTest
    void aftertest(){
        System.out.println("after test fired");
    }
    @AfterMethod
    void b1(){
        System.out.println("after method firedb1");
    }
    @AfterMethod
    void d1(){
        System.out.println("after method fired d1");
    }
    @AfterMethod
    void a1(){
        System.out.println("after method fired a1");
    }
    @AfterMethod
    void c1(){
        System.out.println("after method fired c1");
    }

}
