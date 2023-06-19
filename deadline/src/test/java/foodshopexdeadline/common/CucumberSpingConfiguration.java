package foodshopexdeadline.common;

import foodshopexdeadline.DeadlineApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeadlineApplication.class })
public class CucumberSpingConfiguration {}
