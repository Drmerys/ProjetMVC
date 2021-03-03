package ProjetJava;

import ProjetMVC.controller.Controller;
import ProjetMVC.model.Model;
import ProjetMVC.view.View;

public class ProjetMVC {
    public static void main(String[] args) {
        Controller c=new Controller(new Model(), new View());
        c.run();
    }
}
