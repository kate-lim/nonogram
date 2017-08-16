(defproject nonogram "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.854"]
                 [lein-doo "0.1.7"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.7"]]
  :main ^:skip-aot nonogram.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :cljsbuild {
    :builds [{:id "test"
              :source-paths ["src/cljs" "test/cljs"]
              :compiler {:output-to "resources/public/test.js"
                         :main nonogram.core-test
                           :optimizations :none
                           :pretty-print true}}
             {:id "prod"
              :source-paths ["src/cljs"]
              :compiler {:output-to "resources/public/core.js"
                         :main nonogram.core
                           :optimizations :whitespace
                           :pretty-print true}}

             {:id "node"
              :source-paths ["src/cljs" "test/cljs"]
              :compiler {:output-to "resources/public/node.js"
                         :main nonogram.core-test
                           :optimizations :none
                         :pretty-print true
                         :target :nodejs
                         }

              }]})

