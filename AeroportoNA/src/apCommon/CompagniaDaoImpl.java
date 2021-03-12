package apCommon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class CompagniaDaoImpl implements CompagniaDao {
	
	private Connection connection;
	private Statement statement;
	
	@Override
	public List<Compagnia> getAllCompagnie() throws SQLException {
		String query = "SELECT * FROM compagnie";
		List<Compagnia> list = new ArrayList<Compagnia>();
		ResultSet rs = null;
		Compagnia compagnia = new Compagnia();
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println("bruh");
				compagnia.setNomeCompagnia(rs.getString("nomeCompagnia"));
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

	/*@Override
	public Compagnia getCompagnie(String nomeCompagnia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompagnia(Compagnia compagnia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompagnia(Compagnia compagnia) {
		// TODO Auto-generated method stub
		
	}*/

	
	

}
