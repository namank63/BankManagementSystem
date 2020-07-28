
class User {

    private int Money;
    private String Name, Aadhar, Father, Mother, Gender, DOB, Caste, Religion, Street, Area, District, City, Pincode, State, Mobile, Email, Account;

    public User(int Money, String Name, String Aadhar, String Father, String Mother, String Gender, String DOB, String Caste, String Religion, String Street, String Area, String District, String City, String Pincode, String State, String Mobile, String Email, String Account) {
        this.Money = Money;
        this.Name = Name;
        this.Aadhar = Aadhar;
        this.Father = Father;
        this.Mother = Mother;
        this.Gender = Gender;
        this.DOB = DOB;
        this.Caste = Caste;
        this.Religion = Religion;
        this.Street = Street;
        this.Area = Area;
        this.District = District;
        this.City = City;
        this.Pincode = Pincode;
        this.State = State;
        this.Mobile = Mobile;
        this.Email = Email;
        this.Account = Account;
    }

    public String getAadhar() {
        return Aadhar;
    }

    public int getMoney() {
        return Money;
    }

    public String getName() {
        return Name;
    }

    public String getFather() {
        return Father;
    }

    public String getMother() {
        return Mother;
    }

    public String getGender() {
        return Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public String getCaste() {
        return Caste;
    }

    public String getReligion() {
        return Religion;
    }

    public String getStreet() {
        return Street;
    }

    public String getArea() {
        return Area;
    }

    public String getDistrict() {
        return District;
    }

    public String getCity() {
        return City;
    }

    public String getPincode() {
        return Pincode;
    }

    public String getState() {
        return State;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public String getAccount() {
        return Account;
    }
}
