package usine;

//
public class TestUsine {
	//
	public static void main(String[] args) {
		//ps pour piece simple, pc piece complexe
		
		//ps
		Piece[] pieces = new Piece[6];
		pieces[0] = new PieceSimple("ps01" ,"psn01", 10);
		pieces[1] = new PieceSimple("ps02", "psn02", 20);
		pieces[2] = new PieceSimple("ps03", "psn03", 30);
		pieces[3] = new PieceComplexe("pc01", "pcn01", 10, new Piece[]{ pieces[0], pieces[2]});
		pieces[4] = new PieceComplexe("pc02", "pcn02", 20, new Piece[]{ pieces[1], pieces[2]});
		pieces[5] = new PieceComplexe("pc03", "pcn03", 30, new Piece[]{ pieces[1], pieces[3]});
		
		//
		for (int i = 0; i < pieces.length; i++)
			System.out.println(i +"  " + pieces[i].toString());
	}
}
