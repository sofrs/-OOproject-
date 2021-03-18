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
	public List<Tratta> getTratte() throws SQLException {
		String query = "SELECT * FROM tratte";
		List<Tratta> list = new ArrayList<Tratta>();
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				Tratta tratta = new Tratta();
				tratta.setCittà(rs.getString("città"));
				tratta.setOrarioPartenza(rs.getString("orarioPartenza"));
				tratta.setOrarioArrivo(rs.getString("orarioArrivo"));
				tratta.setDataPartenza(rs.getString("dataPartenza"));
				tratta.setDataArrivo(rs.getString("dataArrivo"));
				tratta.setNumPrenotazioni(rs.getInt("numPrenotazioni"));
				list.add(tratta);
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
		String query = "SELECT * FROM tratte";
		String ID = new String();
		
    	try {
    		connection = Connessione.getConnection();
			statement = connection.createStatement();
		} catch (SQLException e) {
			return false;
		}
    	
	    try {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO tratte VALUES (?, ?, ?, ?, ?, ?, ?)");
	        ps.setString(1, tratta.getCittà());
	        ps.setString(2, tratta.getOrarioPartenza());
	        ps.setString(3, tratta.getOrarioArrivo());
	        ps.setString(4, tratta.getDataPartenza());
	        ps.setString(5, tratta.getDataArrivo());
	        ps.setInt(6, tratta.getNumPrenotazioni());
	        try {
	        	ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
	        }catch(StringIndexOutOfBoundsException e) {
	        	return false;
	        }
	        
	        rs = statement.executeQuery(query);
			while(rs.next()) {
				if(rs.getString("IDTratta").equals(ID))
					return false;
			}
			
			ps.setString(7, ID);
	        
	        int i = ps.executeUpdate();
	        
	        if(i == 1) 
	        	return true;

	    } catch (SQLException ex) {
	        return false;
	    } finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
	    
	    return false;
	}

	@Override
	public boolean updateTratta(Tratta tratta) {
			connection = Connessione.getConnection();
			String ID = new String();
			ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
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
		    	return false;
		    }

		    return false;
		    
	}

	@Override
	public boolean deleteTratta(Tratta tratta) {
		connection = Connessione.getConnection();
		String ID = new String();
		ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		System.out.println(ID);
		    try {
		        	Statement stmt = connection.createStatement();
		        	int i = stmt.executeUpdate("DELETE FROM public.tratte WHERE \"IDTratta\"='" + ID+"'");

		        	if(i == 1)
		        		return true;
		      
		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }

		    return false;
		    
	}

}
