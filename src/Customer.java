//Getter ve Setter, verilerinizi korumak ve kodunuzu daha güvenli hale getirmek için kullanılan yöntemlerdir.
// Getter değeri (erişimciler) döndürür, int, String, double, float, vb. veri türünün değerini döndürür.
// Programın rahatlığı için alıcı “get” kelimesiyle başlar ve ardından değişken adı gelir.
//Setter değeri ayarlar veya güncellerken (mutatörler). Bir sınıfın programlarında kullanılan
// herhangi bir değişkenin değerini ayarlar. ve “set” kelimesiyle başlar ve ardından değişken ismi gelir.
// Getter ve Setter, programlayıcıyı belirli bir veri türü için değer ayarlama ve alma konusunda
// uygun hale getirir. Hem alıcı hem de ayarlayıcıda, değişkenin ilk harfi büyük olmalıdır.



public class Customer {
    private int id;
    private String customerNumber;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
