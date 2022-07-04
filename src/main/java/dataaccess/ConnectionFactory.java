package dataaccess;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ConnectionFactory {
	ConnectionDetails connectionDetails;
	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			this.connectionDetails = ConnectDetailsSerializer.getConnectionDetails();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionDetails.getUrl(),
				connectionDetails.getUserName(),
				connectionDetails.getPassword());
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}