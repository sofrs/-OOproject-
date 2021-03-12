package apCommon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import apCommon.Connessione;

public interface CompagniaDao {
	public List<Compagnia> getAllCompagnie() throws SQLException;
    //public Gate getGate(int numeroGate);
    //public void updateGate(Gate gate);
    //public void deleteGate(Gate gate);
}
