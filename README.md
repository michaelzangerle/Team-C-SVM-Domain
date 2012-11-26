Domain Layer
============

Der Aufbau des Domain Layer ist ähnlich wie die Persistenz Schicht. Die Domain Objekte wrappen die Entities und erweitern diese um die Domänenlogik.
Als Zugriffsklasse dient hier die DomainFacade. Diese Klasse stellt auch dieselben Methoden für das Sessionhandling und Transactionhandling bereit. Als Wrapper für die Persistenz DAO dienen die ModelDAOs. Diese abstrahieren den Zugriff auf die Persistenz-Schicht. 
