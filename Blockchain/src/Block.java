//Código combinado de Kass en https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa
//combinado con el mío de Daniel Lepe Vega

import java.util.Date;

public class Block {

	public String hash;
	public String previousHash;
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.

	//Block Constructor.
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				data 
				);
		return calculatedhash;
	}
	
	public static void main(String[] args) {
		
		Block genesisBlock = new Block("Primer Bloque", "0");
		System.out.println("Título para bloque 1 : " + genesisBlock.hash);
		
		Block secondBlock = new Block("Segundo Bloque",genesisBlock.hash);
		System.out.println("Título para bloque 2 : " + secondBlock.hash);
		
		Block thirdBlock = new Block("Tercer Bloque",secondBlock.hash);
		System.out.println("Título para bloque 3 : " + thirdBlock.hash);
		
	}
}
