(ns clj-cb-web-app.webservices.email
  (:gen-class)
  (:require postal.core :refer [send-message]))

(def email "email@goeshere.com")
(def password "password")

(def conn {
            :host "smpt.gmail.com"
            :ssl true
            :user email
            :pass password
})


(defn send
  [message]
  (send-message conn {:from email
                      :to email
                      :subject "A massage from the part"
                      :body message})

 )
