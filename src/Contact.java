/**
 * Created by pst on 15.02.2017.
 */
public class Contact {

    String name;
    String surname;
    HomePhone homePhone;
    MobilePhone mobilePhone;

    Contact(String name, String surname, HomePhone homePhone, MobilePhone mobilePhone) {
        this.name = name;
        this.surname = surname;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }

    Contact() {}

    void getInformation() {
        System.out.println("Фамилия: " + surname + "Имя: " + name);
        System.out.println("Город: " + homePhone.getCity());
        System.out.println("Городской телефон: " + homePhone.getNumber());
        System.out.println("Мобильный оператор: " + mobilePhone.getOperator());
        System.out.println("Мобильный телефон: " + mobilePhone.getNumber());
    }

    @Override
    public String toString() {
         return " Фамилия: " + surname + "Имя: " + name + "Город: " + homePhone.getCity() +
                 " Городской телефон: " + homePhone.getNumber()+
                 " Мобильный оператор: " + mobilePhone.getOperator() +
                 " Мобильный телефон: " + mobilePhone.getNumber();
    }
}
