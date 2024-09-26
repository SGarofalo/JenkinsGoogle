package pages;

public class PagPcipal extends BasePage{
    //le defino un constructor
    public PagPcipal(){
        super(driver); //llamo al constructor padre
    }

    //creo 1 metodo p navegar a www.free...
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
        // clickElement(searchButton);
    }

    //creo 1 metodo p navegar a www.free...
    public void navigateToYoutube(){
        navigateTo("https://www.youtube.com");
            // clickElement(searchButton);
    }

    
}
