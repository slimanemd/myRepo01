package usine;

//
public class PieceSimple extends Piece {
	//3ieme champs calculé
	private int tempsFabrication;
	
	//
	public PieceSimple(String code, String nom, int tempsFabrication){
		this.setCode(code);
		this.setNom(nom);
		this.tempsFabrication = tempsFabrication;
	}

	//
	@Override
	public int calculerTempsFabrication() {
		return this.tempsFabrication;
	}
	
	@Override
	public String toString() {
		String ts = "[ " + this.getCode() + " , " + this.getNom() + " , " + this.tempsFabrication + " ]";
		return ts;
	}
}
