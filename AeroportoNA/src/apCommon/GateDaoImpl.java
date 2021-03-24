package apCommon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GateDaoImpl implements GateDao {

	private Connection connection;
	private Statement statement;
	
	@Override
	public List<Gate> getAllGates() throws SQLException {
		String query = "SELECT * FROM gate";
		List<Gate> list = new ArrayList<Gate>();
		ResultSet rs = null;
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				Gate gate = new Gate();
				gate.setNumeroGate(rs.getString("numeroGate"));
				gate.setTerminale(rs.getString("terminale"));
				list.add(gate);
			}
		} finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return list;
	}

	@Override
	public Gate getGate(Tratta tratta) {
		String ID  = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		String query = "SELECT \"numeroGate\", terminale FROM public.gate WHERE tratte ='"+ID+"'";
		ResultSet rs = null;
		Gate gate = new Gate();
		try {
			connection = Connessione.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				gate.setNumeroGate(rs.getString("numeroGate"));
				gate.setTerminale(rs.getString("terminale"));
			}
		}catch (SQLException e) {
				e.printStackTrace();
		}finally {
			Connessione.closeResultSet(rs);
			Connessione.closeStatement(statement);
			Connessione.closeConnection(connection);
		}
		return gate;
	}
	
	public String getTratta(int numeroGate) {
		
		return null;
	}

	@Override
	public boolean updateGate(Gate gate, Tratta tratta) {
		connection = Connessione.getConnection();
		String ID = new String();
		if(tratta!=null)
			ID = tratta.getCittà().substring(0,3)+tratta.getOrarioPartenza().substring(0, 2)+tratta.getOrarioPartenza().substring(3, 5)+tratta.getDataPartenza().substring(0, 2);
		else
			ID = "null";
	    try {
	        PreparedStatement ps = connection.prepareStatement("UPDATE public.gate SET tratte=? WHERE \"numeroGate\"=? AND terminale=?");
	        ps.setString(1, ID);
	        ps.setString(2, gate.getNumeroGate());
	        ps.setString(3, gate.getTerminale());

	        int i = ps.executeUpdate();
	        if(i == 1) 
	        	return true;

	    } catch (SQLException ex) {
	    	return false;
	    }

	    return false;
		
	}

}
