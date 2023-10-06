(ns clj-cb-web-app.webservices.ping
  (:gen-class))

;;mano o livro em si é bom, mas ele é tipo: Toma aqui e boa.

(defn ping_address
  []
  (.isReachable (java.net.InetAddress/getByName "oreilly.com") 5000))

(defn timed_ping
  [domain timeout]
  (let [addr (java.net.InetAddress/getByName domain)
        start (. System (nanoTime))
        result (.isReachable addr timeout)
        total (/ (double (- (. System (nanoTime)) start))1000000.0)]
    {:time total
     :result result}))