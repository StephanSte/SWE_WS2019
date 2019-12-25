package BIF.SWE1;

import BIF.SWE1.interfaces.Url;
import BIF.SWE1.URLHandler;
import java.util.Map;

public class UEB1 {

	public Url getUrl(String path) {
		return new URLHandler(path);
	}
	public void helloWorld() {
	}
}
