<h1>🎥 Cinema Registration System</h1>
<p>
   <strong>Cinema Registration System</strong> is a console-based application developed in Java to manage cinemas, customers, movies, and theaters. The system allows administrators to add movies, customers, and theaters, assign movies to theaters, and register customers for specific movies. It provides an efficient way to organize and track cinema-related activities.
</p>

<h2>🛠️ Features</h2>
<ul>
   <li> Add new movies with details like name, duration, and genre.</li>
   <li> Register new customers with their name, surname, and phone number.</li>
   <li> Create theaters with a specified capacity and assign movies to them.</li>
   <li> Register customers for movies and list their details.</li>
   <li> View movie details and the theaters where they are being played.</li>
</ul>

<h2>⚙️ Technical Details</h2>
<ul>
   <li> Developed in <strong>Java</strong> using object-oriented programming principles.</li>
   <li> Utilizes <code>interfaces</code>, <code>inheritance</code>, and <code>abstraction</code>.</li>
   <li> Data is stored in <code>in-memory lists</code> for simplicity and ease of access.</li>
</ul>

<h2>🚀 How to Use</h2>
<ol>
   <li> Run the application in a Java IDE or terminal.</li>
   <li> Navigate through the menu to perform the following actions:</li>
   <ul>
      <li>Add new movies.</li>
      <li>Register customers and assign them to movies.</li>
      <li>Create theaters and assign movies to them.</li>
      <li>View movie and theater details or list customers for a theater.</li>
   </ul>
   <li> Exit the application when finished.</li>
</ol>

<h2>📂 Project Structure</h2>
<p>The project is structured as follows:</p>
<ul>
   <li>
      <strong>BaseEntity (Abstract Class):</strong>  
      Represents the base class for all entities (e.g., customers, theaters). Includes:
      <ul>
         <li><code>id</code>: Unique identifier for each entity.</li>
         <li><code>name</code>: Name of the entity.</li>
         <li><code>showInfo()</code>: Abstract method for displaying entity information.</li>
      </ul>
   </li>
   <li>
      <strong>IRegistration (Interface):</strong>  
      Provides methods to manage customers, including:
      <ul>
         <li><code>addCustomer(Customer customer)</code>: Adds a new customer.</li>
         <li><code>listCustomers()</code>: Lists registered customers.</li>
      </ul>
   </li>
   <li>
      <strong>Customer (Class):</strong>  
      Extends <code>BaseEntity</code> to represent customers. Additional attributes include:
      <ul>
         <li><code>phoneNumber</code>: Customer's contact number.</li>
         <li><code>surname</code>: Customer's last name.</li>
      </ul>
      Implements <code>showInfo()</code> to display customer details.
   </li>
   <li>
      <strong>Movie (Class):</strong>  
      Implements <code>IRegistration</code> to manage customers for specific movies. Includes:
      <ul>
         <li><code>name</code>: Movie title.</li>
         <li><code>duration</code>: Movie duration in minutes.</li>
         <li><code>genre</code>: Movie genre.</li>
         <li><code>customers</code>: List of customers registered for the movie.</li>
      </ul>
   </li>
   <li>
      <strong>Theater (Class):</strong>  
      Extends <code>BaseEntity</code> and implements <code>IRegistration</code>. Features:
      <ul>
         <li><code>capacity</code>: Maximum seating capacity.</li>
         <li><code>playingMovie</code>: Currently assigned movie.</li>
         <li><code>customers</code>: Customers registered for the theater.</li>
      </ul>
      Includes <code>assignMovie(Movie movie)</code> to assign a movie to the theater.
   </li>
   <li>
      <strong>Main Class:</strong>  
      Provides the menu-driven interface to interact with the system. Allows users to:
      <ul>
         <li>Add movies, customers, and theaters.</li>
         <li>Register customers for movies.</li>
         <li>Assign movies to theaters.</li>
         <li>View movie and theater details or list customers.</li>
      </ul>
   </li>
</ul>

<h2>👨‍💻 Author</h2> <p> This project was created by <strong>Umut Kerim ACAR (ukerma)</strong>. </p>

<h1>📜 Açıklama (Türkçe)</h1>
<p>
   <strong>Cinema Registration System</strong>, sinemaları, müşterileri, filmleri ve sinema salonlarını yönetmek için Java ile geliştirilmiş bir konsol tabanlı uygulamadır. Sistem, yöneticilere film, müşteri ve sinema salonu ekleme, filmleri sinema salonlarına atama ve belirli filmler için müşterileri kaydetme imkanı sunar. Sinema ile ilgili etkinlikleri düzenlemek ve takip etmek için verimli bir yol sağlar.
</p>

