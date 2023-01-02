package testApplience;

public class Appliance {
	protected String name;
	protected  String brand;
	protected String applianceType;
	protected Boolean isEnabled;
	public Appliance(String name,String brand,  String applianceType) {
		this.name=name;
		this.brand=brand;
		this.isEnabled=isEnabled;
		this.applianceType=applianceType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public Boolean getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public void test() {
		if (isEnabled==true) {
			System.out.println("Passed");
		}
		System.out.println("Failed");
		
	}
	
	
	
	
	
}
