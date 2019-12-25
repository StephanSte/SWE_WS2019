package BIF.SWE1;

import java.io.InputStream;

import BIF.SWE1.interfaces.Plugin;
import BIF.SWE1.interfaces.Request;
import BIF.SWE1.interfaces.Response;

public class UEB3 {

	public void helloWorld() {

	}

	public Request getRequest(InputStream inputStream) {
		return new RequestHandler(inputStream);
	}

	public Response getResponse() {
		return new ResponseHandler();
	}

	public Plugin getTestPlugin() {
		return new TestPlugin();
	}
}
