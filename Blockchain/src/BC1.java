//Código combinado de Kass en https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa
//combinado con el mío de Daniel Lepe Vega


import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class BC1 {

	public static ArrayList<Block> blockchain = new ArrayList<Block>(); 
	
	public BC1() {
		
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		blockchain.add(new Block("Primer Bloque", "0"));		
		blockchain.add(new Block("Segundo Bloque",blockchain.get(blockchain.size()-1).hash)); 
		blockchain.add(new Block("Tercer Bloque",blockchain.get(blockchain.size()-1).hash));
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);		
		System.out.println(blockchainJson);
		System.out.println(BC1.isChainValid());
		}

	
}
