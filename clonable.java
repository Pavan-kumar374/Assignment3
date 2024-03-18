class Organization implements Cloneable {
  private String organizationCode;
  private String organizationName;
  private Address organizationAddress;

  public Organization(String organizationCode, String organizationName, Address organizationAddress) {
    this.organizationCode = organizationCode;
    this.organizationName = organizationName;
    this.organizationAddress = organizationAddress;
}

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public void printDetails() {
    System.out.println("Organization Code: " + organizationCode);
    System.out.println("Organization Name: " + organizationName);
    System.out.println("Organization Address: ");
    organizationAddress.printAddress();
  }
}