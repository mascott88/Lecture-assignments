package exceptions;

public class BusinessException {

	public boolean isValidPassportNumber(String passportNum) throws InvalidPassportException {
		if(!passportNum.matches("[cC][0-9A-Za-z]{6,9}")) {
			throw new InvalidPassportException("Invalid Passport# (" + passportNum +")");
		}
		return true;
	}
	
	String wyomingDL = "(.*[0-9]){8}";
	String wisconsinDL = "[A-Za-z][0-9]{13}";
	String westVirginiaDL = "[0-9]{7}|[A-Za-z]{1,2}[0-9]{5,6}";
	String washingtonDL = "[0-9]{1,7}[0-9A-za-z*]{12}";
	String virginiaDL = "[A-Za-z][0-9]{8,11}|[0-9]{9}";
	String vermontDL = "[0-9]{8}|[0-9]{7}[Aa]";
	String utahDL = "[0-9]{4,10}";
	String texasDL = "[0-9]{7,8}";
	String tennesseeDL= "[0-9]{7,9}";
	String southDakotaDL = "[0-9]{6,10}|[0-9]{12}";
	String southCarolinaDL = "[0-9]{5,11}";
	String rhodeIslandDL = "[0-9]{7}|[A-Za-z][0-9]{6}";
	String pennsylvaniaDL = "[0-9]{8}";
	String oregonDL = "[0-9]{1,9}";
	String oklahomaDL = "[A-Za-z]{9}|[0-9]{9}";
	String ohioDL = "[A-Za-z]{4,8}|[A-Za-z]{2}[0-9]{3,7}|[0-9]{8}";
	String northDakotaDL = "[A-Za-z]{3}[0-9]{6}|[0-9]{9}"; 	
	String northCarolinaDL = "[0-9]{1,12}";
	String newYorkDL = "[A-Za-z][0-9]{7}|[A-Za-z][0-9]{18}|[0-9]{8,9}|[0-9]{16}|[A-Za-z]{8}";
	String newMexicoDL = "[0-9]{8,9}";
	String newJerseyDL = "[A-Za-z][0-9]{14}";
	String newHampshireDL = "[0-9]{2}[A-Za-z]{3}[0-9]{5}";
	String nevadaDL = "[0-9]{9,10}|[0-9]{12}|[Xx][0-9]{8}";
	String nebraskaDL = "[A-Za-z]{6,8}";
	String montanaDL = "[A-Za-z][0-9]{8}|[0-9]{13}|[0-9]{9}|[0-9]{14}";
	String missouriDL = "[A-Za-z][0-9]{5,9}|[A-Za-z][0-9]{6}[Rr]|[0-9]{8}[A-Za-z]{2}|[0-9]{9}[A-Za-z]|[0-9]{9}";
	String mississippiDL = "[0-9]{9}";
	String minnesotaDL = "[A-Za-z][0-9]{12}";
	String michiganDL = "[A-Za-z][0-9]{10}|[A-Za-z][0-9]{12}";
	String massachusettsDL = "[A-Za-z][0-9]{8,9}";
	String marylandDL = "[0-9]{12}";
	String maineDL = "[0-9]{7,8}|[0-9]{7}[A-Za-z]";
	String louisianaDL = "[0-9]{1,9}";
	String kentuckyDL = "[A-Za-z][0-9]{8}|[A-Za-z][0-9]{9}|[0-9]{9}";
	String kansasDL = "[A-Za-z][0-9][A-Za-z][0-9][A-Za-z]|[A-Za-z][0-9]{8,9}";
	String iowaDL = "[0-9]{9}|[0-9]{3}[A-Za-z]{2}[0-9]{4}";
	String indianaDL = "[A-Za-z][0-9]{9}|[0-9]{9,10}";
	String illinoisDL = "[A-Za-z][0-9]{11,12}";
	String idahoDL = "[A-Za-z]{2}[0-9]{6}|[A-Za-z]{9}";
	String hawaiiDL = "[A-Za-z][0-9]{8}|[0-9]{9}";
	String georgiaDL = "[0-9]{7,9}";
	String floridaDL = "[A-Za-z][0-9]{12}";
	String districtOfColumbiaDL = "[0-9]{7}|[0-9]{9}";
	String delawareDL = "[0-9]{1,7}";
	String conneticutDL = "[0-9]{9}";
	String coloradoDL = "[0-9]{9}|[A-Za-z][0-9]{3,6}|[A-Za-z]{2}[0-9]{2,5}";
	String californiaDL = "[A-Za-z][0-9]{7}";
	String arkansasDL = "[0-9]{4,9}";
	String arizonaDL = "[A-Za-z][0-9]{8,9}";
	String alaskaDL = "[0-9]{7}";
	String alabamaDL = "[0-9]{1,8}";
	public boolean isValidDriversLicenseNumber(String dlNum) throws InvalidDriversLicenseException {
		if(!dlNum.matches(alabamaDL) && !dlNum.matches(alaskaDL) && !dlNum.matches(arizonaDL) && !dlNum.matches(arkansasDL) && !dlNum.matches(californiaDL) 
				&& !dlNum.matches(coloradoDL) && !dlNum.matches(conneticutDL) && !dlNum.matches(delawareDL) && !dlNum.matches(districtOfColumbiaDL) && 
				!dlNum.matches(floridaDL) && !dlNum.matches(georgiaDL) && !dlNum.matches(hawaiiDL) && !dlNum.matches(idahoDL) && !dlNum.matches(illinoisDL) && 
				!dlNum.matches(indianaDL) && !dlNum.matches(iowaDL) && !dlNum.matches(kansasDL) && !dlNum.matches(kentuckyDL) && !dlNum.matches(louisianaDL) && 
				!dlNum.matches(maineDL) && !dlNum.matches(marylandDL) && !dlNum.matches(massachusettsDL) && !dlNum.matches(michiganDL) && !dlNum.matches(minnesotaDL) && 
				!dlNum.matches(mississippiDL) && !dlNum.matches(missouriDL) && !dlNum.matches(montanaDL) && !dlNum.matches(nebraskaDL) && !dlNum.matches(nevadaDL) && 
				!dlNum.matches(newHampshireDL) && !dlNum.matches(newJerseyDL) && !dlNum.matches(newMexicoDL) && !dlNum.matches(newYorkDL) && !dlNum.matches(northCarolinaDL) && 
				!dlNum.matches(northDakotaDL) && !dlNum.matches(ohioDL) && !dlNum.matches(oklahomaDL) && !dlNum.matches(oregonDL) && !dlNum.matches(pennsylvaniaDL) && 
				!dlNum.matches(rhodeIslandDL) && !dlNum.matches(southCarolinaDL) && !dlNum.matches(southDakotaDL) && !dlNum.matches(tennesseeDL) && !dlNum.matches(texasDL) && 
				!dlNum.matches(utahDL) && !dlNum.matches(vermontDL) && !dlNum.matches(virginiaDL) && !dlNum.matches(westVirginiaDL) && 
				!dlNum.matches(wisconsinDL) && !dlNum.matches(washingtonDL) && !dlNum.matches(wyomingDL)) {
			throw new InvalidDriversLicenseException("Invalid Drivers License# ("+dlNum+")");
		}
		return true;
	}
}