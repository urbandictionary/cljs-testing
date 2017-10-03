(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-testing.core
   :output-to "out/cljs_testing.js"
   :output-dir "out"})
