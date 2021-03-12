package apCommon;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrattaDaoImpl implements TrattaDao {

	private Connection connection;
	private Statement statement;

	@Override
	public List<String> getTratte() throws SQLException {
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


	@Override
	public boolean insertTratta(Tratta tratta) {
		ResultSet rs = null;
		connection = Connessione.getConnection();
		String ID = new String();
	    try {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO user VALUES (?, ?, ?, ?, ?, ?, ?)");
	        ps.setString(1, tratta.getCittà());
	        ps.setString(2, tratta.getOrarioPartenza());
	        ps.setString(3, tratta.getOrarioArrivo());
	        ps.setString(4, tratta.getDataPartenza());
	        ps.setString(5, tratta.getDataArrivo());
	        ps.setInt(6, tratta.getNumPrenotazioni());
	        ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getDataPartenza().substring(0, 2);
	        
	        
	        rs = statement.executeQuery("SELECT * FROM tratte");
			while(rs.next()) {
				if(rs.getString("IDTratta").equals(ID))
					return false;
			}
			
			ps.setString(7, ID);
	        
	        int i = ps.executeUpdate();
	        
	        if(i == 1) 
	        	return true;

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }

	    return false;
		
	}

	@Override
	public boolean updateTratta(Tratta tratta) {
			connection = Connessione.getConnection();
			String ID = new String();
			ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getDataPartenza().substring(0, 2);
		    try {
		        PreparedStatement ps = connection.prepareStatement("UPDATE tratte SET città=?, orarioPartenza=?, orarioArrivo=?, dataPartenza=?,"
		        													+ "dataArrivo=?, numPrenotazioni=?, WHERE IDTratta=?");
		        ps.setString(1, tratta.getCittà());
		        ps.setString(2, tratta.getOrarioPartenza());
		        ps.setString(3, tratta.getOrarioArrivo());
		        ps.setString(4, tratta.getDataPartenza());
		        ps.setString(5, tratta.getDataArrivo());
		        ps.setInt(6, tratta.getNumPrenotazioni());
		        ps.setString(7, ID);

		        int i = ps.executeUpdate();
		        if(i == 1) 
		        	return true;

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }

		    return false;
		    
	}

	@Override
	public boolean deleteTratta(Tratta tratta) {
		connection = Connessione.getConnection();
		String ID = new String();
		ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getDataPartenza().substring(0, 2);
		    try {
		        	Statement stmt = connection.createStatement();
		        	int i = stmt.executeUpdate("DELETE FROM tratte WHERE id=" + ID);

		        	if(i == 1)
		        		return true;
		      
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }

		    return false;
		    
	}

}
