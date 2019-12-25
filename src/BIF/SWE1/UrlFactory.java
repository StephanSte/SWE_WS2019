package BIF.SWE1;

import BIF.SWE1.interfaces.Url;

import java.util.HashMap;
import java.util.Map;

public class UrlFactory {
    public Url getWebUrl(String url) {
        if(url == null){
            return new WebUrl();
        }

        //url = getHostname(url);
        //url = getFragment(url);
        url = getSplitSegments(url);


        return new WebUrl(url, parsePath(url), parseFilename(url), parseExtension(url), parseParameters(url));
    }


    private String parsePath(String url) {
        if(url != null){
            return url.substring(0,url.lastIndexOf('/'));
        }else{
            return "";
        }
    }

    /**
    * Finds last entry of / in the string which indicates the end of the path
    * and finds the first . which indicates the beginning if the file extension
    * @param url String
    * @return filename of the given url
     * 
     * www.test.com/this.ext
    */

    private String parseFilename(String url) {
        if (url != null) {
            return url.substring(url.lastIndexOf("/"), url.indexOf("."));
        } else{
            return "";
        }
    }

    private String parseExtension(String url) {
        if (url != null) {
            return "." + url.split("\\.")[1].split("\\?")[0];
        } else{
            return "";
        }
        /** an [0] ist das zw Punkt und ?
         * und das wird mit einem Punkt davor zurückgegeben*/
    }

    private Map<String, String> parseParameters(String url) {
        HashMap<String, String> parameters = new HashMap<>();
        if (url == null || !url.contains("?"))
                return parameters;
        String suburl = url.substring(url.lastIndexOf('?') + 1);

        /**splittet jeden parameter der durch ein & getrennt ist
         *  und speichert alle in einen Array und gibt sie in die Hashmap*/

         for(String param : suburl.split("&")){
             parameters.put(param.split("=")[0], param.split("=")[1]);
         }
         return parameters;
    }

    private String getHostname(String url){
            String[] Hostname;
            Hostname = url.split("#");
            System.out.print(Hostname[0]);
            return Hostname[0];
    }

    private String getFragment(String url){
            String[] Hostname;
            Hostname = url.split("#");
            System.out.print(Hostname[1]);
            return Hostname[1];
    }
    private String getSplitSegments(String url){
        String[] Hostname;
        String suburl;
        suburl = "";
        if(url.substring(1, url.length()) == "/"){
            suburl = url.substring(1, url.length());
        }

        Hostname = suburl.split("/");
            for (int i = 0; i < Hostname.length; i++){
                System.out.print(Hostname[i]+ ".\n");
            }
            String returnValue = null;
            returnValue = Hostname.toString();
            return returnValue;
            //returnValue und ohne String[] nur String
            //return Hostname and add to private : String[];
    }
}
