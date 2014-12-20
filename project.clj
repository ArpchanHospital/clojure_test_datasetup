(defproject clojure-test-datasetup "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [midje "1.6.3"]
                 [org.xerial/sqlite-jdbc "3.8.7"]]
  :plugins [[lein-midje "3.1.3"]])
