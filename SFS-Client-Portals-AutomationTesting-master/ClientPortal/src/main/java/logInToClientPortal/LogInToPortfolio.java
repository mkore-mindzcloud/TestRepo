package logInToClientPortal;

import baseClass.BaseClass;

public class LogInToPortfolio extends BaseClass {

    LogInMethod loginPage = new LogInMethod();

    public String logInToPortFolio(String LogINAs) {

        switch (LogINAs) {

            case "Timberline":
                loginPage.goToURL("Timberline");
                loginPage.logInToURl("timberline123@yopmail.com.uat","testing1234");

                break;

            case "Canyon":

                loginPage.goToURL("Canyon");
                loginPage.logInToURl("testuserprodcanyon1@yopmail.com.uat","canyontest12");
                break;
        }


        return LogINAs;
    }
}