<h2>🛠️ Özellikler</h2>
<ul>
   <li> Film adı, süresi ve türü gibi detaylarla yeni filmler ekleme.</li>
   <li> Müşterileri ad, soyad ve telefon numarasıyla kaydetme.</li>
   <li> Belirli bir kapasiteye sahip sinema salonları oluşturma ve filmleri bu sinema salonlarına atama.</li>
   <li> Müşterileri filmlere kaydetme ve detaylarını listeleme.</li>
   <li> Filmlerin detaylarını ve oynatıldığı sinema salonlarını görüntüleme.</li>
</ul>

<h2>⚙️ Teknik Detaylar</h2>
<ul>
   <li> Nesne yönelimli programlama prensiplerini kullanan <strong>Java</strong> ile geliştirildi.</li>
   <li> <code>Arabirim</code>, <code>kalıtım</code> ve <code>soyutlama</code> yapılarından faydalanır.</li>
   <li> Veriler, basitlik ve erişim kolaylığı için <code>bellek içi listelerde</code> saklanır.</li>
</ul>

<h2>🚀 Nasıl Kullanılır</h2>
<ol>
   <li> Uygulamayı bir Java IDE'sinde veya terminalde çalıştırın.</li>
   <li> Menü üzerinden aşağıdaki işlemleri gerçekleştirin:</li>
   <ul>
      <li>Yeni filmler ekleyin.</li>
      <li>Müşterileri kaydedin ve onları filmlere atayın.</li>
      <li>Sinema salonları oluşturun ve filmleri sinema salonlarına atayın.</li>
      <li>Film ve sinema salonu detaylarını görüntüleyin veya bir sinema salonlarına kayıtlı müşterileri listeleyin.</li>
   </ul>
   <li> İşlem bitince uygulamadan çıkın.</li>
</ol>

<h2>📂 Proje Yapısı</h2>
<p>Proje şu sınıflardan oluşmaktadır:</p>
<ul>
   <li>
      <strong>BaseEntity (Soyut Sınıf):</strong>  
      Tüm varlıklar için temel sınıf. Şunları içerir:
      <ul>
         <li><code>id</code>: Benzersiz kimlik numarası.</li>
         <li><code>name</code>: Varlığın adı.</li>
         <li><code>showInfo()</code>: Varlık bilgilerini gösteren soyut metod.</li>
      </ul>
   </li>
   <li>
      <strong>IRegistration (Arayüz):</strong>  
      Müşteri yönetimi için gerekli metotları sağlar:
      <ul>
         <li><code>addCustomer(Customer customer)</code>: Yeni müşteri ekler.</li>
         <li><code>listCustomers()</code>: Kayıtlı müşterileri listeler.</li>
      </ul>
   </li>
   <li>
      <strong>Customer (Sınıf):</strong>  
      <code>BaseEntity</code> sınıfından türetilmiştir. Ek özellikler:
      <ul>
         <li><code>phoneNumber</code>: Müşteri telefon numarası.</li>
         <li><code>surname</code>: Müşteri soyadı.</li>
      </ul>
      <code>showInfo()</code> metodu müşteri bilgilerini yazdırır.
   </li>
   <li>
      <strong>Movie (Sınıf):</strong>  
      <code>IRegistration</code> arayüzünü uygular. Şunları içerir:
      <ul>
         <li><code>name</code>: Film adı.</li>
         <li><code>duration</code>: Film süresi (dakika).</li>
         <li><code>genre</code>: Film türü.</li>
         <li><code>customers</code>: Filme kayıtlı müşteriler listesi.</li>
      </ul>
   </li>
   <li>
      <strong>Theater (Sınıf):</strong>  
      <code>BaseEntity</code> sınıfından türetilmiştir ve <code>IRegistration</code> arayüzünü uygular. Şunları içerir:
      <ul>
         <li><code>capacity</code>: Maksimum kapasite.</li>
         <li><code>playingMovie</code>: Gösterilen film.</li>
         <li><code>customers</code>: Sinema salonuna kayıtlı müşteriler listesi.</li>
      </ul>
      <code>assignMovie(Movie movie)</code> metodu filmi sinema salonuna atar.
   </li>
   <li>
      <strong>Main Class:</strong>  
      Sistemle etkileşim için menü tabanlı bir arayüz sunar. Şunları yapar:
      <ul>
         <li>Film, müşteri ve sinema salonu ekleme.</li>
         <li>Müşterileri filmlere kaydetme.</li>
         <li>Filmleri sinema salonlarına atama.</li>
         <li>Film ve sinema salonu detaylarını veya bir sinema salonundaki müşterileri listeleme.</li>
      </ul>
   </li>
</ul>

<h2>👨‍💻 Yazar</h2> <p> Bu proje, <strong>Umut Kerim ACAR (ukerma)</strong> tarafından <strong> yapılmıştır. </p>
