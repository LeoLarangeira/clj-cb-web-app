(ns clj-cb-web-app.core
  (:gen-class)
  (:require 
   [ring.adapter.jetty :as jetty]
   [clojure.pprint :as pp]
   [clj-http.client :as http]
   [clj-cb-web-app.webservices.webservices :as wb]
   [clj-cb-web-app.webservices.async :as aswb]
   [clj-cb-web-app.webservices.ping :as ping]
   [clj-cb-web-app.webservices.rssdata :as rss]
   ))


;; echo com pprint para ficar bem k-pop
(defn handler [request]
  {
   :status 200
   :headers {"content-type" "text/clojure"}
   :body "Hello World"
  })

(def youtube-feed "https://www.youtube.com/feed/channels")






(defn -main
  "Roda na porta 3000"
  [& args]
  ;(jetty/run-jetty handler {:port 3000}) 
  ;(pp/pprint (wb/get_headers))
  ;(pp/pprint (wb/get_parameter_handler)) isso retorna um bagulho muito grande! hahahah
  ;(pp/pprint (wb/post_parameter_request))
  ;(pp/pprint (aswb/asyn_get))
  ;(pp/pprint (ping/ping_address))
  ;(pp/pprint (ping/timed_ping "oreilly.com" 5000))
  ;(pp/pprint (rss/parsed-data-to-file))
  ;(pp/pprint (count (take 50 (rss/lazy-stream youtube-feed))))
  )