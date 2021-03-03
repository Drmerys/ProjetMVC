package ProjetMVC.model;

import java.io.*;

public class Model implements IModel{
    @Override
    public String getMessage() {
        try(BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    Model.class.getResourceAsStream("message.txt"))
                    )
            )
        {
            return br.readLine();
        } catch(IOException e){
            return "ERROR" + e.getMessage();
        }
    }
}
