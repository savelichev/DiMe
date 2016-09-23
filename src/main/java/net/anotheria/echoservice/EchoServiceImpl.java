package net.anotheria.echoservice;

/**
 * Echo service implementation.
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String aString) {

        System.out.println(aString);

        return new StringBuilder(aString).reverse().toString();
    }


}
