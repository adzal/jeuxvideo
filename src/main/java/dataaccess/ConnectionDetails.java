package dataaccess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ConnectionDetails {
	private String url;
	private String userName;
	private String password;
}
