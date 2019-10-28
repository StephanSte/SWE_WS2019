package BIF.SWE1;

import BIF.SWE1.interfaces.Url;

import java.util.HashMap;
import java.util.Map;

public class WebUrl implements Url {

    private String rawUrl;
    private String filename;
    private String path;
    private String extension;
    private Map<String, String> parameters;

    public WebUrl() {this("", "", "", "", new HashMap<>());}

    public WebUrl(String rawUrl, String filename, String path, String extension, Map<String, String> parameters) {
        this.rawUrl = rawUrl;
        this.filename = filename;
        this.path = path;
        this.extension = extension;
        this.parameters = parameters;
    }


    @Override
    public String getRawUrl() {
        return rawUrl;
    }

    @Override
    public String getPath() {
        return path + filename + extension;
    }

    @Override
    public Map<String, String> getParameter() {
        return null;
    }

    @Override
    public int getParameterCount() {
        return parameters.size();
    }

    @Override
    public String[] getSegments() {
        return new String[0];
    }

    @Override
    public String getFileName() {
        return filename;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public String getFragment() {
        return null;
    }
}
