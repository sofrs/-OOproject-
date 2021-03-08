package apCommon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import apCommon.Connessione;

public class CompagniaDao {
	private Connection connection;
	private Statement statement;
	
	public CompagniaDao() {
	
	}
	
	public List<Compagnia> getCompagnie() throws SQLException{
		String query = "SELECT * FROM compagnie";
		List<Compagnia> list = new ArrayList<Compagnia>();
		Compagnia compagnia = null;
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				compagnia = new Compagnia();
				compagnia.setNomeCompagnia(rs.getString("nomeComoagnia"));
				compagnia.setWebsite(rs.getString("website"));
				list.add(compagnia);
			}
		} finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}
}
