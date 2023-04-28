<h5 align="center"><img src="https://miro.medium.com/v2/resize:fit:640/format:webp/1*ln3WCrAhqC7QT4TwXkc9Aw.png"/></h5>   

<h2 style="text-decoration:underline;"><u>Selenide</u></h2>

Selenide, web uygulamaları için bir test otomasyon aracıdır. Selenide, Java ve Kotlin gibi JVM tabanlı dillerde yazılmıştır ve Selenium WebDriver'ın üzerine inşa edilmiştir.

Selenide, web sayfalarını test etmek için kullanıcı dostu bir API sağlar. Bu API, web sayfalarındaki öğeleri (elementler) bulmak için CSS ve XPath kullanır ve basit bir şekilde elemanlara tıklama, yazma ve okuma gibi işlemleri gerçekleştirmeyi sağlar.

Selenide ayrıca, özellikle dinamik web sayfalarında testlerin yazılmasını kolaylaştırmak için bazı özellikler sunar. Örneğin, AJAX çağrıları tamamlandıktan sonra beklemek için özel bir yöntem sağlar. Ayrıca, ekran görüntüsü (screenshot) alma ve dosya yükleme gibi yaygın işlemleri de kolaylaştırır.

Selenide, Java geliştiricileri tarafından kullanılan popüler bir test otomasyon aracıdır ve açık kaynak kodlu olarak dağıtılmaktadır.

<h2 style="text-decoration:underline;">Selenide - Selenium</h2>

Selenide ve Selenium, web uygulamalarının test edilmesi için kullanılan iki popüler test otomasyon aracıdır. Hangi aracın tercih edilmesi gerektiği, bir dizi faktöre bağlıdır.

Selenide, Selenium WebDriver'ın üzerine inşa edilmiş bir araçtır ve daha kullanıcı dostu bir API sağlar. Selenide, web sayfalarındaki öğeleri bulmak için CSS ve XPath gibi seçicileri kullanır ve basit bir API aracılığıyla elemanlara tıklama, yazma ve okuma gibi işlemleri gerçekleştirmenizi sağlar. Dinamik web sayfalarında test senaryolarının yazılmasını kolaylaştıran özelliklere de sahiptir.

Selenium, daha gelişmiş özelliklere sahiptir ve daha fazla seçenek sunar. Örneğin, farklı tarayıcılar üzerinde test yapmak için WebDriver'lar sunar. Selenium, daha düşük seviyeli bir API'ye sahip olduğu için, programlama tecrübesi daha fazla olan geliştiricilerin tercih ettiği bir araçtır.

Sonuç olarak, hangi aracın tercih edilmesi gerektiği, özellikle uygulama ihtiyaçlarına, tecrübeye ve kişisel tercihlere bağlıdır. Başlangıç seviyesindeki kullanıcılar için Selenide, daha kullanıcı dostu bir API'ye sahip olduğu için tercih edilebilir. Ancak, daha gelişmiş senaryoların test edilmesi gerektiğinde, Selenium'un daha fazla seçenek sunması avantajlı olabilir.

<h2 style="text-decoration:underline;"><u>Selenide'de Fluent Interface</u></h2>

Fluent Interface, Selenide'in özelliklerinden biridir ve test senaryolarının daha okunaklı ve anlaşılır hale gelmesine yardımcı olur. Bu özellik, Selenide'in Selenium'dan farklılaşmasını sağlar.

Fluent Interface, bir nesne yönelimli programlama (Object-Oriented Programming) tasarım desenidir. Bu desen, bir nesnenin yöntemlerinin ardışık olarak çağrılmasına olanak tanır. Bu sayede, kod okunaklığı artar ve kullanıcılar daha az hata yaparlar.

Selenide'de Fluent Interface, web sayfasındaki elementlere erişmek ve elementler üzerinde işlemler yapmak için kullanılır. Örneğin, aşağıdaki örnek kodda, Fluent Interface kullanarak bir web sayfasındaki bir arama kutusuna tıklanmış ve bir kelime yazılmıştır:

![image](https://user-images.githubusercontent.com/99203167/234392507-605a73f5-df10-489b-bbe2-e9825d099d18.png)


Bu kodda, '$' sembolü, bir elementi tanımlamak için kullanılan Selenide metodu, By nesnesi ise elementi tanımlamak için kullanılan bir seçicidir. .click() ve .sendKeys() ise, element üzerinde yapılacak eylemlerdir.

Fluent Interface, kodun daha okunaklı ve anlaşılır hale gelmesini sağlar. Bu özellik sayesinde, test senaryoları daha kolay yazılır ve yönetilir. Ayrıca, kodun bakımı daha kolay hale gelir ve hata ayıklama işlemi daha hızlı yapılır.
