package apCommon;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import apCommon.Connessione;

public class TrattaDaoImpl implements TrattaDao {

	private Connection connection;
	private Statement statement;
	
	@Override
	public List<String> getAllCittà() throws SQLException{
		String query = "SELECT * FROM tratte";
		List<String> list = new ArrayList<String>();
		ResultSet rs = null;
		String città = new String();
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				città= rs.getString("città");
				list.add(città);
			}
		} finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}

	//@Override
	//public Tratta getTratta(IDTratta IDtratta) {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public void updateTratta(Tratta tratta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTratta(Tratta tratta) {
		// TODO Auto-generated method stub
		
	}

}
