package apCommon;

import java.util.List;


public interface GateDao {
	public List<Gate> getAllGates();
    public Gate getGate(int numeroGate);
    public void updateGate(Gate gate);
    public void deleteGate(Gate gate);

}
