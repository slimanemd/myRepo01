package usine;

//
public abstract class Piece {
	//1ier champs encapsulé
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	//2ieme champs encapsulé
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//
	public abstract int calculerTempsFabrication(); 
//	{
//		return 0;
	//};
}
