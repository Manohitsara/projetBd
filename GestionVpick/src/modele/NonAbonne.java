package modele;

public class NonAbonne extends Client{
	private Integer codeSecretPrime;
	
	@Override
	public Integer getIdClient() {
		return super.getIdClient();
	}
	
	@Override
	public void setIdClient(Integer idClient) {
		super.setIdClient(idClient);
	}
	public Integer getCodeSecretPrime() {
		return codeSecretPrime;
	}
	public void setCodeSecretPrime(Integer codeSecretPrime) {
		this.codeSecretPrime = codeSecretPrime;
	}
	
	
}
