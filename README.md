# spring-websocket-chat
Web Socket API (WebSockets) Nedir?
* WebSocket API, bir kullanıcının tarayıcısı ve bir sunucu arasında iki yönlü etkileşimli bir iletişim oturumu açmasını mümkün kılan gelişmiş bir teknolojidir.
    bir kullanıcının tarayıcısı = client

* WebSocket iki yönlüdür, HTTP'nin aksine ws:// veya wss:// ile başlar, aynı istemci-sunucu iletişim senaryosunda kullanılan çift yönlü bir protokoldür.

* Websocket durum bilgisi olan bir protokoldür, yani istemci ve sunucu arasındaki bağlantı, taraflardan biri (istemci veya sunucu) tarafından
  sonlandırılıncaya kadar canlı kalır.
  İstemci ve sunucudan herhangi biri tarafından bağlantıyı kapattıktan sonra, bağlantı her iki uçtan da sonlandırılır.

* HTTP tek yönlü bir protokoldür - sunucudan istemciye gönderilen tüm veriler önce istemci tarafından istenmelidir.
  WebSocket ise, UDP'ye benzer, ancak TCP'nin güvenilirliği ile mesaj tabanlı veri göndermeye izin verir.
  WebSocket, ilk aktarım mekanizması olarak HTTP'yi kullanır, ancak HTTP yanıtı alındıktan sonra TCP bağlantısını canlı tutar,
  böylece istemci ve sunucu arasında ileti göndermek için kullanılabilir.

WebSocket Ne Zaman Kullanılır?
* Gerçek zamanlı web uygulamaları : Gerçek zamanlı web uygulaması, arka uç sunucusu tarafından sürekli olarak gönderilen verileri istemci ucunda göstermek için
 bir web soketi kullanır.
 WebSocket'te, veriler zaten açık olan aynı bağlantıya sürekli olarak itilir/iletilir,
 bu nedenle web soketi daha hızlıdır ve uygulama performansını artırır.

* Oyun uygulaması : UI üzerindeki değişikleri websocketler ile sayfayı güncellemeden yapabilirsiniz. Sunucuya istekler websocket üzerinden iletilir.

* Chat Uygulaması : Sohbet uygulaması, mesajı abone arasında değiş tokuş etmek, yayınlamak ve yayınlamak için bağlantıyı yalnızca
bir kez sabitlemek için WebSocket kullanır.


Message Broker Nedir?
* Message broker uygulamaların birbiri ile iletişime geçebilmesini sağlayan bir bileşendir.
Bir uygulamadan aldığı mesajları başka bir uygulamaya ileterek uygulamalar arasında bilgi alış verişini sağlamaktadır.

* Üretici (producer): Mesajların üretildiği bileşendir. mesaj oluşturup message broker’e iletilir.
* Tüketici (consumer): Kuyruğa gelen mesajları izleyen bileşenimizdir. Kuyruktaki mesajları alıp işlemler yürütür.


* Message broker: Mesajları üreticiden alıp tüketiciye ileten bileşene verilen isimdir.
 Sahip olduğu kurallara göre mesajı gerekli kuyruklara iletir.
 Bu kuyruklar aracılığı ile de mesajı tüketiciye teslim eder. Kafka, RabbitMQ, ActiveMQ gibi bileşenler mesaj broker rolünü üstlenirler.


WebSocket ve STOMP protokolleri arasındaki fark nedir?
* STOMP, WebSockets'in üstünde türetilmiştir.
 STOMP, WebSockets kullanılarak istemci ve sunucu arasında mesaj çerçevelerinin nasıl değiş tokuş edildiğine dair birkaç özel yoldan bahseder.

* WebSocketin karşılıklı mesajın gönderme yöntemi de diyebiliriz
