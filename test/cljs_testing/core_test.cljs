(ns cljs-testing.core-test
  (:require [cljs-testing.core :as core]
            [cljs.test :refer [deftest is testing]]))

(deftest i-should-succeed
  (is (= 1 1)))

(deftest woot-test
  (is (= core/woot 31337)))
