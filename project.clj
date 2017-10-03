(defproject cljs-testing "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.2"]
            [lein-cljsbuild "1.1.7"]]
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"
  :cljsbuild {:builds {:test {:source-paths ["src" "test"]
                              :notify-command ["node" "out/test/runner.js"]
                              :compiler {:output-to "out/test/runner.js"
                                         :target :nodejs
                                         :main cljs-testing.tests-runner
                                         :optimizations :simple
                                         :pretty-print true}}}
              :test-commands {"test" ["node" "out/test/runner.js"]}})
