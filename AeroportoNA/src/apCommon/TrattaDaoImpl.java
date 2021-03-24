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
	public List<Tratta> getTratte(){
		String query = "SELECT * FROM tratte ORDER BY \"dataPartenza\"";
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
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}


	@Override
	public boolean insertTratta(Tratta tratta, String compagnia) {
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
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO tratte VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	        ps.setString(1, tratta.getCittà());
	        ps.setString(2, tratta.getOrarioPartenza());
	        ps.setString(3, tratta.getOrarioArrivo());
	        ps.setString(4, tratta.getDataPartenza());
	        ps.setString(5, tratta.getDataArrivo());
	        ps.setInt(6, tratta.getNumPrenotazioni());
	        ps.setString(7, compagnia);
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
	public boolean updateTratta(Tratta tratta, String stato) {
			connection = Connessione.getConnection();
			String ID = new String();
			ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		    try {
		        PreparedStatement ps = connection.prepareStatement("UPDATE public.tratte SET stato='"+stato+"' WHERE \"IDTratta\"='"+ID+"'");

		        int i = ps.executeUpdate();
		        if(i == 1) 
		        	return true;

		    } catch (SQLException ex) {
		    	return false;
		    }

		    return false;
		    
	}

	@Override
	public boolean updateRitardo(Tratta tratta, String ritardo) {
			connection = Connessione.getConnection();
			String ID = new String();
			ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		    try {
		        PreparedStatement ps = connection.prepareStatement("UPDATE public.tratte SET ritardo='"+ritardo+"' WHERE \"IDTratta\"='"+ID+"'");

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


	@Override
	public List<Tratta> getTratteAttesa() {
		String query = "SELECT \"città\", \"orarioPartenza\", \"orarioArrivo\", \"dataPartenza\", \"dataArrivo\", \"numPrenotazioni\", \"IDTratta\"	FROM public.tratte WHERE stato!='partito' ORDER BY \"dataPartenza\"";
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
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}
	
	@Override
	public List<Tratta> getTrattePartite() {
		String query = "SELECT \"città\", \"orarioPartenza\", \"orarioArrivo\", \"dataPartenza\", \"dataArrivo\", \"numPrenotazioni\", \"IDTratta\"	FROM public.tratte WHERE stato='partito' ORDER BY \"dataPartenza\"";
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
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}
	
	@Override
	public String getRitardo(Tratta tratta) {
		String ritardo = null;
		String ID = new String();
		ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		String query = "SELECT ritardo	FROM public.tratte WHERE \"IDTratta\"='"+ID+"'";
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				ritardo=rs.getString("ritardo");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return ritardo;
	}
	
	@Override
	public String getStato(Tratta tratta) {
		String stato = null;
		String ID = new String();
		ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		String query = "SELECT stato FROM public.tratte WHERE \"IDTratta\"='"+ID+"'";
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				stato=rs.getString("stato");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return stato;
	}
	
	@Override
	public List<String[]> ricerca(String città, String terminal, String gate, String compagnia) {
		List<String[]> list = new ArrayList<String[]>();
		String query = "SELECT * FROM public.tratte, public.gate WHERE \"città\" = '"+città+"'  AND \"terminale\"= '"+terminal+"' AND \"numeroGate\"= '"+gate+"' AND compagnia = '"+compagnia+"'";
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				String[] temp = new String[11];
				temp[0]=rs.getString("città");
				temp[1]=rs.getString("numPrenotazioni");
				temp[2]=rs.getString("orarioPartenza");
				temp[3]=rs.getString("orarioArrivo");
				temp[4]=rs.getString("dataPartenza");
				temp[5]=rs.getString("dataArrivo");
				temp[6]=rs.getString("terminale");
				temp[7]=rs.getString("numeroGate");
				temp[8]=rs.getString("compagnia");
				temp[9]=rs.getString("ritardo");
				temp[10]=rs.getString("stato");
				list.add(temp);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}
	
}
