package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class PrecioCochesBot  extends TelegramLongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());

        SendMessage EnviarMensaje = new SendMessage();
        String respuesta = update.getMessage().getText();
        onUpdatesReceived();

        if (respuesta.equals("/hola")){

            EnviarMensaje.setText("Bienvenid@ a PrecioCochesBot "+update.getMessage().getFrom().getFirstName());
            System.out.println("Se ha mandado un mensaje 'Bienvenido' sin comando a:  ");
            System.out.println("NOMBRE : "+update.getMessage().getFrom().getFirstName());
            System.out.println("APELLIDO : "+update.getMessage().getFrom().getLastName());
            System.out.println("ID : "+update.getMessage().getFrom().getId());
            System.out.println("\n");


        } else if (respuesta.equals("/adios")){

            EnviarMensaje.setText("Adios :( "+update.getMessage().getFrom().getFirstName());
            System.out.println("A sido cerrado el Bot por:") ;
            System.out.println("NOMBRE : "+update.getMessage().getFrom().getFirstName());
            System.out.println("APELLIDO : "+update.getMessage().getFrom().getLastName());
            System.out.println("ID : "+update.getMessage().getFrom().getId());
            System.out.println("\n");

        }

        if (respuesta.equals("/ejecutar")){


            EnviarMensaje.setText("Bienvenido a PrecioCochesBot "+update.getMessage().getFrom().getFirstName()+
                    " Aqui encontraras un amplio catalogo de coches que podrás comprar \n\n"+ update.getMessage().getFrom().getFirstName() +
                    "Escribe el numero correspondientede la marca que deseas obtener"
                    + " \n 1-Alpha Romero"+ " \n 2-Audi"+ " \n 3-BMW"+ " \n 4-Land rover"+ " \n 5-Renault"
                    + " \n 6-Porsche"+ " \n 7-Dacia"+ " \n 8-Mercedes" );


            System.out.println("El bot a sido ejecutado por:") ;
            System.out.println("NOMBRE : "+update.getMessage().getFrom().getFirstName());
            System.out.println("APELLIDO : "+update.getMessage().getFrom().getLastName());
            System.out.println("ID : "+update.getMessage().getFrom().getId());
            System.out.println("\n");

        }

        if (respuesta.equals("1")){

            EnviarMensaje.setText("Elija entre los modelos Alfa Romero: \n-1a Gulietta \n-1b Veloche \n-1c Stelvio");
        }
                if (respuesta.equals("1a")){

                    EnviarMensaje.setText("El precio es : 32000€");
                }
                if (respuesta.equals("1b")){

                    EnviarMensaje.setText("El precio es : 36000€");
                }
                if (respuesta.equals("1c")){

                    EnviarMensaje.setText("El precio es : 46000€");
                }

        if (respuesta.equals("2")){

            EnviarMensaje.setText("Elija entre los modelos Audi: \n-2a A1 \n-2b A2 \n-3c A3");
        }

                if (respuesta.equals("2a")){

                    EnviarMensaje.setText("El precio es : 19 000€");
                }
                if (respuesta.equals("2b")){

                    EnviarMensaje.setText("El precio es : 24 000€");
                }
                if (respuesta.equals("2c")){

                    EnviarMensaje.setText("El precio es : 28 000€");
                }
        if (respuesta.equals("3")){

            EnviarMensaje.setText("Elija entre los modelos BMW: \n-3a Serie 1 \n-3b Serie 3 \n-3c i8");
        }
                if (respuesta.equals("3a")){

                    EnviarMensaje.setText("El precio es : 22 000€");
                }
                if (respuesta.equals("3b")){

                    EnviarMensaje.setText("El precio es : 24 000€");
                }
                if (respuesta.equals("3c")){

                    EnviarMensaje.setText("El precio es : 36 000€");
                }
        if (respuesta.equals("4")){

            EnviarMensaje.setText("Elija entre los modelos Land Rover: \n-4a Velar \n-4b Evoque ");
        }
                if (respuesta.equals("4a")){

                    EnviarMensaje.setText("El precio es : 82 000€");
                }
                if (respuesta.equals("4b")){

                    EnviarMensaje.setText("El precio es : 41 000€");
                }

        if (respuesta.equals("5")){

                EnviarMensaje.setText("Elija entre los modelos Renault: \n-5a Laguna \n-6b Clio \n-6c Captur");
        }
                if (respuesta.equals("5a")){

                    EnviarMensaje.setText("El precio es : 19000€");
                }
                if (respuesta.equals("5b")){

                    EnviarMensaje.setText("El precio es : 24000€");
                }
                if (respuesta.equals("5c")){

                    EnviarMensaje.setText("El precio es : 28000€");
                }
        if (respuesta.equals("6")){

            EnviarMensaje.setText("Elija entre los modelos Porsche: \n-6a Cayene \n-6b 911 \n-6c Panamera");
        }
                if (respuesta.equals("6a")){

                    EnviarMensaje.setText("El precio es : 78 000€");
                }
                if (respuesta.equals("6b")){

                    EnviarMensaje.setText("El precio es : 210 000€");
                }
                if (respuesta.equals("6c")){

                    EnviarMensaje.setText("El precio es : 120 000€");
                }
        if (respuesta.equals("7")){

            EnviarMensaje.setText("Elija entre los modelos Dacia: \n-7a Sandero \n-7b Duster");
        }
                if (respuesta.equals("7a")){

                    EnviarMensaje.setText("El precio es : 7000€");
                }
                if (respuesta.equals("7b")){

                    EnviarMensaje.setText("El precio es : 14000€");
                }

        if (respuesta.equals("8")){

            EnviarMensaje.setText("Elija entre los modelos Mercedes: \n-8a Clase A \n-8b Clase B \n-8c Clase C");
        }
                if (respuesta.equals("8a")){

                    EnviarMensaje.setText("El precio es : 19000€");
                }
                if (respuesta.equals("8b")){

                    EnviarMensaje.setText("El precio es : 24000€");
                }
                if (respuesta.equals("8c")){

                    EnviarMensaje.setText("El precio es : 28000€");
                }


        EnviarMensaje.setChatId(update.getMessage().getChatId());

        try {
            execute(EnviarMensaje);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void onUpdatesReceived() {

    }

    @Override
    public String getBotUsername() {
        return "PrecioCochesBot";
    }

    @Override
    public String getBotToken() {
        return "1107630850:AAGocASfV_TQOXD4KqQ1LVK1nGTr8dGH49c";
    }
}
