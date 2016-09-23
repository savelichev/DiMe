package net.anotheria.echoservice;


import org.distributeme.core.ServiceLocator;


public class Client {

    public static void main(String[] args) {

        EchoService echoService = ServiceLocator.getRemote(EchoService.class);

        String message = "hello";

        String echoMessage = echoService.echo(message);

        System.out.println(message);
        System.out.println(echoMessage);
    }
}
