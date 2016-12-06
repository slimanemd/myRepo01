package usine;

//
public class PieceComplexe extends Piece {
	//3ieme champs calculé
	private int tempsAssemblage;
	
	//4ieme champs encapsulé
	private Piece[] pieces;
	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	//
	public PieceComplexe(String code, String nom, int tempsAssemblage, Piece[] pieces){
		this.setCode(code);
		this.setNom(nom);
		this.tempsAssemblage = tempsAssemblage;
		this.pieces = pieces;
	}

	//
	@Override
	public int calculerTempsFabrication() {
		int tempsFabrication = this.tempsAssemblage;
		for(int i=0; i<getPieces().length; i++)
			tempsFabrication += this.pieces[i].calculerTempsFabrication();
		return tempsFabrication;
	}
	
	@Override
	public String toString() {
		String ts="";
		for(int i=0; i<getPieces().length; i++)
			ts += this.pieces[i].toString();
		
		ts = "[ " + this.getCode() + " , " + this.getNom() + " , " + this.tempsAssemblage + " , " + this.calculerTempsFabrication() + " , " + ts + " ]";
		return ts;
	}
}
