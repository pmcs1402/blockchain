
package block_chain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class block_chain {

public String getBlockHash() throws NoSuchAlgorithmException {

  MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

  byte[] blockHash = messageDigest.digest(blockHeader.toString().getBytes());
  blockHash = messageDigest.digest(blockHash);

  return new String(blockHash,0,blockHash.length);
}
	
	
	
}


