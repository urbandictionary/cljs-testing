(ns cljs-testing.tests-runner
  (:require  [cljs.test :refer [run-all-tests run-tests]]
             ;; [cljs-testing.core-test :as core-test]
             cljs-testing.core-test
             ))

(enable-console-print!)

(run-tests 'cljs-testing.core-test)
