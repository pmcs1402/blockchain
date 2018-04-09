import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class BlockchainDriver {


	  List<block> blockchain = new ArrayList<block>();

	  public static void main(String[] args) throws NoSuchAlgorithmException {

	    // Genesis block
	    String[] transactions = {"Hosang sent 1k Bitcoins to Zuckerberg."};
	    block genesisBlock = new block(new BlockHeader(null, transactions), transactions);
	    System.out.println("Block Hash : " + genesisBlock.getBlockHash());

	    // Transaction Forgery
	    transactions[0] = "Hosang sent 10k Bitcoins to Zuckerberg.";
	    genesisBlock = new block(new BlockHeader(null, transactions), transactions);
	    System.out.println("Block Hash : " + genesisBlock.getBlockHash());

	  }
}
