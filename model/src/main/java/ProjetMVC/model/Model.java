package ProjetMVC.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel{
    @Override
    public String getMessage() {
        try(BufferedReader br =
                    new BufferedReader(
                            new FileReader(
                                    Model.class.getResource("message.txt").getFile())
                    )
            )
        {
            return br.readLine();
        } catch(IOException e){
            return "ERROR" + e.getMessage();
        }
    }
}
