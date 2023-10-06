(ns clj-cb-web-app.core
  (:gen-class)
  (:require 
   [ring.adapter.jetty :as jetty]
   [clojure.pprint :as pp]
   [clj-http.client :as http]
   [clj-cb-web-app.webservices.webservices :as wb]))


;; echo com pprint para ficar bem k-pop
(defn handler [request]
  {
   :status 200
   :headers {"content-type" "text/clojure"}
   :body "Hello World"
  })





(defn -main
  "Roda na porta 3000"
  [& args]
  ;(jetty/run-jetty handler {:port 3000}) 
  (pp/pprint (wb/get_headers))
  ;(pp/pprint (wb/get_parameter_handler)) isso retorna um bagulho muito grande! hahahah
  (pp/pprint (wb/post_parameter_request))
  )