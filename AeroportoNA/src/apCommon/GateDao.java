package apCommon;

import java.sql.SQLException;
import java.util.List;


public interface GateDao {
	public List<Gate> getAllGates() throws SQLException;
    public boolean updateGate(Gate gate, Tratta tratta);
	public Gate getGate(Tratta tratta);

}
