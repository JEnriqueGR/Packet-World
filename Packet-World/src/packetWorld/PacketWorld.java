/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packetWorld;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cocoq
 */
public class PacketWorld {
    public void start(Stage primaryStage) {
        // TODO (TO-DO)
        //llamar a mi escena stage -> stage
        try{
            Parent vista = FXMLLoader.load(getClass().getResource("InicioSesion.fxml")); //fxml es un cargador de objetos de memoria
            Scene escenaInicioSesion = new Scene(vista);
            primaryStage.setScene(escenaInicioSesion);
            primaryStage.setTitle("Principal");
            primaryStage.show();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
