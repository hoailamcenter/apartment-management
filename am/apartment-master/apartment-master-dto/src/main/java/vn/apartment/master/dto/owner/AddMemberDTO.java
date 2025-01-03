package vn.apartment.master.dto.owner;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Schema(name = "Add Member")
public class AddMemberDTO {
    @JsonProperty(value = "birth_day", required = true)
    private Date birthday;

    @JsonProperty(value = "career")
    private String career;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "district")
    private String district;

    @JsonProperty(value = "email", required = true)
    private String email;

    @JsonProperty(value = "first_name", required = true)
    private String firstName;

    @JsonProperty(value = "gender", required = true)
    private Gender gender;

    @JsonProperty(value = "id_card_number", required = true)
    private String idCardNumber;

    @JsonProperty(value = "last_name", required = true)
    private String lastName;

    @JsonProperty(value = "middle_name", required = true)
    private String middleName;

    @JsonProperty(value = "phone_number", required = true)
    private String phoneNumber;

    @JsonProperty(value = "street")
    private String street;

    @JsonProperty(value = "ward")
    private String ward;

    @JsonProperty(value = "household_id", required = true)
    private String householdId;

    public AddMemberDTO() {
        super();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }
}
