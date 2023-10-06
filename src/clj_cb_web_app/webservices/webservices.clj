(ns clj-cb-web-app.webservices.webservices
  (:gen-class)
  (:require [clj-http.client :as http]))

(defn get_headers
  "Just making a function to get the headers output"
  []
  (-> (http/get "http://clojure.org")
      :headers
      (get "server")))

(defn get_cookies 
  "Same as the header functiono"
  []
  (-> (http/get "http://www.amazon.com/")
      :cookies
      keys))
;; parameters can be included in both GET and POST request.
(defn get_parameter_handler
  []
  (-> (http/get "http://google.com/"
                {
                 :query-params {:q "clojure"}
                })))

;; using POST 
(defn post_parameter_request
  []
  (-> (http/post "http://example.com"
                 {:form-params {:username "leo123"
                                :password "teste"}})))