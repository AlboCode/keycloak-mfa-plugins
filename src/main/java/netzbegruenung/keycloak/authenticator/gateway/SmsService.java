package netzbegruenun.keycloak.authenticator.gateway;

import java.util.Map;

/**
 * @author Niko Köbler, https://www.n-k.de, @netzbegruenun
 */
public interface SmsService {

	void send(String phoneNumber, String message);

}
