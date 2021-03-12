package apCommon;

import java.sql.SQLException;
import java.util.List;


public interface GateDao {
	public List<Gate> getAllGates() throws SQLException;
    public Gate getGate(int numeroGate);
    public void updateGate(Gate gate);
    public void deleteGate(Gate gate);

}
