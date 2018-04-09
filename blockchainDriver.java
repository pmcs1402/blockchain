import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class BlockchainDriver {


	  List<block> blockchain = new ArrayList<block>();

	  public static void main(String[] args) throws NoSuchAlgorithmException {

	    // init block
	    String[] transactions = {"User Park sent 1 Bitcoins to User James."};
	    block genesisBlock = new block(new BlockHeader(null, transactions), transactions);
	    System.out.println("Block Hash : " + genesisBlock.getBlockHash());

	    // Transaction Forgery
	    transactions[0] = "User A sent 10 Bitcoins to User B.";
	    genesisBlock = new block(new BlockHeader(null, transactions), transactions);
	    System.out.println("Block Hash : " + genesisBlock.getBlockHash());

	  }
}
