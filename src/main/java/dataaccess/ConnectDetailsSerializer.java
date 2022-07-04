package dataaccess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ConnectDetailsSerializer {
	// ConnectionDetails jvConn = new ConnectionDetails("jdbc:mysql://localhost:3306/jeuxvideo","java","FS0ZEHzh");
	public static ConnectionDetails getConnectionDetails()
			throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		return gson.fromJson(new FileReader("JeuxVideoDBConnection.json"), ConnectionDetails.class);
	}
}
