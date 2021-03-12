package apCommon;

import java.sql.Connection;
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
	public Gate getGate(int numeroGate) {
		
		return null;
	}

	@Override
	public void updateGate(Gate gate) {
		
		
	}

	@Override
	public void deleteGate(Gate gate) {
		
		
	}

}
