import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class sdz {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.android.com/");
		 HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	        try {
	            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
	            String sn= readStream(in);
	            System.out.print(sn);
	        }
	            finally {
	                urlConnection.disconnect();
	            }
	}

	private static String readStream(InputStream is) throws IOException {
		    StringBuilder sb = new StringBuilder();  
		    BufferedReader r = new BufferedReader(new InputStreamReader(is),1000);  
		    for (String line = r.readLine(); line != null; line =r.readLine()){  
		        sb.append(line);  
		    }  
		    is.close();  
		    return sb.toString();
	};

}
