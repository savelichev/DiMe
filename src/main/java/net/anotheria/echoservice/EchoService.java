package net.anotheria.echoservice;

import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.DistributeMe;

@DistributeMe
public interface EchoService extends Service {


    /**
     * Take message and return reverse of it.
     *
     * @param aString input message.
     * @return reversed message.
     */
    String echo(String aString);
}
