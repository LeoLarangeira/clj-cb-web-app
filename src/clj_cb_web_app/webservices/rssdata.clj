(ns clj-cb-web-app.webservices.rssdata
  (:gen-class)
  (:require [feedparser-clj.core :as rss]
            [clojure.string :as string]))


(defn parsed-data-to-file
  []
  (let [data (rss/parse-feed (str "https://github.com/clojure-cookbook/clojure-cookbook/"
                                  "commits/master.atom"))
        output-file "output.txt"] ; Nome do arquivo de saída
    (spit output-file (pr-str data)) ; pr-str converte os dados em uma string imprimível
    (println (str "Dados gravados em " output-file))))

