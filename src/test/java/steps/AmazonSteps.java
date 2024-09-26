package steps;

import io.cucumber.java.en.*;
import pages.PagPcipal;
public class AmazonSteps {


    PagPcipal landingpage = new PagPcipal();

    @Given("^The user navigates to www.google.com$")
    public void navegoAAmazon(){
        landingpage.navigateToGoogle();
    }

    @Given("^The user navigates to www.youtube.com$")
    public void navegoAYouTube(){
        landingpage.navigateToYoutube();
    }
}
