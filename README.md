Domain Layer
============

Der Aufbau des Domain Layer ist �hnlich wie die Persistenz Schicht. Die Domain Objekte wrappen die Entities und erweitern diese um die Dom�nenlogik.
Als Zugriffsklasse dient hier die DomainFacade. Diese Klasse stellt auch dieselben Methoden f�r das Sessionhandling und Transactionhandling bereit. Als Wrapper f�r die Persistenz DAO dienen die ModelDAOs. Diese abstrahieren den Zugriff auf die Persistenz-Schicht. 
