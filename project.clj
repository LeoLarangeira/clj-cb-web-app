(defproject clj-cb-web-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.10.0"]
                 [clj-http "3.12.3"]
                 [http-kit "2.8.0-beta1"] 
                 [org.clojars.scsibug/feedparser-clj "0.4.0"] 
                 [com.draines/postal "2.0.5"]]
  :main ^:skip-aot clj-cb-web-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
