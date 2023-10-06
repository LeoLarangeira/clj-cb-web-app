(ns clj-cb-web-app.webservices.async
  (:gen-class)
  (:require [org.httpkit.client :as hk-client]))

(defn asyn_get
  []
  (-> (hk-client/get "http://example.com"
                {:timeout 1000 ;; ms
                 :query-params {:search "value"}}
                (fn [{:keys [status headers body error]}]
                  (if error
                    (binding [*out* *err*]
                      (println "Failed with, " error))
                    (println body))))))