package apCommon;

import java.util.List;

import apViews.AMain.IDTratta;

public interface TrattaDao {
	public List<Tratta> getAllTratte();
	public Tratta getTratta(IDTratta IDtratta);
	public void updateTratta(Tratta tratta);
	public void deleteTratta(Tratta tratta);
}
