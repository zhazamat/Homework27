import java.util.Date;

public class Actor {
   private Integer id;
   private String firstName;
   private String lastName;
   private Date birthDate;
   private String bio;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Date getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
   }

   public String getBio() {
      return bio;
   }

   public void setBio(String bio) {
      this.bio = bio;
   }

   public String fullName() {
      return getFirstName() + " " + getLastName();
   }

   @Override
   public String toString() {
      return String.format("|%3s", id) + String.format("|%20s", fullName()) + String.format("|%32s", birthDate) + String.format("|%10s", bio);
   }


}
