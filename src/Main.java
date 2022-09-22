//Main = Java programının yürütülmesini başlatması için başlangıç noktasıdır.

//Java İçin İsimlendirme Kuralları
//Java dilinde isimlendirmeler için bazı standartlar oluşturulmuştur.
//Sınıflar: Sınıflar için Upper Camel Case kullanılır.
//Örnek: HelloWorld
//Methodlar: Methodlar için lower camel case kullanılır.
//Örnek: helloWorld
//Değişkenler: Değişkenler için lower camel case kullanılır.
//Örnek: helloWorld

public class Main {
    public static void main(String[] args) {
      Product product1 =  new Product();

      //set value deger atama
      product1.setName("Delonghi Kahve Makinesi");
      product1.setUnitPrice(7500);
      product1.setDiscount(7);
      product1.setUnitInstock(3);
      product1.setImageUrl("bilmemne.jpg");

      //get okuma
      //System.out.println(product1.name)
      Product product2 =  new Product();
      product2.setName("Kitchen Kahve Makinesi");
      product2.setUnitPrice(7500);
      product2.setDiscount(7);
      product2.setUnitInstock(3);
      product2.setImageUrl("bilmemne.jpg");


      Product product3 =  new Product();
      product3.setName("Delonghi Kahve Makinesi");
      product3.setUnitPrice(7500);
      product3.setDiscount(7);
      product3.setUnitInstock(3);
      product3.setImageUrl("bilmemne.jpg");

        Product [] products={product1,product2,product3};

        System.out.println("<ul>");


      for (Product product: products) {
        System.out.println("<li>" +product.getName() +"</li>");
      }
      System.out.println("</ul>");

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("TULAY");
        individualCustomer.setLastName("KECECİ");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setTaxNumber("1111");
        corporateCustomer.setPhone("5333333333");
        corporateCustomer.setCustomerNumber("2345");

        //Tümünü bir yerde tutmak istediğimizde Customer Array ekleyebiliriz. Bu array içinde sadece müşteri türünde değerler tutabiliriz.
        Customer[] customers= {corporateCustomer,individualCustomer};

    }
}
