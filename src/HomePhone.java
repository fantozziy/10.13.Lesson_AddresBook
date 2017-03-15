/**
 * Created by pst on 15.02.2017.
 */
public class HomePhone extends Phone implements IData {

    String city;

    HomePhone(String number, String city) {
        super.number = number;
        this.city = city;
    }

    HomePhone() {

    }

    @Override
    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        super.number = number;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getCity() {
        return city;
    }

    @Override
    public String callAmbulanceNumber() {
        //String call = "Вызов " + fireNumber; оптимизация кода!
        return "Вызов " + fireNumber;
    }

    @Override
    public String callPoliceNumber() {
        return "Вызов " + policeNumber;
    }

    @Override
    public String callFireNumber() {
        return "Вызов " + ambulanceNumber;
    }
}
