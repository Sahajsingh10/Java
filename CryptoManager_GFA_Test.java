public class CryptoManager_GFA_Test {

	public static void main(String[] args) {

		String str1 = "\"THIS TEST SHOULD SUCCEED\"";
		String str4 = "EXAMPLE";
		String str5 = "IFMMP!XPSME";
		String str6 = "©¦­­°?¸°³­¥";


		String good = CryptoManager.encryptBellaso(str4,"CMSC");
		System.out.println(good);
	}
}
